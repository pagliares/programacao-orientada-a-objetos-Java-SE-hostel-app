package pagliares.jsr203.nio2;

import java.io.IOException;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.*;

public class ExemploMonitoramentoArquivo {

    private Path caminho;
    private WatchService observador;

    // pode ser arquivo ou diretorio
    public ExemploMonitoramentoArquivo(String path) {
        // Passo 1: Obter uma referência para o arquivo/diretório a ser monitorado
        caminho = Paths.get(path);
        try {
            // Passo 2: Criar um objeto observador
            observador = FileSystems.getDefault().newWatchService();
            
            // Passo 3: Registrar o observador e os eventos desejados com a referência
            caminho.register(observador,ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }

    private void monitorar() {
        WatchKey key = null;
        System.out.println("Monitorando a criação de arquivos/diretório em ..: " + caminho + " CRTL-C para sair");
        // Passo 4: loop infinito
        while (true) {
            try {
                // Passo 5: Suspender a thread de execução até que um evento seja gerado
                key = observador.take();
                
                // Passo 6: Processar cada um dos eventos
                for (WatchEvent<?> evento : key.pollEvents()) {
                    Kind<?> tipoEvento = evento.kind();
                    System.out.println("Evento ocorrido em " + evento.context() + " é " + tipoEvento);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            }            
            // Passo 7: Esvaziar o objeto contendo os eventos 
            boolean reset = key.reset();
            if (!reset) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ExemploMonitoramentoArquivo monitoramento = new ExemploMonitoramentoArquivo("D:\\temp");
        monitoramento.monitorar();
    }
}
