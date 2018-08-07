package clotaire.bryan.gestiondepenses.BO;

public class Solde {
    private int montant;

    public Solde(){
        super();
    }
    public Solde(int montant){
        this.montant = montant;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Solde{" +
                "montant=" + montant +
                '}';
    }
}
