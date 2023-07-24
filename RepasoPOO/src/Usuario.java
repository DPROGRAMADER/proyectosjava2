
import java.util.Scanner;
public class Usuario {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String contraseña;

    private String emailUser;

    private String userContraseña;

    public Usuario() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.emailUser = emailUser;
        this.userContraseña = userContraseña;
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setUserContraseña(String userContraseña) {
        this.userContraseña = userContraseña;
    }

    public String getUserContraseña() {
        return userContraseña;
    }

    public void registrar() {

        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Apellido: ");
        apellido = sc.next();
        System.out.println("Telefono: ");
        telefono = sc.next();
        System.out.println("Email: ");
        email = sc.next();
        System.out.println("Contraseña: ");
        contraseña = sc.next();

    }

    public void imprimirReg() {

        System.out.println("1. Nombre" + nombre + "\n"
                + "2. Apellido: " + apellido + "\n"
                + "3. Telefono: " + telefono + "\n"
                + "4. Email: " + email);
    }

    public void login() {
        System.out.println("emailUser");
        emailUser = sc.next();
        System.out.println("userContraseña");
        userContraseña = sc.next();

        System.out.println("1. Ingrese su Usuario: " + emailUser + "\n"
                + "2. Ingrese su Contraseña: " + userContraseña + "\n");

        if(emailUser.equals(email)&& userContraseña.equals(contraseña)){
            System.out.println("Puedes pasar");
        }else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}
