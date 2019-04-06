package com.pluralsight.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");

		// The printFormatter forms the bridge between the Movie (above) and the Printer (below).

		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printedMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printedMaterial);
		
		Formatter htmlFormatter = new HtmlFormatter();

		// Because the Formatter has no understanding of what a Movie is, we can provide it any type and it will extract
		// the data it needs to constuct the String. The Printer has no understanding of what kind of Formatter it has,
		// and will just output whatever the Formatter says is right. We therefore abstract fully between a Movie and a
		// MoviePrinter, such that the Movie object could change design, as could the Formatter but it would all still
		// work.
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		
		System.out.println(htmlMaterial);
	}

}
