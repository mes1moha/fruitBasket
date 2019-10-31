package pack1;

import java.util.ArrayList;
import java.util.List;

public class NoteAchat {
	
	private List<Article> listeFruits;

	public NoteAchat(List<Article> listeFruits) {
		super();
		this.listeFruits = listeFruits;
	}

	public NoteAchat() {
		super();
		this.listeFruits = new ArrayList<Article>();
	}
	
	public void ajoutArticle(Article nouvArticle)
	{
		this.listeFruits.add(nouvArticle);
	}
	
	public double calculeTotale()
	{
		double totalNote = 0.0;
		for (Article article : listeFruits) {
			totalNote += article.calculeSousTotaleProd();
			System.out.println(article.getProduit().getNomFruit()+ " " +article.calculeSousTotaleProd());
		}
		return totalNote;
	}

}
