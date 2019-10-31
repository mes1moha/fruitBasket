package pack1;

public class FormuleOffre {

	private int nbPcsMustBy;
	private int nbPcsOffre;
	private double tauxReduction;
	
	public FormuleOffre() {
		super();
		nbPcsOffre = 0;
		tauxReduction = 1;
	}

	public FormuleOffre(int nbPcsMustBy, int nbPcsOffre, double tauxReduction) {
		super();
		this.nbPcsMustBy = nbPcsMustBy;
		this.nbPcsOffre = nbPcsOffre;
		this.tauxReduction = tauxReduction;
	}
	
	public int getNbPcsMustBy() {
		return nbPcsMustBy;
	}
	public void setNbPcsMustBy(int nbPcsMustBy) {
		this.nbPcsMustBy = nbPcsMustBy;
	}
	public int getNbPcsOffre() {
		return nbPcsOffre;
	}
	public void setNbPcsOffre(int nbPcsOffre) {
		this.nbPcsOffre = nbPcsOffre;
	}
	
	public void setTauxReduction(double nouvTaux)
	{
		tauxReduction = (Math.abs(tauxReduction)>1) ? 1 : Math.abs(nouvTaux);
	}
	
	public boolean offreActive() {
		return nbPcsOffre!=0 || tauxReduction!=1;
	}

	public double calculePromo(int nbPcs, double prixFruit) {
		double total = 0.0;
		//int nbPcsADonner ;
		if( offreActive() )
		{
			while(nbPcs >= nbPcsMustBy)
			{
				total += nbPcsMustBy * prixFruit;
				nbPcs -= nbPcsMustBy + nbPcsOffre ;
			}
		}
		total += (nbPcs!=0)? (nbPcs * prixFruit) : 0;
		return total;
	}
	
}
