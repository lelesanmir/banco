package principio.responsabilidade;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;
	
	public void soma100reais() {
		saldo += 100;
	}
	
	public void diminui100reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	
}
