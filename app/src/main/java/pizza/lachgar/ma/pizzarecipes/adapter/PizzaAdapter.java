package pizza.lachgar.ma.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;

public class PizzaAdapter extends ArrayAdapter<Produit> {

    private List<Produit> pizzaList;
    private OnItemClickListener listener;

    // Interface pour gérer les clics sur les éléments
    public interface OnItemClickListener {
        void onItemClick(Produit pizza);
    }

    // Constructeur de l'adaptateur
    public PizzaAdapter(Context context, List<Produit> pizzaList, OnItemClickListener listener) {
        super(context, 0, pizzaList); // Appel du constructeur parent
        this.pizzaList = pizzaList;
        this.listener = listener;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produit pizza = getItem(position); // Obtenez l'objet Produit à partir de la liste

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_pizza, parent, false);
        }

        // Obtenez les références des vues
        TextView pizzaNameTextView = convertView.findViewById(R.id.pizzaNameTextView);
        TextView pizzaTimeTextView = convertView.findViewById(R.id.pizzaTimeTextView);
        TextView pizzaServingsTextView = convertView.findViewById(R.id.pizzaServingsTextView);
        ImageView pizzaImageView = convertView.findViewById(R.id.pizzaImageView);
        ImageView pizzaDetailIcon = convertView.findViewById(R.id.pizzaDetailIcon); // Référence à l'icône de détail

        // Liez les données de pizza aux vues
        pizzaNameTextView.setText(pizza.getName());
        pizzaTimeTextView.setText(pizza.getCookingTime());
        pizzaServingsTextView.setText(pizza.getServings() + " portions");
        pizzaImageView.setImageResource(pizza.getImageResourceId());

        // Gérer le clic sur l'icône de détail uniquement
        pizzaDetailIcon.setOnClickListener(v -> listener.onItemClick(pizza)); // L'écouteur de clic pour l'icône de détail

        return convertView;
    }
}
