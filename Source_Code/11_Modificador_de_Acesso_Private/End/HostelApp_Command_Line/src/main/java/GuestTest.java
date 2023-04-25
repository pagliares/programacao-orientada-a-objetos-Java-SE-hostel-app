import com.hostelapp.Guest;

public class GuestTest {

    public static void main(String[] args) {
       com.hostelapp.Guest guest1 = new com.hostelapp.Guest();

       guest1.setFirstName("Florentino");

       guest1.setLastName("Ariza");

       Guest guest2 = new Guest();

       guest2.setFirstName("Fermina");
       guest2.setLastName("Daza");

       System.out.println("Guest 1 - First name: " + guest1.getFirstName());
       System.out.println("Guest 1 - Last name: " + guest1.getLastName());
       System.out.println();
       System.out.println("Guest 2 - First name: " + guest2.getFirstName());
       System.out.println("Guest 2 - Last name: " + guest2.getLastName());
       System.out.println();


       Guest guest3 = new Guest();

       boolean answer = guest3.setFirstName("Z");

       guest3.setLastName("xyz1");
       if (answer) {
          System.out.println("Guest 3 - First name: " + guest3.getFirstName());
          System.out.println("Guest 3 - Last name: " + guest3.getLastName());
          System.out.println();
       }

    }
}
