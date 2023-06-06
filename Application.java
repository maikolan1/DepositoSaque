package exercicios;

public class Application {

	public static void main(String[] args) {
	Operacoes o=new Operacoes();
	o.CadastrarTitular(o.GetId(),o.GetTitular(),o.GetSaldo());
	o.Deposito(o.GetId(),o.GetTitular(), o.GetSaldo());
	o.Saque(o.GetId(),o.GetTitular(), o.GetSaldo());
	}

}