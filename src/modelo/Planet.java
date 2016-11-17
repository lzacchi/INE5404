package modelo;

import java.io.Serializable;

public class Planet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	enum Planets{MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE}
	public double mass; // in kg
	public double radius; // in meters
	
	public static final double G = 6.67300E-11; // Gravitational Constant (m3 kg-1 s-2)
	
	public Planet(double m, double r){
		this.mass = m;
		this.radius = r;
		surfaceGravity();
	}
	
	public double surfaceGravity(){
		return G*mass / (radius * radius);
	}
	public double mass(){return mass;}
	private double radius(){return radius;}
}
