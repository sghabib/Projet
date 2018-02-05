
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez barette!");
		
		createCV();
		

	}
	
	private static void createCV(){
		
		CV cvJane = new CV("Menassa", "Jane-Mary", "Diplôme d'étude secondaire", "Pas d'experience de travail", "Bonne élève, ponctuel, travaillante, professionel, sociable, dévouée", "Travailler dans un environement sain avec des collegues professionel.");
		CV cvPhilippe = new CV("","","","","","");
		CV cvEmile = new CV("Brunelle", "Émile", "Soutien informatique", "4 ans au soutien technique", "Windows Server, Dépannage de PC", "Bonnes conditions");
		
	}


}
