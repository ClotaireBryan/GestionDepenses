package clotaire.bryan.gestiondepenses.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import clotaire.bryan.gestiondepenses.DataBase.Contrat;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String Table_Create = "CREATE TABLE "+ Contrat.depensesContrat.TABLE_DEPENSES+"("+Contrat.depensesContrat.COLONNE_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +Contrat.depensesContrat.COLONNE_MONTANT+" REAL NOT NULL, "+Contrat.depensesContrat.COLONNE_LIEU+" TEXT NOT NULL, "+Contrat.depensesContrat.COLONNE_VILLE+" TEXT, "+Contrat.depensesContrat.COLONNE_DATE+" DATE);";

   public DatabaseHelper(Context context){
       super(context,"depenses.db",null,1);
   }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Table_Create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS "+Contrat.depensesContrat.TABLE_DEPENSES);
       onCreate(db);
    }

}
