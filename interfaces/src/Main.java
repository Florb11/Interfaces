import javax.swing.JOptionPane;

public class Main implements Validaciones {

    public static void main(String[] args) {

        Alumno agustin = new Alumno("agustin@davinci.edu.ar","abcd");

        Profesor yo = new Profesor("gamaliel.quiroz@davinci.edu.ar","12345","Desarrollador de software");

        //agustin.MenuPrincipal();
        yo.MenuPrincipal();


    }

}