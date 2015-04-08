
public class Magazine {
	private static String title;
	private static int edition;
	private static int pages;
	
	public Magazine(String Title, int Edition, int Pages)
	{
		title = Title;
		edition = Edition;
		pages = Pages;
	}
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Edition: " + edition + "\n" + "Pages: " + pages + "\n";
	}
}
