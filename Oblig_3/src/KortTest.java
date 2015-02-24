import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KortTest {
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
    	
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole", "Olsen", 1234);
        Kort k2 = new Gjest("Marit", "Olsen", 9999);
        reg.add(k1);
        reg.add(k2);
        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.checkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Test av kort: med kode 9999 er" + (kort.checkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
            System.out.println();
        }
        
        while(true) { //test for dato-begrensninger
        	
        	Calendar currentDate = new GregorianCalendar();
        	int testDato = input.nextInt();
        	System.out.println("Date is clear: " + k2.checkDate() + "\nDate compared: " + currentDate.getTime());
        	System.out.println("Is it office time: " + k1.officeTime());
        	
        }
    }
}