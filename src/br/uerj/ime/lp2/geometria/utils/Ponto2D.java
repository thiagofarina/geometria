package br.uerj.ime.lp2.geometria.utils;

public class Ponto2D {
	private float x;
	private float y;
	
	public Ponto2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto2D() {
		this(0f, 0f);
	}
	
	public double distancia(Ponto2D ponto) {
		double d1 = x - ponto.x;
		double d2 = y - ponto.y;
		return Math.sqrt(d1 * d1 + d2 * d2);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Ponto (" + this.x + "," + this.y + ")";
	}
}
