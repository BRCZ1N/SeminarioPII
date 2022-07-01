package abstractfactorycomuso;

import abstractfactorysemuso.Cachorro;
import abstractfactorysemuso.Gato;

public class TestFactory {
	
	public static void main(String[]args){
		Cachorro cachorro = new Cachorro();
		System.out.println(cachorro);
		Gato gato = new Gato();
		System.out.println(gato);
		}
}
