package entidades;

public class Conta {
	
	private Integer numeroConta;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public Conta(Integer numeroConta, String agencia, String nomeCliente, Double saldo) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		 builder.append("\n Olá ")
				.append(nomeCliente)
				.append(", Obrigado por criar uma conta em nosso banco,\n"
						+ " sua Agencia ")
				.append(agencia)
				.append(", Conta corrente ")
				.append(numeroConta)
				.append(" e seu saldo ")
				.append(saldo)
				.append("\n já está disponível para saque.");
		return builder.toString();
	}
	
	

}
