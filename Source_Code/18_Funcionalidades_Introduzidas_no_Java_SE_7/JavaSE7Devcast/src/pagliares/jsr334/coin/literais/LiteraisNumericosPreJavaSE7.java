/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagliares.jsr334.coin.literais;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author pagliares
 */
public class LiteraisNumericosPreJavaSE7 {

    public static void main(String[] args) {
        /**
         * *************************** Alguns literais - pré-Java SE 7 *******************************************
         */
        
        byte numeroDecimal = 20;
        byte numeroHexadecimal = 0x0001A;
        int numeroOctal = 070321;
        
        System.out.println("Número decimal conforme definido..: " + numeroDecimal);
        System.out.println("Número binário correspondentea o decimal " + numeroDecimal + "..: " + Integer.toBinaryString(numeroDecimal));

        System.out.printf("Número hexadecimal conforme definido..: %x \n", numeroHexadecimal);
        System.out.println("Número hexadecimal na base 10..: " + numeroHexadecimal);

        System.out.printf("Número octal conforme definido...: %o \n", numeroOctal);
        System.out.println("Número octal na base 10..: " + numeroOctal);

        /**
         * **************** somente no Java SE 7 podemos usar 0bxxxx parar representar números binários ****************
         */
        
        int numeroBinario = 0b1000_0111_1111_0000_1110;
        
        System.out.println("Número binário..: " + numeroBinario);
        System.out.println("Número binário..: " + Integer.toBinaryString(numeroBinario));

        /**
         * **************** Facilidade de leitura fornecida no Java SE 7 para números com muitos algarismos ************
         */
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int matricula = 2011_01_35;
        double dozeMilhoes = 12_000_000.00;
        int segundoNumeroBinario = 0b1011_1111_0001_1010_0010;

        System.out.printf("Matrícula...: %d\n", matricula);
        System.out.println("Número decimal...: " + nf.format(dozeMilhoes));
        System.out.println("Número decimal...: " + Integer.toBinaryString(segundoNumeroBinario));
    }
}
