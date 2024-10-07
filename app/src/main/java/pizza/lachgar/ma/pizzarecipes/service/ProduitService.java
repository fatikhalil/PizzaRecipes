package pizza.lachgar.ma.pizzarecipes.service;
import java.util.ArrayList;
import java.util.List;

import pizza.lachgar.ma.pizzarecipes.classes.Produit;
import pizza.lachgar.ma.pizzarecipes.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService() {
        produits = new ArrayList<>();
    }

    @Override
    public void create(Produit item) {
        produits.add(item);
    }

    @Override
    public Produit read(int id) {
        for (Produit p : produits) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void update(Produit item) {
        // Implémenter la logique de mise à jour
    }

    @Override
    public void delete(int id) {
        produits.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }
}
