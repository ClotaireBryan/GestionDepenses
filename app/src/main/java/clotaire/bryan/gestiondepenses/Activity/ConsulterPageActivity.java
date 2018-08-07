package clotaire.bryan.gestiondepenses.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import clotaire.bryan.gestiondepenses.R;

public class ConsulterPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter_page);
    }

    public void clickAjoutSolde(View view){
        Intent intent = new Intent(this,AjoutersSoldeActivity.class);
        startActivity(intent);
    }
}
