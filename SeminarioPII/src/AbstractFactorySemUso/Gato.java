package AbstractFactorySemUso;

public class Gato implements Animal{
    @Override
    public String getAnimal() {
        return "Gato";
    }

    @Override
    public String fazSom() {
        return "Miau!";
    }
}