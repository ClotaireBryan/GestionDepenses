package clotaire.bryan.gestiondepenses.DataBase;

import android.provider.BaseColumns;

public final class Contrat {

    private Contrat() {
    }

    public static class depensesContrat implements BaseColumns {
        public static final String TABLE_DEPENSES = "depenses";
        public static final String COLONNE_ID = "id";
        public static final String COLONNE_DATE = "date";
        public static final String COLONNE_MONTANT = "montant";
        public static final String COLONNE_LIEU = "lieu";
        public static final String COLONNE_VILLE = "ville";
    }
}
