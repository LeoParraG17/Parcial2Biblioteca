import java.time.LocalDate;

public class Prestamo {
    private static int idCounter = 1;
    private int idPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Libro libro;
    private Cliente cliente;

    public Prestamo(Libro libro, Cliente cliente) {
        this.idPrestamo = idCounter++;
        this.fechaPrestamo = LocalDate.now();
        this.libro = libro;
        this.cliente = cliente;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString() {
        return "ID Préstamo: " + idPrestamo +
               ", Fecha de Préstamo: " + fechaPrestamo +
               ", Fecha de Devolución: " + (fechaDevolucion != null ? fechaDevolucion : "no devuelto") +
               ", Libro: " + libro.getTitulo() + " (ISBN: " + libro.getISBN() + ")" +
               ", Cliente: " + cliente.getNombre() + " " + cliente.getApellido();
    }
}
