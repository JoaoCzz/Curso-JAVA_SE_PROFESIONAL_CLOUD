package service;

public class triangulo extends Figura implements Operaciones{
	private int base,altura;
	public triangulo(String color, int base, int altura) {
		super(color);
		this.base=base;
		this.altura=altura;
		
	}
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base*altura/2;
	}
	@Override
	public void girar(int grados) {
		grados-=360;
		
	}
	@Override
	public int invetir() {
		
		return 180;
	}
	
	
	
	}
