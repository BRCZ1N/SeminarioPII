package semFacadePattern;


public class Main {

	public static void main(String[] args) {
		SistemaAudioSemFacade audio = new SistemaAudioSemFacade();
		SistemaVideoSemFacade video = new SistemaVideoSemFacade();	
		SistemaInputSemFacade input = new SistemaInputSemFacade();
		input.configurarJoystick();
		input.configurarTeclado();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
		audio.reproduzirAudio("teste.mp3");
		video.configurarCores();
		video.configurarResolucao();
		video.renderizarImagem("imagem.png");
	
	}

}
