package AbstractFactorySemUso;

public class Cachorro implements Animal{
    @Override
    public String getAnimal() {
        return "Cachorro";
    }

    @Override
    public String fazSom() {
        return "Au Au!";
    }
}