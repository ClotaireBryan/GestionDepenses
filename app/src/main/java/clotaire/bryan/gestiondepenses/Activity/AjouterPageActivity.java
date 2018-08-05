package clotaire.bryan.gestiondepenses.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

import clotaire.bryan.gestiondepenses.BO.Depense;
import clotaire.bryan.gestiondepenses.R;

public class AjouterPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_page);
    }

    public void addDepense(View view){
        EditText editTextMontant =view.getRootView().findViewById(R.id.EDIT_Montant_Ajouter);
        EditText editTextLieu = view.getRootView().findViewById(R.id.EDIT_Lieu_Ajouter);
        EditText editTextVille = view.getRootView().findViewById(R.id.EDIT_Ville_Ajouter);

        if(editTextMontant.getText().toString().isEmpty() || editTextLieu.getText().toString().isEmpty()){
            Toast.makeText(AjouterPageActivity.this,"Certains champs sont incomplets",Toast.LENGTH_LONG).show();
        }else {
            if(editTextVille.getText().toString().isEmpty()){
                //sans la ville
                Depense depense = new Depense();
                depense.setMontant(Integer.valueOf(editTextMontant.getText().toString()));
                depense.setLieu(editTextLieu.getText().toString());
                depense.setDate(new Date());
                goToListerPage(view);
                Toast.makeText(AjouterPageActivity.this,"Nouvelles depenses ajouter",Toast.LENGTH_LONG).show();
            }else{
                //avec la ville
                Depense depense = new Depense();
                depense.setMontant(Integer.valueOf(editTextMontant.getText().toString()));
                depense.setLieu(editTextLieu.getText().toString());
                depense.setVille(editTextVille.getText().toString());
                depense.setDate(new Date());
                goToListerPage(view);
                Toast.makeText(AjouterPageActivity.this,"Nouvelles depenses ajouter",Toast.LENGTH_LONG).show();
            }
        }
    }

    public void goToListerPage(View view){
        Intent intent = new Intent(view.getContext(),ListerPageActivity.class);
        startActivity(intent);
    }
}
