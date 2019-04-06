package com.pluralsight.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the implementation of our Printer. We only write the methods that were abstracted in the Parent Class,
 * leaving the "print" method intact and functional. This is one side of the bridge that takes our Movie and grabs the
 * data we want from it.
 */
public class MoviePrinter extends Printer {

	private Movie movie;
	
	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}
	
	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Title", movie.getTitle()));
		details.add(new Detail("Year", movie.getYear()));
		details.add(new Detail("Runtime", movie.getRuntime()));

		return details;
	}

	@Override
	protected String getHeader() {
		return movie.getClassification();
	}

}
