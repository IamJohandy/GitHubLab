import java.util.Scanner;

public class Oppgave2 {
	static int antallForflyttninger = 0;
	static int antallKall = 0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn antall disker: ");
		int n = input.nextInt();
		
		System.out.println("Følgende forflyttninger er gjort: ");
		flyttDisk(n, 'A', 'B', 'C');
		System.out.println("Antall forflyttninger: " + antallForflyttninger);
	}
	
	public static void flyttDisk(int n, char fraTaarn, char tilTaarn, char auxTaarn) {
		if(n==1) {
			System.out.println("Flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
			antallForflyttninger++;
		}
		else{
			flyttDisk(n - 1, fraTaarn, auxTaarn, tilTaarn);
			System.out.println("Flytt disk " + n + " fra " + fraTaarn + " til " + tilTaarn);
			antallForflyttninger++;
			flyttDisk(n - 1, auxTaarn, tilTaarn, fraTaarn);
		}
	}
}
