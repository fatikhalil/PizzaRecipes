package pizza.lachgar.ma.pizzarecipes.dao;
import java.util.List;

public interface IDao<T> {
    void create(T item);
    T read(int id);
    void update(T item);
    void delete(int id);
    List<T> getAll();
}

