package gedzis.fwd.application.model;

public class Straipsnis {
	private String pavadinimas;
	private String adresas;

	
	public Straipsnis(String pavadinimas, String adresas) {
		super();
		this.pavadinimas = pavadinimas;
		this.adresas = adresas;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAdresas() {
		return adresas;
	}

	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}

}
