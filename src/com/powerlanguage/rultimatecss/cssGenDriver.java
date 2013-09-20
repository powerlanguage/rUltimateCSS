package com.powerlanguage.rultimatecss;

import java.io.IOException;

public class cssGenDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CssGenerator cssgen = new CssGenerator();
		try {
			cssgen.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
