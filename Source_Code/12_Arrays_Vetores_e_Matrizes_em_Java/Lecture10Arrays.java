package lecture10;

import lecture10.model.Address;
import lecture10.model.Customer;
import lecture10.model.Title;
import lecture10.model.TitlePreJava5;


public class Lecture10Arrays {

	public static void main(String[] args) {
		
		int [ ] numbers = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println();
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for (int x: numbers) {  // Pos Java 5 - for each
			System.out.println(x);
		}
		
		String [ ] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		names[0] = "Florentino";
		names[1] = "Fermina";
		names[2] = "Aureliano";
		
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		String [ ] weekend = {"Saturday", "Sunday"};
		System.out.println();
		
		for (int i = 0; i < weekend.length; i++) {
			System.out.println(weekend[i]);
		}
		
//		String [] weekend2 = new String[2];
//		weekend2[0] = "Saturday";
//		weekend2[1] = "Sunday";
		
		Customer [ ] customers = new Customer[2];
		
		Customer florentino = new Customer();
		
		Address address = new Address();
		address.setAddress("Calle Velazquez");
		
		florentino.setName("Florentino");
		florentino.setTitle(Title.DR);
		
		florentino.setAddress(address);
		
		customers[0] = florentino;
		
		Customer fermina = new Customer("Fermina", "Daza");
		
		customers[1] = fermina;
		
//		String name = null;
//		Customer temp = null;
		System.out.println();
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].getName());
		}
	
		// int  [] [] twoDimensions = new int [2][2];
		
	   int  [] [] twoDimensions = new int [2][];
	    twoDimensions[0] = new int [2];
		twoDimensions[1] = new int [5];
		
		// int  [] [] twoDimensions = new int [][2];  Invalid !
		
//		System.out.println(twoDimensions.length);
//
//		System.out.println(twoDimensions[0].length);
//		
//		System.out.println(twoDimensions[1].length);

		 for (int i = 0; i < twoDimensions.length; i++) {
			 for (int j = 0; j < twoDimensions[i].length; j++) {
				 twoDimensions[i][j] = (int)(Math.random() * 10);
				 System.out.println(twoDimensions[i][j]);
			 }
		 }
		 
		int [] arrayTest = new int[3];
		
		arrayTest = new int[10];  // outro array. NAO e o primeiro array redimensionado
		
	}

}
