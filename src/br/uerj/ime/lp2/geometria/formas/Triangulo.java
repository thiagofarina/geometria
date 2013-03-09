package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class Triangulo implements Forma {
	private Ponto2D verticeA;
	private Ponto2D verticeB;
	private Ponto2D verticeC;

	public Triangulo(Ponto2D verticeA, Ponto2D verticeB, Ponto2D verticeC) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
	}

	@Override
	public double calculaArea() {
		return 0;
	}

	@Override
	public double calculaLinha() {
		return 0;
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		return false;
	}

	@Override
	public String toString() {
		return "Triangulo: Vertices: (" + verticeA.getX() + "," + verticeA.getY() + ") " +
		                            "(" + verticeB.getX() + "," + verticeB.getY() + ") " +
		                            "(" + verticeC.getX() + "," + verticeC.getY() + ")";
	}
}
