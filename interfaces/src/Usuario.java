
public class Usuario {
    //Atributos
    private String mail;
    private String contrasenia;
    //Constructor
    public Usuario(String mail, String contrasenia) {
        super();
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
    public void Login(String mail, String contrasenia) {

    }


}
