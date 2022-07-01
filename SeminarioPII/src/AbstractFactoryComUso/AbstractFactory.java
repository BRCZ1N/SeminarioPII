package AbstractFactoryComUso;


public interface AbstractFactory<T> {
    T criar(String tipo);
}
