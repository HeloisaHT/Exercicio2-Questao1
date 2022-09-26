package Q1;

import java.util.Scanner;

public class Pessoa {
	
	Scanner leia = new Scanner(System.in);
	
	String nome;
	int idade;
	String cpf;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void Alterar(){
		System.out.println("Escreva um nome: ");
		this.nome = leia.next();
		System.out.println("Escreva uma idade: ");
		this.idade = leia.nextInt();
		System.out.println("Escreva um cpf: ");
		this.cpf = leia.next();
		
	}
	
	public void Imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);	
		System.out.println("CPF: "+this.cpf);
	}
	
	

}
