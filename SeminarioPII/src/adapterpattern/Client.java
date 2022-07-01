package adapterpattern;

public class Client {
	public static void main(String[] args) {

		PessoaAdapter pessoa = new PessoaAdapter(new Pessoa());
		EmpresaAdapter empresa = new EmpresaAdapter(new Empresa());

		if (pessoa.getRegistro() != null) {

			System.out.println("Pessoa verificada");

		}
		
		if (empresa.getRegistro() != null) {

			System.out.println("Empresa verificada");

		}
		
		
	}

}
