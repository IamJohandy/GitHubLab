import java.util.Scanner;

public class SnuTekst {
	static int antallTegn = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn ønsket tekst du vil snu: ");
		String str = input.nextLine();
		System.out.print("Din string baklengs er: ");
		baklengs(str);
		System.out.println("Antall tegn som ble snudd: " + antallTegn);
	}
	
	public static void baklengs(String tekst) {
		int lengde = tekst.length();
		if(lengde == 1){
			System.out.println(tekst.charAt(0));
			antallTegn++;
		}
		else {
			System.out.print(tekst.charAt(lengde - 1));
			tekst = tekst.substring(0, tekst.length()-1);
			antallTegn++;
			baklengs(tekst);
		}
	}
}
