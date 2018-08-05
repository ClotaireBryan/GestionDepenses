package clotaire.bryan.gestiondepenses.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import clotaire.bryan.gestiondepenses.R;

public class DepensesViewHolder extends RecyclerView.ViewHolder{

    public TextView textViewDate;
    public TextView textViewMontant;
    public TextView textViewLieu;
    public TextView textViewVille;

    public DepensesViewHolder(View itemView) {
        super(itemView);
        textViewDate = itemView.findViewById(R.id.Date_liste);
        textViewMontant = itemView.findViewById(R.id.Montant_liste);
        textViewLieu = itemView.findViewById(R.id.Lieu_liste);
        textViewVille = itemView.findViewById(R.id.Ville_liste);
    }
}
