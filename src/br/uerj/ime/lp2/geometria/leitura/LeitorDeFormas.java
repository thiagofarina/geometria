package br.uerj.ime.lp2.geometria.leitura;

import java.util.Scanner;

import br.uerj.ime.lp2.geometria.formas.Circulo;
import br.uerj.ime.lp2.geometria.formas.Retangulo;
import br.uerj.ime.lp2.geometria.formas.Triangulo;
import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class LeitorDeFormas {
	private Scanner leitor;
	
	public LeitorDeFormas(Scanner leitor) {
		this.leitor = leitor;
	}

	public Circulo leCirculo() {
		int raio = leitor.nextInt();
		Ponto2D centro = lePonto();
		return new Circulo(centro, raio);
	}
	
	public Retangulo leRetangulo() {
		Ponto2D pontoInfEsq = lePonto();
		Ponto2D pontoInfDir = lePonto();
		Ponto2D pontoSupEsq = lePonto();
		Ponto2D pontoSupDir = lePonto();
		return new Retangulo(pontoInfEsq, pontoInfDir, pontoSupEsq, pontoSupDir);
	}
	
	public Triangulo leTriangulo() {
		Ponto2D verticeA = lePonto();
		Ponto2D verticeB = lePonto();
		Ponto2D verticeC = lePonto();
		return new Triangulo(verticeA, verticeB, verticeC);
	}
	
	public Ponto2D lePonto() {
		int x = leitor.nextInt();
		int y = leitor.nextInt();
		return new Ponto2D(x, y);
	}
}
