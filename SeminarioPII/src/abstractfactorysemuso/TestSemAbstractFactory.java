package abstractfactorysemuso;

public class TestSemAbstractFactory {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Preto preto = new Preto();

		String resultado = String.format("Um %s da cor %s e  faz %s", gato.getAnimal(), preto.getCor(),
				gato.fazSom());

		System.out.println(resultado);
	}

}
