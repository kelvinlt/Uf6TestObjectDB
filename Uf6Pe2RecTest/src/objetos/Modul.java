package objetos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modul {
    @Id
    int numeroM;
    String nom;
    int durada;

    public Modul(int numeroM, String nom, int durada) {
        this.numeroM = numeroM;
        this.nom = nom;
        this.durada = durada;
    }

    public int getNumeroM() {
        return numeroM;
    }

    public void setNumeroM(int numeroM) {
        this.numeroM = numeroM;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDurada() {
        return durada;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }

    @Override
    public String toString() {
        return "Modul{" + "numeroM=" + numeroM + ", nom=" + nom + ", durada=" + durada + '}';
    }
}
