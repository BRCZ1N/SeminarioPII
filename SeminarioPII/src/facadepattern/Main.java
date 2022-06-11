package facadepattern;



public class Main {
	
	public static void main(String[] args) {
		
		SistemasFacade fachada = new SistemasFacade();
		System.out.println("##### Configurando subsistemas #####");
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
	}
}
