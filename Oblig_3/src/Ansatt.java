import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Fast {
	private double hourlyPay;
	
	private GregorianCalendar timeEmployed;
	
	public Ansatt(String firstName, String lastName, int pinCode) {
		
		super(firstName, lastName, pinCode);
		hourlyPay = 180;
		setEmploymentDate(2015);
	}
	
	//Overider officeTime
	public boolean officeTime() {
		
		Calendar currentTime = new GregorianCalendar();
		
		if(currentTime.get(Calendar.DAY_OF_WEEK) < 7 
				&& currentTime.get(Calendar.DAY_OF_WEEK) > 1 
				&& currentTime.get(Calendar.HOUR_OF_DAY) > 6 
				&& currentTime.get(Calendar.HOUR_OF_DAY) < 17)
					return true;
		else
			return false;
	}
	
	public boolean checkPIN(int pin) {
		
		if(pin == getPin())
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "This is a KeyCard of type: Employee\nOwner: " + hentFulltNavn() + "\nCreated on " + super.getDate().getTime() + "\nCard is closed: " + isSperret()
				+ "\nPassword needed: " + (officeTime() ? "NO" : "YES");
	}
	
	public double getHourlyPay() {
		return hourlyPay;
	}
	
	public void setHourlyPay(double amount) {
		hourlyPay = amount;
	}
	
	public void setEmploymentDate(int year) {
		timeEmployed = new GregorianCalendar();
		timeEmployed.set(Calendar.YEAR, year);
	}
	
	public void settFornavn(String forNavn) {
		super.firstName = forNavn;
	}
	public String hentFornavn() {
		return super.firstName;
	}
	
	public void settEtternavn(String etterNavn) {
		super.lastName = etterNavn;
	}
	public String hentEtternavn() {
		return super.lastName;
	}
	
	public void settFulltNavn(String fulltNavn) {
		
		String[] splitFulltNavn = fulltNavn.split(" ");
		super.firstName = splitFulltNavn[0];
		
		if(splitFulltNavn.length > 1)
			for(int i = 1;i < splitFulltNavn.length -1; i++ )
				super.firstName += (" " + splitFulltNavn[i]);
			
		super.lastName = splitFulltNavn[splitFulltNavn.length - 1];
	}
	
	public String hentFulltNavn() {
		return super.firstName + " " + super.lastName;
	}
	
	public double beregnKreditt() { //Går ut fra at det bar slik man skulle gjøre det da oppgaven var litt upresis...
		return factor * hourlyPay;
	}
	public double beregnBonus() {
		GregorianCalendar checkTime = new GregorianCalendar();
		int yearsEmployed = checkTime.get(GregorianCalendar.YEAR) - timeEmployed.get(GregorianCalendar.YEAR);
		return factor * yearsEmployed;
	}
	
}