package clotaire.bryan.gestiondepenses.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import clotaire.bryan.gestiondepenses.BO.Solde;
import clotaire.bryan.gestiondepenses.R;

public class AjoutersSoldeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouters_solde);
    }

    public void addSolde(View view){
        EditText editTextSolde = view.getRootView().findViewById(R.id.EDIT_Solde);
        if(editTextSolde.getText().toString().isEmpty()){
            Toast.makeText(AjoutersSoldeActivity.this,"Ajouter un montant pour le solde",Toast.LENGTH_LONG).show();
        }
        Solde solde = new Solde(Integer.parseInt(editTextSolde.getText().toString()));
        goToConsulterSoldePage(view);
        Toast.makeText(AjoutersSoldeActivity.this,"Nouvaux solde",Toast.LENGTH_LONG).show();
    }

    public void goToConsulterSoldePage(View view){
        Intent intent = new Intent(view.getContext(),ConsulterPageActivity.class);
        startActivity(intent);
    }
}
