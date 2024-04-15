package service;

public class circulo extends Figura {
	private int radio;	
	public circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	
	
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	@Override
	public double area() {
		return Math.PI*radio*radio;
	}

	
}
