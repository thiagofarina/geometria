package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public interface Forma {
	double calculaArea();
	double comprimentoLinha();
	boolean contem(Ponto2D ponto);
}
