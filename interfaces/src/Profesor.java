import javax.swing.JOptionPane;

public class Profesor extends Usuario implements Menu{

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
    public void Login(String mail, String contrasenia) {
        MenuPrincipal();

    }

    @Override
    public void MenuPrincipal() {
        JOptionPane.showMessageDialog(null, "Menu profesor");

    }




}