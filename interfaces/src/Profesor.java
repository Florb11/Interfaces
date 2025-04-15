import javax.swing.JOptionPane;

public class Profesor extends Usuario {

    private String titulo;

    public Profesor(String mail, String contrasenia, String titulo) {
        super(mail, contrasenia);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Profesor [titulo=" + titulo + "]";
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
                            MenuProfesor();
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
