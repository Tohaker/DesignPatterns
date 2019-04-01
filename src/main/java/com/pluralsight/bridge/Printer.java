package com.pluralsight.bridge;

import java.util.List;

/**
 * We want to bridge between Printers and Movies. We don't know what details the Movie will have, only that it will have
 * them. The same goes for the Header. This abstracts those details by providing the formatter bridge that goes and gets
 * the Movie.
 */
public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
