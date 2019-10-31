package pack1;

public class ConfigFruit {
	
	private NomFruit nomFruit;
	private double prixFruit;
	private FormuleOffre formuleOffre;
	
	public ConfigFruit(NomFruit nomFruit, double prixFruit, FormuleOffre formuleOffre) {
		super();
		this.nomFruit = nomFruit;
		this.prixFruit = prixFruit;
		this.formuleOffre = formuleOffre;
	}

	public NomFruit getNomFruit() {
		return nomFruit;
	}

	public double getPrixFruit() {
		return prixFruit;
	}

	public void setPrixFruit(double prixFruit) {
		this.prixFruit = prixFruit;
	}

	public FormuleOffre getFormuleOffre() {
		return formuleOffre;
	}

	public void setFormuleOffre(FormuleOffre formuleOffre) {
		this.formuleOffre = formuleOffre;
	}
	
	
}
