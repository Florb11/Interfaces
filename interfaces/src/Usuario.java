import javax.swing.*;

public abstract class Usuario implements Menu, Validaciones{
    //Atributos
    private String mail;
    private String contrasenia;
    //Constructor
    public Usuario(String mail, String contrasenia) {
        this.mail = mail;
        this.contrasenia = contrasenia;
    }
    //Getters y Setters
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    //To string
    @Override
    public String toString() {
        return "Usuario [mail=" + mail + ", contrasenia=" + contrasenia + "]";
    }

    public boolean Login(String mail, String contrasenia){
        if(this.getContrasenia().equals(contrasenia) && this.getMail().equals(mail)){
            JOptionPane.showMessageDialog(null,"podes loguear");
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"los datos no coinciden");
            return false;
        }
    }
    public void MenuAlumno(){
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Menu",
                    "Menu Alumno",
                    0,
                    0,
                    null,
                    MenuAlumnosEnu.values(),
                    MenuAlumnosEnu.values());
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ver clases");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Ver notas");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

            }
        } while(opcion != 2);

    }
    //esta funcion viene de la interfaz Menu ( la pueden implementar los hijos de usuario)
    public void MenuProfesor(){
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Menu",
                    "Menu Profesor",
                    0,
                    0,
                    null,
                    MenuProfesorEnu.values(),
                    MenuProfesorEnu.values());
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ver horarios");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Ver Clases");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

            }
        } while(opcion != 2);

    }


    //esta funcion viene de la interfaz Menu ( la pueden implementar los hijos de usuario)
    public  void MenuPrincipal() {
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

