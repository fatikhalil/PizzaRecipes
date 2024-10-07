package pizza.lachgar.ma.pizzarecipes;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Assurez-vous que ce layout existe

        // Temporisation de 2 secondes avant de passer à l'activité suivante
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(intent);
            finish(); // Ferme l'activité Splash pour ne pas revenir en arrière
        }, 2000); // 2 secondes d'attente
    }
}
