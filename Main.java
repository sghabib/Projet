
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez barette!");
		
		createCV();
		

	}
	
	private static void createCV(){
		
		CV cvJane = new CV("Menassa", "Jane-Mary", "Dipl�me d'\u00e9tude secondaire", "Pas d'experience de travail", "Bonne \u00e9l�ve, ponctuel, travaillante, professionel, sociable, d\u00e9vou\u00e9e", "Travailler dans un environement sain avec des collegues professionel.");
		CV cvPhilippe = new CV("","","","","","");
		CV cvEmile = new CV("Brunelle", "\u00c9mile", "Soutien informatique", "4 ans au soutien technique", "Windows Server, D\u00e9pannage de PC", "Bonnes conditions");
		
	}


}
