package com.yyq.inter;

public class UppLetter implements ChangeLetter {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String change() {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

}
