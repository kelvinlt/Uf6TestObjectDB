package objetos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Uf {
    @Id
    int numeroUf;
    int numeroM;
    String nom;
    int durada;
    int pes;

    public Uf(int numeroUf, int numeroM, String nom, int durada, int pes) {
        this.numeroUf = numeroUf;
        this.numeroM = numeroM;
        this.nom = nom;
        this.durada = durada;
        this.pes = pes;
    }

    public int getNumeroUf() {
        return numeroUf;
    }

    public void setNumeroUf(int numeroUf) {
        this.numeroUf = numeroUf;
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

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return "Uf{" + "numeroUf=" + numeroUf + ", numeroM=" + numeroM + ", nom=" + nom + ", durada=" + durada + ", pes=" + pes + '}';
    }
    
}
