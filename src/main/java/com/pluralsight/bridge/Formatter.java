package com.pluralsight.bridge;

import java.util.List;

/**
 * This is the heart of how Bridging works. We define an interface for future formatters to implement, that defines the
 * core of what we want to do - in this case we want to format text from a source that contains Strings and Details.
 * We don't know, or need to know, HOW it will do it, only that there will be parts to plug into each end of the
 * method(s).
 */
public interface Formatter {
	String format(String header, List<Detail> details);
}
