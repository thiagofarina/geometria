package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class Triangulo implements Forma {
	public Triangulo(Ponto2D verticeA, Ponto2D verticeB, Ponto2D verticeC) {
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
		return super.toString();
	}
}
