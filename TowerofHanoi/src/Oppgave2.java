import java.util.Scanner;

public class Oppgave2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Følgende forflyttninger er gjort: ");
		flyttDisk(n, 'A', 'B', 'C');
	}
	
	public static void flyttDisk(int n, char fraTaarn, char tilTaarn, char auxTaarn) {
		if(n==1)
			System.out.println("Flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
		else{
			flyttDisk(n - 1, fraTaarn, auxTaarn, tilTaarn);
			System.out.println("Flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
			flyttDisk(n - 1, auxTaarn, tilTaarn, fraTaarn);
		}
	}
}
