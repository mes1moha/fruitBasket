package pack1;

import java.util.Scanner;

public class FruitBasketApp {
	
	private final static int POMME = 1;
	private final static int ORANGE = 2;
	private final static int PASTEQUE = 3;
	private final static FormuleOffre FORMULE_BUY1GET1 = new FormuleOffre(1, 1, 1);
	private final static FormuleOffre FORMULE_BUY3GET2 = new FormuleOffre(3, 2, 1);;
	
	
	public static void main(String[] args) {
				
		NoteAchat ticket = new NoteAchat();
		Scanner sc = new Scanner (System.in);
		String exitOrContinue ="";
		int choix = 0;
		int qte = 0; 
		
		
		while(!exitOrContinue.equals("*"))
		{
			System.out.println(POMME+" Pour Pomme \n"+ORANGE+" Pour Orange \n"+PASTEQUE+" Pour pastèque \n -> ");
			choix = sc.nextInt();
			System.out.println("Quantité : ");
			qte = sc.nextInt();
			
			switch (choix) {
			case POMME:
				ticket.ajoutArticle(new Article(
							new ConfigFruit(NomFruit.POMME, 0.2, FORMULE_BUY1GET1), 
							qte) );
				break;
			case ORANGE:
				ticket.ajoutArticle(new Article(
						new ConfigFruit(NomFruit.ORANGE, 0.5, new FormuleOffre()), 
						qte) );
				break;
			case PASTEQUE:
				ticket.ajoutArticle(new Article(
						new ConfigFruit(NomFruit.PASTEQUE, 0.8, FORMULE_BUY3GET2), 
						qte) );
				break;
			default:
				System.out.println("L'article n'existe pas");
				break;
			}
			System.out.println("Tapez * Pour quitter ou n'importe quelle touche pour Continuer");
			exitOrContinue = sc.next();
		}
		
		System.out.println("=====>"+ ticket.calculeTotale());
		sc.close();
	}

}
