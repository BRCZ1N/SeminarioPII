package AbstractFactoryComUso;

import AbstractFactorySemUso.Animal;
import AbstractFactorySemUso.Cachorro;
import AbstractFactorySemUso.Gato;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal criar(String tipo) {
        if("Cachorro".equalsIgnoreCase(tipo)) {
            return new Cachorro();
        } else if("Gato".equalsIgnoreCase(tipo)) {
            return new Gato();
        }
        return null;
    }
}




