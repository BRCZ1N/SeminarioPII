package adapterpattern;

public class EmpresaAdapter implements Target{
	
	Empresa empresa;
	
	public EmpresaAdapter(Empresa empresa) {
		
		this.empresa = empresa;
		
	}

	@Override
	public String getRegistro() {
		return this.empresa.getCnpj();
	}
	
	
	
	

}
