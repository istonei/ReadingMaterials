
public class Books {
	private static String title;
	private static String author;
	private static int pages;
	
	public Books (String Title, String Author, int Pages)
	{
		title = Title;
		author = Author;
		pages = Pages;
	}
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Author: " + author + "\n" + "Pages: " + pages + "\n";
	}
}
