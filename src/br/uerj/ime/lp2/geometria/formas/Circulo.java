package br.uerj.ime.lp2.geometria.formas;

import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class Circulo implements Forma {
	private int raio;
	private Ponto2D centro;
	
	public Circulo(Ponto2D centro, int raio) {
		this.centro = centro;
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public double comprimentoLinha() {
		return 2 * Math.PI * this.raio;
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
