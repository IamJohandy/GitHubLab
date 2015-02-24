import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ansatt extends Kort {
	
	public Ansatt(String firstName, String lastName, int pinCode) {
		
		super(firstName, lastName, pinCode);
		
		
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
		return "This is a KeyCard of type: Employee\nCreated on " + super.getDate().getTime() + "\nCard is closed: " + isSperret()
				+ "\nPassword needed: " + (officeTime() ? "NO" : "YES");
	}
	
}