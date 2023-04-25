/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagliares.jsr334.coin.instrucaoswitch;

/**
 *
 * @author pagliares
 */
public class SwitchPreJavaSE7 {
    
    // possível a partir do Java SE 5
    public enum Status{ PENDENTE, CONFIRMADA, CANCELADA };

    public static final int PENDENTE = 0;
    public static final int CONFIRMADA = 1;
    public static final int CANCELADA = 2;

      public void processarReserva(int status) {
        switch (status) {
            case PENDENTE:
                enviarEmailHospede();
                break;
            case CONFIRMADA:
                emitirComprovante();
                break;
            case CANCELADA:
                efetivarReembolso();
        }
    }
      
      public void processarReserva(Status status) {
        switch (status) {
            case PENDENTE:
                enviarEmailHospede();
                break;
            case CONFIRMADA:
                emitirComprovante();
                break;
            case CANCELADA:
                efetivarReembolso();
        }
    }
      
       public void processarReserva(String status) {
        if (status.equals("PENDENTE")) {
            enviarEmailHospede();
        } else if (status.equals("CONFIRMADA")) {
            emitirComprovante();
        } else if (status.equals("CANCELADA")) {
            efetivarReembolso();
        }
    }

    private void enviarEmailHospede() {
        System.out.println("E-mail enviado");
    }

    private void emitirComprovante() {
        System.out.println("Comprovante gerado");
    }

    private void efetivarReembolso() {
        System.out.println("Reembolso feito com sucesso");
    }
}
