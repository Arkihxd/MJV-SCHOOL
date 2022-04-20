package mateus.classes.objetos;

public class SistemaCadastro {
	public static void main(String[] args) {
		
		
		/* Atribuindo parametros apos instanciar o objeto
		 * 
		Pessoa mateus = new Pessoa();
		mateus.nome = "Mateus Oliveira";
		System.err.println(mateus.nome);
		
		mateus.cpf = "123.456.789-12";
		System.err.println(mateus.cpf);
		
		mateus.endereco = "Curitiba - PR, Rua Java";
		System.err.println(mateus.endereco);
		*/
		
		// Instanciando e passando parametro pelo construtor
		Pessoa mateus = new Pessoa("Mateus", "123.456.789-12", "Curitiba - PR, Rua Java");
		System.out.println(mateus.nome);
		System.out.println(mateus.cpf);
		System.out.println(mateus.endereco);
		
		Pessoa marcos = new Pessoa("Marcos", "123.456.789-98");
		System.out.println(marcos.nome);
		System.out.println(marcos.cpf);
		System.out.println(marcos.endereco);
		
		Pessoa pessoaTeste = new Pessoa("123.456.789.88");
		System.out.println(pessoaTeste.nome);
		System.out.println(pessoaTeste.cpf);
	}

}
