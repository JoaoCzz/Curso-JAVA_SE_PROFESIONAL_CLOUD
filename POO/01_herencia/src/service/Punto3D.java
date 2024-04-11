package service;

public class Punto3D extends Punto {
private int z;
	
	public Punto3D(int z){
		this.z=z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public void imprimir() {
		//System.out.println("Las coordenadas sonxddddd: "+getX()+","+getY()+","+getZ());
		super.imprimir();
		System.out.println(","+z );
	}
}
