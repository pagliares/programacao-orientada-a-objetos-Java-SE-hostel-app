package pagliares.jsr203.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipuladorArquivos {

    private Path diretorioBase;

    public ManipuladorArquivos(Path diretorioBase) throws IllegalArgumentException {
        if (!Files.isDirectory(diretorioBase))
            throw new IllegalArgumentException("Caminho não é um diretório");
         
        this.diretorioBase = diretorioBase;
    }

    public Path criarArquivo(String nome) throws IOException {       
        Path caminho = concatenar(diretorioBase, nome);
        return Files.createFile(caminho);
         
    }

    public boolean removerArquivo(String nome) throws IOException {
        Path caminho = concatenar(diretorioBase, nome);
        return Files.deleteIfExists(caminho);
    }

    public void copiarArquivo(String nomeArquivoOrigem, String nomeArquivoDestino, Path diretorioDestino) throws IllegalArgumentException, IOException {
         if (!Files.isDirectory(diretorioDestino))
            throw new IllegalArgumentException("Caminho não é um diretório");
         Path caminhoOrigem = concatenar(diretorioBase, nomeArquivoOrigem);
         Path caminhoDestino = concatenar(diretorioDestino,nomeArquivoDestino);
         Files.copy(caminhoOrigem, caminhoDestino, REPLACE_EXISTING, COPY_ATTRIBUTES);
    }

    public Path moverArquivo(String nomeArquivoOrigem, Path diretorioDestino) throws IOException {
        if (!Files.isDirectory(diretorioDestino))
            throw new IllegalArgumentException("Caminho não é um diretório");
         Path caminhoOrigem = concatenar(diretorioBase, nomeArquivoOrigem);
         Path caminhoDestino = concatenar(diretorioDestino,nomeArquivoOrigem);
        return Files.move(caminhoOrigem, caminhoDestino, REPLACE_EXISTING);
    }
    
    private Path concatenar(Path diretorioBase, String nomeArquivo) {
          String caminhoCompleto = diretorioBase.toString() + "\\" + nomeArquivo;
          return Paths.get(caminhoCompleto);        
    }

    public static void main(String[] args) {
        Path diretorioInicial = Paths.get("D:\\temp");
        ManipuladorArquivos ma = new ManipuladorArquivos(diretorioInicial);
        try {
           // ma.criarArquivo("origem.txt");
            Path diretorioDestino = Paths.get("C:\\temp");
            ma.moverArquivo("origem.txt", diretorioDestino);
        } catch (IOException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }
}
