package com.ibm.iagro.util;

public class Utilities {
	public Float convertStringToFloat(String str) {
		return Float.parseFloat(str.replace(",", "."));
	}

}
