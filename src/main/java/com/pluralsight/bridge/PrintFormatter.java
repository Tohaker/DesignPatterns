package com.pluralsight.bridge;

import java.util.List;

/**
 * Here we implement one example of our Bridge. It only uses the method it inherited and works with the data to format
 * it in SOME way.
 */
public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");

		for (Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}

		return builder.toString();
	}
}
