package adapterpattern;

public class PessoaAdapter implements Target {

	Pessoa pessoa;
	
	public PessoaAdapter(Pessoa pessoa) {
		
		this.pessoa = pessoa;
		
	}
	
	@Override
	public String getRegistro() {
		return this.pessoa.getCpf();
		
	}
	
}
