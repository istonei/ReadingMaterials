
public class ReadingMaterials {

	public static void main(String[] args) {
		
		Books books = new Books("Harry Potter", "JK Rowling", 309);
		Comic comic = new Comic("Dragonballz", "Akira Toriyama", 22);
		Magazine magazine = new Magazine("Sports Illustrated", 95, 45);
		Textbook textbook = new Textbook("Intro To Programming", 504, "Pearson");
		
		System.out.println(books);
		System.out.println(comic);
		System.out.println(magazine);
		System.out.println(textbook);
		
	}

}
