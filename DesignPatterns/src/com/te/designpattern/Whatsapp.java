package com.te.designpattern;

public class Whatsapp {
private static  Whatsapp Whatsapp;
private Whatsapp() {
}
	static Whatsapp helperMethod() {
		if (Whatsapp==null) {
			Whatsapp=new Whatsapp();
			return Whatsapp;
			
		}
		return Whatsapp;
	}
}

