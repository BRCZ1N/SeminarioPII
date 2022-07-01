package abstractfactorycomuso;

import abstractfactorysemuso.Animal;

public class TestComAbstractFactory {
	
    public static void main(String[] args) {
        AbstractFactory<Animal> abstractFactory;

        
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = abstractFactory.criar("Cachorro");


        String resultado = String.format("Um %s e  faz %s", animal.getAnimal(), animal.fazSom());

        System.out.println(resultado);
    }

}
