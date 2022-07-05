package abstractfactorycomuso;

import abstractfactorysemuso.Animal;
import abstractfactorysemuso.Cor;

public class TestComAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory<Animal> abstractFactory;

		abstractFactory = FactoryProvider.getFactory("Animal");
		Animal animal = abstractFactory.criar("Cachorro");

		abstractFactory = FactoryProvider.getFactory("Cor");
		Cor cor = (Cor) abstractFactory.criar("Branco");

		String resultado = String.format("Um %s de cor %s faz %s", animal.getAnimal(), cor.getCor(), animal.fazSom());

		System.out.println(resultado);

	}

}
