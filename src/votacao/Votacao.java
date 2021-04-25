package votacao;

public class Votacao {

	private Long totalEleitores;
	private Long votosValidos;
	private Long votosEmBranco;
	private Long votosNulos;
	
	public Votacao(Long totalEleitores, Long votosValidos, Long votosEmBranco, Long votosNulos) {
		if(totalEleitores == 0)
			throw new IllegalArgumentException("Não pode ser feita divisão por zero.");
		
		if(totalEleitores < 0 || votosValidos < 0 || votosEmBranco < 0
				|| votosNulos < 0)
			throw new IllegalArgumentException("Números negativos não são aceitos.");
		
		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosEmBranco = votosEmBranco;
		this.votosNulos = votosNulos;
	}
	
	public Double getPercentualVotosValidos() {
		return (Double.valueOf(votosValidos) / Double.valueOf(totalEleitores)) * 100;
	}
	
	public Double getPercentualVotosEmBranco() {
		return (Double.valueOf(votosEmBranco) / Double.valueOf(totalEleitores)) * 100;
	}
	
	public Double getPercentualVotosNulos() {
		return (Double.valueOf(votosNulos) / Double.valueOf(totalEleitores)) * 100;
	}

	public Long getTotalEleitores() {
		return totalEleitores;
	}

	public Long getVotosValidos() {
		return votosValidos;
	}

	public Long getVotosEmBranco() {
		return votosEmBranco;
	}

	public Long getVotosNulos() {
		return votosNulos;
	}
	
}
