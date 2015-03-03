import java.util.*;

public abstract class Kort implements Comparable<Kort>, Cloneable {
	
	protected String lastName;
	protected String firstName;
	
	private int pinCode;
	
	private int kortNummer;
	private static int antallKort;
	
	private boolean cardClosed = false; //aksesskode???
	
	private Calendar dateCreated;
	
	public Kort() {
		
	}
	
	public Kort(String firstname, String lastname, int pin) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.pinCode = pin;
		this.kortNummer = ++antallKort;
		
		this.dateCreated = new GregorianCalendar();	
	}
	
	public int compareTo(Kort k) {
		if(this.lastName.equals(k.lastName))
			if(this.firstName.equals(k.firstName))
				return 0;
			else
				return this.firstName.compareTo(k.firstName);
		else
			return this.lastName.compareTo(k.lastName);
	}
	
	public Object clone() throws CloneNotSupportedException {
    	Kort kortClone = (Kort)super.clone();
    	kortClone.lastName = new String(this.lastName);
    	kortClone.firstName = new String(this.firstName);
    	kortClone.pinCode = (this.pinCode);
    	kortClone.kortNummer = (this.kortNummer);
    	kortClone.dateCreated = this.dateCreated;
    	kortClone.cardClosed = this.cardClosed;
    	return kortClone;
	}
    	
	public boolean isSperret() {
		return cardClosed;
	}
	
	public String getName() {
		return lastName + ", " + firstName;
	}
	
	public String toString() {
		return "Kortholders navn: " + getName() + "\nKortnummer: " + kortNummer 
				+ "\nPIN kode: " + pinCode + "\nSperret: " + isSperret();
	}
	
	public abstract boolean checkPIN(int pin);
	
	protected int getPin() {
		return pinCode;
	}
	
	public Calendar getDate() {
		return this.dateCreated;
	}
	
	public boolean checkDate() {
		return false;
	}
	
	public boolean officeTime() {
		return false;
	}
	
	public int getCardNumber() {
		return kortNummer;
	}
}