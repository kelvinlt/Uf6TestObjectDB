package objetos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumne {
    @Id String dniA;
    String nom;
    int edat;

    public Alumne(String dniA, String nom, int edat) {
        this.dniA = dniA;
        this.nom = nom;
        this.edat = edat;
    }

    public String getDniA() {
        return dniA;
    }

    public void setDniA(String dniA) {
        this.dniA = dniA;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Alumne{" + "dniA=" + dniA + ", nom=" + nom + ", edat=" + edat + '}';
    }
}
