package patterns.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}