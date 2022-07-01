package abstractfactorycomuso;

import abstractfactorysemuso.Animal;

public class FactoryProvider {

    public static AbstractFactory<Animal> getFactory(String escolha) {
        if("Animal".equalsIgnoreCase(escolha)) {
            return new AnimalFactory();

    }
		return null;
    }
}
    
