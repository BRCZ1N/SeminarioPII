package abstractfactorysemuso;

public class TestSemAbstractFactory {
	
    public static void main(String[] args) {
    	Cachorro cachorro = new Cachorro();
    	
    


        String resultado = String.format("Um %s e  faz %s", cachorro.getAnimal(), cachorro.fazSom());

        System.out.println(resultado);
    }

}
