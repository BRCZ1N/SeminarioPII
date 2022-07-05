package abstractfactorycomuso;

public interface AbstractFactory<T> {
	T criar(String tipo);
}
