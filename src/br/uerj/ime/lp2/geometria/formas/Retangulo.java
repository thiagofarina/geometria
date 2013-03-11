package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;
import br.uerj.ime.lp2.geometria.utils.Vetor2D;

public class Retangulo implements Forma {
	private Ponto2D verticeInferiorEsquerdo;
	private Ponto2D verticeInferiorDireito;
	private Ponto2D verticeSuperiorEsquerdo;
	private Ponto2D verticeSuperiorDireito;

	public Retangulo(Ponto2D verticeInferiorEsquerdo,
			         Ponto2D verticeInferiorDireito,
			         Ponto2D verticeSuperiorEsquerdo,
			         Ponto2D verticeSuperiorDireito) {
		this.verticeInferiorEsquerdo = verticeInferiorEsquerdo;
		this.verticeInferiorDireito = verticeInferiorDireito;
		this.verticeSuperiorEsquerdo = verticeSuperiorEsquerdo;
		this.verticeSuperiorDireito = verticeSuperiorDireito;
	}

	@Override
	public double calculaArea() {
		double base = verticeSuperiorEsquerdo.distancia(verticeSuperiorDireito);
		double altura = verticeSuperiorDireito.distancia(verticeInferiorDireito);
		return base * altura;
	}

	@Override
	public double calculaLinha() {
		double base = verticeSuperiorEsquerdo.distancia(verticeSuperiorDireito);
		double altura = verticeSuperiorDireito.distancia(verticeInferiorDireito);
		return 2 * (base + altura);
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		double x = ponto.getX();
		double y = ponto.getY();
		double x0 = verticeSuperiorEsquerdo.getX();
		double y0 = verticeSuperiorEsquerdo.getY();
		double x1 = verticeInferiorDireito.getX();
		double y1 = verticeInferiorDireito.getY();
		boolean b1 = x >= x0;
		boolean b2 = x < x1;
		boolean b3 = y <= y0;
		boolean b4 = y < y1;
		return x >= x0 && x < x1 && y <= y0 && y < y1;
	}
	
	@Override
	public String toString() {
		return "Retangulo: Vertices: IE (" + String.format("%.0f", verticeInferiorEsquerdo.getX()) + "," +
											 String.format("%.0f", verticeInferiorEsquerdo.getY()) + ") " +
		                            "ID (" + String.format("%.0f", verticeInferiorDireito.getX()) + "," +
		                                     String.format("%.0f", verticeInferiorDireito.getY()) + ") " +
		                            "SE (" + String.format("%.0f", verticeSuperiorEsquerdo.getX()) + "," +
		                                     String.format("%.0f", verticeSuperiorEsquerdo.getY()) + ") " +
		                            "SD (" + String.format("%.0f", verticeSuperiorDireito.getX()) + "," +
		                                     String.format("%.0f",verticeSuperiorDireito.getY()) + "), " +
		                            "Area: " + String.format("%.01f", calculaArea()) + ", " +
		                            "Linha: " + String.format("%.01f", calculaLinha());
	}
}
