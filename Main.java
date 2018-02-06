
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez Barette!");
		System.out.println();
		System.out.println();
		
		CV cvJane = new CV("Menassa", "Jane-Mary", "Dipl\u00f4me d'\u00e9tude secondaire", "Pas d'exp\u00e9rience de travail", "Bonne \u00e9l\u00e8ve, ponctuel, travaillante, professionelle, sociable, d\u00e9vou\u00e9e", "Travailler dans un environement sain avec des coll\u00e8gues professionel.");
		CV cvPhilippe = new CV("Viau","Philippe","Travail à temps partiel","employé model bien apprécié par ses collègues","souriant","bonne éthique et attitude au travail");
		CV cvEmile = new CV("Brunelle", "\u00c9mile", "Soutien informatique", "4 ans au soutien technique", "Windows Server, D\u00e9pannage de PC", "Bonnes conditions de travail.");
		
		cvJane.afficher();
		cvPhilippe.afficher();
		cvEmile.afficher();
	}

}
