package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class Retangulo implements Forma {
	public Retangulo(Ponto2D pontoInfEsq,
			         Ponto2D pontoInfDir,
			         Ponto2D pontoSupEsq,
			         Ponto2D pontoSupDir) {
	}

	@Override
	public double calculaArea() {
		return 0;
	}

	@Override
	public double comprimentoLinha() {
		return 0;
	}

	@Override
	public boolean contem(Ponto2D ponto) {
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
