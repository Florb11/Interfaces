import javax.swing.*;

//creo la clase alumno , alumno hereda de usuario
//puede usar todos los datos y funciones de usuario

public class Alumno extends Usuario {
    public int matricula;
    private static int nro; // el static hace que ese atributo pertenezca a la clase en sí, y no a las instancias
    // nro no pertenece a un objeto en si , sino que todos los alumnos comparten nro (alumno = clase)



    public Alumno(String mail, String contrasenia) {
        super(mail, contrasenia);
        nro++; // aumenta 1 cada vez que creo un alumno
        this.matricula = nro; // y aca guardo ese numero secuencial para la matricula
    }



    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public static int getNro() {
        return nro;
    }

    public static void setNro(int nro) {
        Alumno.nro = nro;
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", getMail()=" + getMail() + ", getContrasenia()=" + getContrasenia()
                + "]";
    }

    @Override
    public void MenuPrincipal() {
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Menu",
                    "Menu Usuarios",
                    0,
                    0,
                    null,
                    MenuPrincipalEnu.values(),
                    MenuPrincipalEnu.values());
            switch (opcion) {
                case 0:
                    String mail = JOptionPane.showInputDialog(null,"Ingresa tu mail");
                    String contrasenia = JOptionPane.showInputDialog(null,"Ingresa tu contrasenia");
                    if (ValidarMail(mail)) {
                        boolean acceso = Login(mail, contrasenia);
                        if (acceso) {
                            MenuAlumno();
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "mail invalido, debe contener '@davinci.edu.ar'");
                    }
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"Registrarse");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

            }
        } while(opcion != 2);

    }
    }









