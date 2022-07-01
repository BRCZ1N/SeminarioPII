package semadapterpattern;

public class Client {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Empresa empresa = new Empresa();

		if (pessoa.getCpf() != null) {

			System.out.println("Pessoa verificada");

		}
		
		if (empresa.getCnpj() != null) {

			System.out.println("Pessoa verificada");

		}
		
		
	}

}
