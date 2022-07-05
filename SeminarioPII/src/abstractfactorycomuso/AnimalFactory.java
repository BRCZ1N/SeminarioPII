package abstractfactorycomuso;

import abstractfactorysemuso.Animal;
import abstractfactorysemuso.Cachorro;
import abstractfactorysemuso.Gato;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal criar(String tipo) {
		if ("Cachorro".equalsIgnoreCase(tipo)) {
			return new Cachorro();
		} else if ("Gato".equalsIgnoreCase(tipo)) {
			return new Gato();
		}
		return null;
	}
}
