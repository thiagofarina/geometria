package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;
import br.uerj.ime.lp2.geometria.utils.Vetor2D;

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
		double a = verticeB.distancia(verticeC);
		double b = verticeA.distancia(verticeC);
		double c = verticeA.distancia(verticeB);
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double calculaLinha() {
		double a = verticeB.distancia(verticeC);
		double b = verticeA.distancia(verticeC);
		double c = verticeA.distancia(verticeB);
		return a + b + c;
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		Vetor2D v0 = verticeB.subtrair(verticeA);
		Vetor2D v1 = verticeC.subtrair(verticeA);
		Vetor2D v2 = ponto.subtrair(verticeA);

		double dot00 = v0.produtoEscalar(v0);
		double dot01 = v0.produtoEscalar(v1);
		double dot11 = v1.produtoEscalar(v1);
		double dot20 = v2.produtoEscalar(v0);
		double dot21 = v2.produtoEscalar(v1);

		double denom = dot00 * dot11 - dot01 * dot01;

		double v = (dot11 * dot20 - dot01 * dot21) / denom;
		double w = (dot00 * dot21 - dot01 * dot20) / denom;
		double u = 1 - v - w;

		return (v >= 0) && (w >= 0) && (u >= 0);
	}

	@Override
	public String toString() {
		return "Triangulo: Vertices: (" + String.format("%.0f", verticeA.getX()) + "," +
										  String.format("%.0f", verticeA.getY()) + ") " +
		                            "(" + String.format("%.0f", verticeB.getX()) + "," +
		                                  String.format("%.0f", verticeB.getY()) + ") " +
		                            "(" + String.format("%.0f", verticeC.getX()) + "," +
		                                  String.format("%.0f", verticeC.getY()) + "), " +
		                            "Area: " + String.format("%.01f", calculaArea()) + ", " +
		                            "Linha: " + String.format("%.01f", calculaLinha());
	}
}
