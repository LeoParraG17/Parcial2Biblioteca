import java.time.LocalDate;

public class Autor extends Persona{
    private LocalDate fechaNacimiento;
    private LocalDate fechaFallecimiento;

    public Autor(int idPersona, String nombre, String apellido, String direccion, String telefono, LocalDate fechaNacimiento, LocalDate fechaFallecimiento){
        super(idPersona, nombre, apellido, direccion, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public LocalDate getFechaNacimiento(){ return fechaNacimiento; }

    public void setFechaNacimiento(LocalDate fechaNacimiento){ this.fechaNacimiento = fechaNacimiento; }

    public LocalDate getFechaFallecimiento(){ return fechaFallecimiento; }

    public void setFechaFallecimiento(LocalDate fechaFallecimiento){ this.fechaFallecimiento = fechaFallecimiento; }

    public String toString(){ return nombre + " " + apellido; }
}