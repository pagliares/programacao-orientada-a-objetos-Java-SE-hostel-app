package pagliares.jsr334.coin.try_com_recursos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryComRecursosJavaSE7 {

    private String arquivo;

    public TryComRecursosJavaSE7(String arquivo) {
        this.arquivo = arquivo;
    }

    public void gravar(String mensagem) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(arquivo);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);) {

            dataOutputStream.writeUTF(mensagem);
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }

    public static void main(String[] args){
        TryComRecursosJavaSE7 t = new TryComRecursosJavaSE7("palestra.txt");
        t.gravar("Novidades do Java SE 7");      
    }
}
