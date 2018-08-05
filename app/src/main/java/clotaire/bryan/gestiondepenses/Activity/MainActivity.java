package clotaire.bryan.gestiondepenses.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import clotaire.bryan.gestiondepenses.Activity.AjouterPageActivity;
import clotaire.bryan.gestiondepenses.Activity.ConsulterPageActivity;
import clotaire.bryan.gestiondepenses.Activity.ListerPageActivity;
import clotaire.bryan.gestiondepenses.R;

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
