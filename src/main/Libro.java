package main;

public class Libro {
    private int id;
    private String tipus;
    private String titol;
    private String autor;
    private Double preu;
    private int stock;

    public Libro(int id, String tipus, String titol, String autor, Double preu, int stock) {
        this.id = id;
        this.tipus = tipus;
        this.titol = titol;
        this.autor = autor;
        this.preu = preu;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", tipus='" + tipus + '\'' +
                ", titol='" + titol + '\'' +
                ", autor='" + autor + '\'' +
                ", preu=" + preu +
                ", stock=" + stock +
                '}';
    }
}
