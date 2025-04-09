
public interface Validaciones {

    default boolean ValidarMail(String mail) {
        if (mail.contains("@davinci.edu.ar")) {
            return true;
        }else {
            return false;
        }
    }
    default boolean ValidarCaracterAlfabetico(String mail) {
        boolean	flag = true;
        for (int i = 0; i < mail.length(); i++) {
            if (!Character.isAlphabetic(mail.charAt(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

