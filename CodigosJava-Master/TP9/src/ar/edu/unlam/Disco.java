package ar.edu.unlam;

import java.util.Scanner;

public class Disco {
	private Double radioInterior, radioExterior;
	private Double superficie;

	public Disco(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	/*
	 * crear una clase que permita modelar un Disco. Se desea conocer: • radio
	 * interior. • radio exterior. • perímetro interior. • perímetro exterior. •
	 * superficie. Debe tener operaciones para cambiar el radio interior y el radio
	 * exterior.
	 */

	public Double perimetroInterior() {
		Double perimetroInterior = (2 * Math.PI * radioInterior);
		return perimetroInterior;
	}

	public Double perimetroExterior () {
		Double perimetroExterior = (2 * Math.PI * radioExterior);
		return perimetroExterior;
	}
	
	public Double superficie () {
		double superficie = Math.PI * (Math.pow(radioExterior, 2) - Math.pow(radioInterior, 2));
		return superficie;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
}