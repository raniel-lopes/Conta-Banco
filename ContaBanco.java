package cadastroBanco;

public class ContaBanco {

	private String titular;
	private int numConta;
	private double saldo;
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		valor += saldo;
		return;
	}
	
	public void exibirDados() {
	        System.out.println("Título: " + titular);
	        System.out.println("Número da Conta: " + numConta);
	        System.out.println("Saldo: " + saldo);
	    }
	}
	
