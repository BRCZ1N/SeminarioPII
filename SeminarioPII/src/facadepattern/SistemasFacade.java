package facadepattern;



public class SistemasFacade {
	
	private SistemaAudio sistemaAudio;
	private SistemaInput sistemaInput;
	private SistemaVideo sistemaVideo;

	public void inicializarSubsistemas() {
		sistemaVideo = new SistemaVideo();
		sistemaVideo.configurarCores();
		sistemaVideo.configurarResolucao();

		sistemaInput = new SistemaInput();
		sistemaInput.configurarJoystick();
		sistemaInput.configurarTeclado();

		sistemaAudio = new SistemaAudio();
		sistemaAudio.configurarCanais();
		sistemaAudio.configurarFrequencia();
		sistemaAudio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		sistemaAudio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		sistemaVideo.renderizarImagem(imagem);
	}

	public void lerInput() {
		sistemaInput.lerInput();
	}

}
