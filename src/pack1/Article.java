package pack1;


public class Article {
	
	private int nbProduit;
	private ConfigFruit produit;
	
	public Article( ConfigFruit produit, int nbProduit) {
		super();
		this.nbProduit = nbProduit;
		this.produit = produit;
	}

	public Article(ConfigFruit produit) {
		super();
		this.nbProduit = 1;
		this.produit = produit;
	}

	public int getNbProduit() {
		return nbProduit;
	}

	public ConfigFruit getProduit() {
		return produit;
	}
	
	public double calculeSousTotaleProd() 
	{
		return produit.getFormuleOffre().calculePromo(nbProduit, produit.getPrixFruit());	
	}

	//reflexion mais moche !!
}
