public class Main {


    public static void main(String [] args){

        Usuario usuario = new Usuario();


        usuario.setNombre("maria");
        String name =usuario.getNombre();

        System.out.println(name);
        Estudiante estudiante1 = new Estudiante();
        estudiante1.registrar();
        estudiante1.login();
        estudiante1.imprimirReg();








    }
}
