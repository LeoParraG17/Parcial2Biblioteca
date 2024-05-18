public class Libro {
    private String ISBN;
    private String titulo;
    private Autor autor;
    private String genero;
    private String estado;

    public Libro(String ISBN, String titulo, Autor autor, String genero, String estado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estado = estado;
    }

    public String getISBN() { return ISBN; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Autor getAutor() { return autor; }

    public void setAutor(Autor autor) { this.autor = autor; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public String toString() {
        return "Título: " + titulo + ", ISBN: " + ISBN + ", Autor: " + autor.getNombre() + " " + autor.getApellido() + ", Género: " + genero + ", Estado: " + estado;
    }
}
