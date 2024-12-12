
package logica;


public class Libro {
    //atributos isbn autor, género, número de páginas.
    String isbn;
    String titulo;
    String autor;
    String genero;
    int numpag;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String genero, int numpag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numpag = numpag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn = " + isbn + ", titulo = " + titulo + ", autor = " + autor + ", genero = " + genero + ", numpag = " + numpag + '}';
    }

   

    

    

   
    
            
    
}
