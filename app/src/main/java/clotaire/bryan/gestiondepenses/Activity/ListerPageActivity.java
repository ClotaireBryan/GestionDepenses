package clotaire.bryan.gestiondepenses.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

import clotaire.bryan.gestiondepenses.BO.Depense;
import clotaire.bryan.gestiondepenses.R;
import clotaire.bryan.gestiondepenses.recyclerView.DepensesAdapter;

public class ListerPageActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_page);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.DepensesRecycleView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Depense> listeDepenses = new ArrayList<>();
        listeDepenses.add(new Depense("MCDO","nantes"));
        listeDepenses.add(new Depense("LeaderPrice","paris"));
        listeDepenses.add(new Depense("IKEA","Lyon"));

        DepensesAdapter depensesAdapter = new DepensesAdapter((listeDepenses));
        recyclerView.setAdapter(depensesAdapter);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
