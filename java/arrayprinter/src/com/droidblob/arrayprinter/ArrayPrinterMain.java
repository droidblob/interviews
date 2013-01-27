package com.droidblob.arrayprinter;

public class ArrayPrinterMain {
	
	public static void main(final String[] args) {
		final char[][] array = {
				{ 'C', 'O', 'M', 'P' },
				{ 'Z', 'E', 'D', 'U' },
				{ 'I', 'R', 'E', 'T' },
		};
		
		final SpiralArrayPrinter printer = new SpiralArrayPrinter();
		printer.print(array);
	}
}