package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

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
		double ponto_x = ponto.getX();
		double ponto_y = ponto.getY();
		double x = verticeInferiorEsquerdo.getX();
		double y = verticeInferiorEsquerdo.getY();

		double base = verticeSuperiorEsquerdo.distancia(verticeSuperiorDireito);
		double altura = verticeSuperiorDireito.distancia(verticeInferiorDireito);

		double direita = x + base;  // right
		double fundo = y + altura;  // bottom

		return (ponto_x >= x && ponto_x < direita &&
		        ponto_y >= y && ponto_y < fundo);
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
