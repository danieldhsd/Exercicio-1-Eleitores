package votacao;

public class CalculoVotacaoUtils {

	public static Double getPercentualVotosValidos(Long votosValidos, Long votosTotal) {
		if(votosTotal == 0)
			throw new IllegalArgumentException("Não pode ser feita divisão por zero.");
		
		if(votosTotal < 0 || votosValidos < 0)
			throw new IllegalArgumentException("Números negativos não são aceitos.");
		
		return (Double.valueOf(votosValidos) / Double.valueOf(votosTotal)) * 100;
	}
	
	public static Double getPercentualVotosEmBranco(Long votosEmBranco, Long votosTotal) {
		if(votosTotal == 0)
			throw new IllegalArgumentException("Não pode ser feita divisão por zero.");
		
		if(votosTotal < 0 || votosEmBranco < 0)
			throw new IllegalArgumentException("Números negativos não são aceitos.");
		
		return (Double.valueOf(votosEmBranco) / Double.valueOf(votosTotal)) * 100;
	}
	
	public static Double getPercentualVotosNulos(Long votosNulos, Long votosTotal) {
		if(votosTotal == 0)
			throw new IllegalArgumentException("Não pode ser feita divisão por zero.");
		
		if(votosTotal < 0 || votosNulos < 0)
			throw new IllegalArgumentException("Números negativos não são aceitos.");
		
		return (Double.valueOf(votosNulos) / Double.valueOf(votosTotal)) * 100;
	}
}
