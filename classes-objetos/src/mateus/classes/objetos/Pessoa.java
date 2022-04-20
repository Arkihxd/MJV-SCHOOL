package mateus.classes.objetos;

public class Pessoa {
	String nome;
	String cpf;
	String endereco;
	
	//Construtor
	Pessoa(String nome, String cpf, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	//Construtor sem todos os parametros e parametro default
	Pessoa(String nome, String cpf){
		/*this.nome = nome;
		this.cpf = cpf;
		this.endereco = "NAO INFORMADO";*/
		
		//Compactando o this para economizar código
		this(nome, cpf, "NAO INFORMADO");
	}
	
	Pessoa(String cpf){
		this(cpf, "PessoaTeste");
	}
	
}
