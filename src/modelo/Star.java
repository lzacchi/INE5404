package modelo;

import java.io.Serializable;

public class Star implements Serializable {

	private static final long serialVersionUID = 1L;

	public double mass;
	public double radius;
	public static final double G = 6.67300E-11; // Gravitational Constant (m3 kg-1 s-2)
	
	public Star(double m, double r){
		this.mass = m;
		this.radius = r;
		surfaceGravity();
	}
	
	public double surfaceGravity(){
		return G*mass / (radius*radius);
	}
}
