
public class cv {

	private String nom;
	private String prenom;
	private String formation;
	private String experience;
	private String competences;
	private String attentes;
	
	public cv(String nom, String prenom, String formation, String experience, String competences, String attentes) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.experience = experience;
		this.competences = competences;
		afficher();
	}
	
	private static void afficher() {
		System.out.println("Voici mon CV :\n");
		System.out.println("Nom :\t\t\t" );
		System.out.println("Pr�nom :\t\t\t");
		System.out.println("Formation :\t\t");
		System.out.println("Exp�rience :\t\t");
		System.out.println("Comp�tences :\t\t");
	}
}
