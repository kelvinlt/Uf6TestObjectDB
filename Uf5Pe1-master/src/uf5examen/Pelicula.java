package uf5examen;

/**
 *
 * @author x2382383c
 */
public class Pelicula {
   String titulo;
   int fecha;
   String[] actores;

    public Pelicula(String titulo, int fecha, String[] actores) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "{" + "titulo=" + titulo + ", fecha=" + fecha + ", actores=" + actores + '}';
    }

    
}
