package clotaire.bryan.gestiondepenses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAjoutPage(View view) {
        Intent intent = new Intent(this, AjouterPageActivity.class);
        startActivity(intent);
    }

    public void clickListerDepensesPage(View view) {
        Intent intent = new Intent(this, ListerPageActivity.class);
        startActivity(intent);
    }

    public void clickSoldesComptePage(View view) {
        Intent intent = new Intent(this, ConsulterPageActivity.class);
        startActivity(intent);
    }
}
