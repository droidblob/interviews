package com.droidblob.arrayprinter;

import java.util.Iterator;

class SpiralArrayPrinter {

	public void print(final char[][] array) {
		final Iterator<String> iterator = new SpiralIterator(array);
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
}