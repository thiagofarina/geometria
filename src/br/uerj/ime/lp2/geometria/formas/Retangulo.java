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
		Vetor2D p1 = new Vetor2D(new Ponto2D(verticeSuperiorEsquerdo.getX(), verticeSuperiorEsquerdo.getY()));
		//Vetor2D p2 = new Vetor2D(new Ponto2D(verticeSuperiorDireito.getX(), verticeSuperiorDireito.getY()));
		Vetor2D p3 = new Vetor2D(new Ponto2D(verticeInferiorDireito.getX(), verticeInferiorDireito.getY()));
		Vetor2D p4 = new Vetor2D(new Ponto2D(verticeInferiorEsquerdo.getX(), verticeInferiorEsquerdo.getY()));
		Vetor2D p = new Vetor2D(ponto);
		 
		Vetor2D p1P4 = p1.subtrair(p4);
		Vetor2D p3P4 = p3.subtrair(p4);
		Vetor2D TWO_P_C = (p.subtrair(p1).subtrair(p3)).multiplica(2);    // TWO_P_C= 2 P - C, C=Center of rectangle
		 
		return (p3P4.produtoEscalar(TWO_P_C.subtrair(p3P4)) <= 0 && p3P4.produtoEscalar(TWO_P_C.add(p3P4)) >= 0) &&
		         (p1P4.produtoEscalar(TWO_P_C.add(p1P4)) <= 0 && p1P4.produtoEscalar(TWO_P_C.add(p1P4)) >= 0);
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
