
public class Textbook {

	private static String title;
	private static int pages;
	private static String author;
	
	public Textbook(String Title, int Pages, String Author)
	{
		pages = Pages;
		title = Title;
		author = Author;
	}
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Pages: " + pages + "\n"
				+ "Author: " + author;
	}
}
