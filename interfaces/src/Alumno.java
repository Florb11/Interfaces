import javax.swing.*;

//creo la clase alumno , alumno hereda de usuario
//puede usar todos los datos y funciones de usuario
public class Alumno extends Usuario implements Validaciones,Menu{
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
    public void Login(String mail, String contrasenia) {

//		JOptionPane.showMessageDialog(null,
//				(ValidarCaracterAlfabetico(mail)==true?"Correcto":"incorrecto"));
//
        if (	ValidarMail(mail) &&
                this.getMail().equals(mail)
                &&
                this.getContrasenia().equals(contrasenia)
        ) {
            MenuPrincipal();
        }else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }
    @Override
    public void MenuPrincipal() {
        JOptionPane.showMessageDialog(null, "Menu alumno");

    }



}
