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
		return 0;
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		return false;
	}
	
	@Override
	public String toString() {
		return "Retangulo: Vertices: IE (" + verticeInferiorEsquerdo.getX() + "," +
		                                     verticeInferiorEsquerdo.getY() + ") " +
		                            "ID (" + verticeInferiorDireito.getX() + "," +
		                                     verticeInferiorDireito.getY() + ") " +
		                            "SE (" + verticeSuperiorEsquerdo.getX() + "," +
		                                     verticeSuperiorEsquerdo.getY() + ") " +
		                            "SD (" + verticeSuperiorDireito.getX() + "," +
		                                     verticeSuperiorDireito.getY() + ")";
	}
}
