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
		return 0;
	}

	@Override
	public double calculaLinha() {
		return 0;
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		return MesmoLado(ponto, verticeA, verticeB, verticeC) &&
			   MesmoLado(ponto, verticeB, verticeA, verticeC) &&
			   MesmoLado(ponto, verticeC, verticeA, verticeB);
	}

	@Override
	public String toString() {
		return "Triangulo: Vertices: (" + verticeA.getX() + "," + verticeA.getY() + ") " +
		                            "(" + verticeB.getX() + "," + verticeB.getY() + ") " +
		                            "(" + verticeC.getX() + "," + verticeC.getY() + ")";
	}

	private boolean MesmoLado(Ponto2D p1,
			                  Ponto2D p2,
			                  Ponto2D a,
			                  Ponto2D b) {
		Vetor2D v1 = b.subtrair(a);
		double cp1 = v1.produtoVetorial(p1.subtrair(a));
		double cp2 = v1.produtoVetorial(p2.subtrair(a));
		return false;
	}
}
