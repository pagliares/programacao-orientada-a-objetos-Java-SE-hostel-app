package pagliares.jsr334.coin.try_com_recursos;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class TryComRecursosPreJavaSE7 {
    private String arquivo;

    public TryComRecursosPreJavaSE7(String arquivo) {
        this.arquivo = arquivo;
    }      
    
    public void gravar(String mensagem) {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(arquivo);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(mensagem);             
        } catch (IOException e) {
            System.err.print(e.getMessage());                  
        } finally {
            try {
                fileOutputStream.close();
                dataOutputStream.close();
            } catch (IOException e) {
                // gravar no log
            }
        }
    }

    public static void main(String[] args)  {
        TryComRecursosPreJavaSE7 t = new TryComRecursosPreJavaSE7("palestra.txt");
        t.gravar("Novidades do Java SE 7");    
     }
}
