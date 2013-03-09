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
		return Math.PI * raio * raio;
	}

	@Override
	public double calculaLinha() {
		return 2 * Math.PI * raio;
	}

	@Override
	public boolean contemPonto(Ponto2D ponto) {
		double distancia = Math.sqrt(Math.pow(centro.getX() - ponto.getX(), 2) +
				                     Math.pow(centro.getY() - ponto.getY(), 2));
		return distancia <= raio;
	}
	
	@Override
	public String toString() {
		return "Circulo: Raio " + raio + ", centro (" + centro.getX() + "," + centro.getY() + ")";
	}
}
