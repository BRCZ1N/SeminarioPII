package abstractfactorypattern;



public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta\nF�brica:Ford\nCategoria:Sedan");
	}

}
