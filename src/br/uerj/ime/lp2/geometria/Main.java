package br.uerj.ime.lp2.geometria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import br.uerj.ime.lp2.geometria.formas.Forma;
import br.uerj.ime.lp2.geometria.leitura.LeitorDeFormas;
import br.uerj.ime.lp2.geometria.utils.Ponto2D;

public class Main {
	public static final int CIRCULO = 1;
	public static final int RETANGULO = 2;
	public static final int TRIANGULO = 3;
	
	public static void main(String[] args) {
		List<Forma> formasGeometricas = new ArrayList<Forma>();
		
		Scanner scanner = new Scanner(System.in);
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		scanner.useDelimiter(delimiters);
		
		LeitorDeFormas leitor = new LeitorDeFormas(scanner);

		while (scanner.hasNext()) {
			System.out.println("Scanned: " + scanner.nextInt());
			Forma formaLida = null;
			
			// Descobre qual forma sera lida em seguida.
			int tipoForma = scanner.nextInt();
			switch (tipoForma) {
				case CIRCULO:
					formaLida = leitor.leCirculo();
					break;
				case RETANGULO:
					formaLida = leitor.leRetangulo();
					break;
				case TRIANGULO:
					formaLida = leitor.leTriangulo();
					break;
			}
			
			// Le ponto.
			Ponto2D ponto = leitor.lePonto();

			// Verifica se forma lida possui ponto.
			formaLida.contemPonto(ponto);
			// Imprime resposta.
			
			// Armazena forma lida.
			formasGeometricas.add(formaLida);
		}
		
		// Imprime informacoes de todas as formas lidas
		System.out.println("Total de formas lidas: " + formasGeometricas.size());
		for (int i = 0; i < formasGeometricas.size(); i++) {

		}
	}
}
