package abstractfactorycomuso;

import abstractfactorysemuso.Branco;
import abstractfactorysemuso.Cor;
import abstractfactorysemuso.Preto;

public class CorFactory implements AbstractFactory<Cor> {

	@Override
	public Cor criar(String tipo) {
		if ("Preto".equalsIgnoreCase(tipo)) {
			return new Preto();
		} else if ("Branco".equalsIgnoreCase(tipo)) {
			return new Branco();
		}
		return null;
	}
}
