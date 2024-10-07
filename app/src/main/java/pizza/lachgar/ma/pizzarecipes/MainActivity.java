package pizza.lachgar.ma.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Assurez-vous que ce layout existe

        // Trouvez le bouton dans votre layout
        Button viewPizzasButton = findViewById(R.id.viewPizzasButton);

        // Configurez un écouteur de clic pour le bouton
        viewPizzasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lorsque le bouton est cliqué, démarrez ListPizzaActivity
                Intent intent = new Intent(MainActivity.this, ListPizzaActivity.class);
                startActivity(intent);
            }
        });
    }
}
