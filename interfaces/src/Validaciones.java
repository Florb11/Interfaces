
public interface Validaciones {

    default boolean ValidarMail(String mail) { // el default no te olbiga a implementar el metodo
        if (mail.contains("@davinci.edu.ar")) {
            return true;
        }else {
            return false;
        }
    }
    //default boolean ValidarCaracterAlfabetico(String contrasenia) {
    //boolean	flag = true;
    //for (int i = 0; i < contrasenia.length(); i++) {
    //if (!Character.isAlphabetic(contrasenia.charAt(i))) {
    //flag = false;
    //break;
    //}
    //}
    //return flag;
    //}

}

