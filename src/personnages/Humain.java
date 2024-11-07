package personnages;

public class Humain {
	private String blaze;
	private String gourmandiseLiquidePref;
	private int moulaga;
	
	public Humain(String blaze, String gourmandiseLiquidePref, int moulaga) {
		this.blaze=blaze;
		this.gourmandiseLiquidePref=gourmandiseLiquidePref;
		this.moulaga=moulaga;
	}
	
	public String parler(String texte) {
		return this.blaze + texte;
	}
}
