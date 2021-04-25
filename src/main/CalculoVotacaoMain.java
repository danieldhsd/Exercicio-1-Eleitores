package main;

import votacao.CalculoVotacaoUtils;
import votacao.Votacao;

public class CalculoVotacaoMain {

	public static void main(String[] args) {
		System.out.println("Calculos com métodos estáticos.");
		Double votosValidos = CalculoVotacaoUtils.getPercentualVotosValidos(800l, 1000l);
		Double votosEmBranco = CalculoVotacaoUtils.getPercentualVotosEmBranco(150l, 1000l);
		Double votosNulos = CalculoVotacaoUtils.getPercentualVotosNulos(50l, 1000l);

		System.out.println("Votos Validos: " + votosValidos + "%");
		System.out.println("Votos em branco: " + votosEmBranco + "%");
		System.out.println("Votos nulos: " + votosNulos + "%");
		
		System.out.println("Votos totais: " + (votosValidos + votosEmBranco + votosNulos) + "%");
		
		System.out.println("--------------------------");
		
		System.out.println("Calculos usando classe propria.");
		Votacao votacao = new Votacao(1000l, 800l, 150l, 50l);
		votosValidos = votacao.getPercentualVotosValidos();
		votosEmBranco = votacao.getPercentualVotosEmBranco();
		votosNulos = votacao.getPercentualVotosNulos();
		
		System.out.println("Votos Validos: " + votosValidos + "%");
		System.out.println("Votos em branco: " + votosEmBranco + "%");
		System.out.println("Votos nulos: " + votosNulos + "%");
		
		System.out.println("Votos totais: " + (votosValidos + votosEmBranco + votosNulos) + "%");
	}
}
