package facadepattern;



public class SistemasFacade {
	
	private SistemaDeAudio audio;
	private SistemaDeInput input;
	private SistemaDeVideo video;

	public void inicializarSubsistemas() {
		video = new SistemaDeVideo();
		video.configurarCores();
		video.configurarResolucao();

		input = new SistemaDeInput();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new SistemaDeAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}

	public void lerInput() {
		input.lerInput();
	}

}
