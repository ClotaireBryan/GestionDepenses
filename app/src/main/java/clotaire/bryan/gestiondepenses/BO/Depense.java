package clotaire.bryan.gestiondepenses.BO;

import java.util.Date;
import java.util.UUID;

public class Depense {

    int id;
    int montant;
    Date date;
    String lieu;
    String ville;

    public Depense() {
        super();
    }

    public Depense(int id, int montant, String lieu, String ville) {
        this.id = id;
        this.montant = montant;
        this.lieu = lieu;
        this.ville = ville;
    }

    public Depense(int id, int montant, String lieu) {
        this.id = id;
        this.montant = montant;
        this.lieu = lieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Depense{" +
                "id=" + id +
                ", montant=" + montant +
                ", date=" + date +
                ", lieu='" + lieu + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
