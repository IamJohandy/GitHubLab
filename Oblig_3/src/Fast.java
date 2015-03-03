
public interface Fast {
	final double factor = 1.25;
	
	public void settFornavn(String forNavn);
	public String hentFornavn();
	
	public void settEtternavn(String etterNavn);
	public String hentEtternavn();
	
	public void settFulltNavn(String fulltNavn);
	public String hentFulltNavn();
	
	public double beregnKreditt();
	public double beregnBonus();
	
}
