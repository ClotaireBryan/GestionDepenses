package clotaire.bryan.gestiondepenses.recyclerView;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import clotaire.bryan.gestiondepenses.BO.Depense;
import clotaire.bryan.gestiondepenses.R;

public class DepensesAdapter  extends RecyclerView.Adapter<DepensesViewHolder>{

    private List<Depense>listeDepense;
    public DepensesAdapter(List<Depense> listeDepense){this.listeDepense = listeDepense;}

    @Override
    public DepensesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewDepense = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.liste_depenses,parent,false);
        return new DepensesViewHolder(viewDepense);
    }

    @Override
    public void onBindViewHolder(DepensesViewHolder holder, int position) {

        //holder.textViewDate.setText(listeDepense.get(position).lieu);
        //holder.textViewMontant.setText(listeDepense.get(position).getMontant()+"€");
        holder.textViewLieu.setText(listeDepense.get(position).getLieu());
        holder.textViewVille.setText(listeDepense.get(position).getVille());
    }

    @Override
    public int getItemCount() {
        return listeDepense.size();
    }
}
