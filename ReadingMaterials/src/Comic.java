
public class Comic {
	
	private static String title;
	private static String author;
	private static int volume;
	
	public Comic(String Title, String Author, int Volume)
	{
		title = Title;
		author = Author;
		volume = Volume;
	}
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Author: " + author + "\n" + "Volume: " + volume
				+ "\n";
	}
}
