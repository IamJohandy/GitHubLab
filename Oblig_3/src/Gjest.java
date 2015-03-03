import java.util.*;

public class Gjest extends Kort {
	
	private Calendar dateOfTermination;
	
	public Gjest(String firstName, String lastName, int pinCode) {
		
		super(firstName, lastName, pinCode);
		
		this.dateOfTermination = new GregorianCalendar();
		this.dateOfTermination.set(Calendar.DAY_OF_MONTH, (dateOfTermination.get(Calendar.DAY_OF_MONTH) + 7));
		
	}
	
	public boolean checkPIN(int pin) {
		
		if(pin == getPin())
			return true;
		else
			return false;
	}
	
	//Overider kort checkDate
	public boolean checkDate() {
		Calendar currentDate = new GregorianCalendar();
		if(currentDate.before(dateOfTermination) && currentDate.after(getDate()))
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "This is a KeyCard of type: Guest\n Owner: " + super.firstName + " " + super.lastName + "\nCreated on "
				+ super.getDate().getTime() + "\nCard is closed: " + isSperret() 
					+ "\nCard will be closed: " + dateOfTermination.getTime() + "\nPassword needed: Always";
	}
	
}