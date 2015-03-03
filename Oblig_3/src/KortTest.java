import java.util.*;

public class KortTest {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole", "Olsen", 1234);
        Kort k2 = new Gjest("Marit", "Olsen", 9999);
        Kort k3 = new Ansatt("Johan", "Dyrhaug", 1234);
        Kort k4 = new Gjest("Sigmund", "Dyrhaug", 9999);
        Kort k5 = new Ansatt("Petter", "Lervik", 1234);
        
        reg.add(k1);
        reg.add(k2);
        reg.add(k3);
        reg.add(k4);
        reg.add(k5);
        
        try {
        Kort clonedKort = (Kort)k3.clone();
        reg.add(clonedKort);
        }
        catch(CloneNotSupportedException e) {
        	System.out.println("CloneNotSupportedException");
        	System.exit(1);
        }
        
        java.util.Collections.sort(reg);
        for(int i = 0;i < reg.size();i++) {
        	Kort kor = (Kort)reg.get(i);
        	System.out.println(kor.getName());
        }
        
        System.out.println();
        
        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.checkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Test av kort: med kode 9999 er" + (kort.checkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Kortnummer: " + kort.getCardNumber());
            System.out.println();
        }
//        
//        while(true) { //test for dato-begrensninger
//        	
//        	Calendar currentDate = new GregorianCalendar();
//        	int testDato = input.nextInt("skriv inn ett tall for å teste tid...");
//        	System.out.println("Date is clear: " + k2.checkDate() + "\nDate compared: " + currentDate.getTime());
//        	System.out.println("Is it office time: " + k1.officeTime());
//        	
//        }
    }
}