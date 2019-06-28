package com.rocky.solid.oc.bad;

/**
 * Created by mrk on 4/7/14.
 */
public class Greeter {
	String formality;

	public String greet() {
		if (this.formality.equalsIgnoreCase("formal")) {
			return "Good evening, sir.";
		} else if (this.formality.equalsIgnoreCase("casual")) {
			return "Sup bro?";
		} else if (this.formality.equalsIgnoreCase("intimate")) {
			return "Hello Darling!";
		} else {
			return "Hello.";
		}
	}

	public void setFormality(String formality) {
		this.formality = formality;
	}
}
