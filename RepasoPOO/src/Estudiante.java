import java.time.LocalDate;

public class Estudiante extends Usuario{
    private String rol;
    private LocalDate fechaMatricula;

    public Estudiante() {
    }

    public Estudiante(String rol, LocalDate fechaMatricula){
        super();
        this.rol = rol;
        this.fechaMatricula = fechaMatricula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public void registrar() {
        super.registrar();
        System.out.println("Rol: ");
        rol = sc.next();
        System.out.println("Fecha de matricula: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anho = sc.nextInt();
        fechaMatricula = LocalDate.of(anho, mes, dia);
    }

    @Override
    public void imprimirReg() {
        super.imprimirReg();
        System.out.println("5. Rol: " + rol + "\n"
                + "6. Fecha matricula: " + fechaMatricula + "\n");
    }
}
