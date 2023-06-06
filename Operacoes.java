package exercicios;

import java.util.Scanner;

public class Operacoes {
	Scanner sc = new Scanner(System.in);

	private int id;
	private String titular;
	private double saldo;

	public void SetId(int id) {
		this.id=Integer.parseInt(sc.nextLine());
	}
	
	public void SetTitular(String titular) {
		this.titular = sc.nextLine();
	}
	
	public int GetId() {
		return id;
	}
	
	public String GetTitular() {
		return titular;
	}
	
	public double GetSaldo() {
		return saldo;
	}

	public void SetSaldo(double saldo) {
		this.saldo=sc.nextInt();
	}
	
	public void CadastrarTitular(int id, String titular, double saldo) {
		System.out.println("Cadastre o ID: ");
		SetId(GetId());
		
		System.out.println("Cadastre o Titular: ");
		SetTitular(GetTitular());
		
		System.out.println("Deseja fazer um depósito inicial?(y/n)");
		String yn = sc.nextLine();
		
		if (yn.equals("y")) {
			System.out.println("Digite o valor do Depósito inicial");
			SetSaldo(GetSaldo());
		}
		
		System.out.println("Dados da conta: ");
		System.out.printf("Id da conta: %s, Titular: %s, Saldo: R$%.2f%n",GetId(),GetTitular(),GetSaldo());
	}
	
	public void Deposito(int id, String nome, double deposito) {
		System.out.println("Digite o valor de depósito: ");
		deposito=sc.nextDouble();
		saldo+=deposito;
		System.out.println("Dados da conta: ");
		System.out.printf("Id da conta: %s, Titular: %s, Saldo: R$%.2f%n",GetId(),GetTitular(),GetSaldo());
	}
	
	public void Saque(int id, String nome, double saque) {
		System.out.println("Digite o valor de saque: ");
		saque=sc.nextDouble();
		saldo-=saque+5;
		System.out.println("Dados da conta: ");
		System.out.printf("Id da conta: %s, Titular: %s, Saldo: R$%.2f%n",GetId(), GetTitular(), GetSaldo());
	}
}