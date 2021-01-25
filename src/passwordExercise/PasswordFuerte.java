package passwordExercise;

public class PasswordFuerte extends Password{

    //Definimos el constructor harcodeado como dice el enunciado
    public PasswordFuerte() {
        this.setPass( new Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$") );
    }

        /*
        ^                 # start-of-string
        (?=.*[0-9])       # a digit must occur at least once
        (?=.*[a-z])       # a lower case letter must occur at least once
        (?=.*[A-Z])       # an upper case letter must occur at least once
        (?=.*[@#$%^&+=])  # a special character must occur at least once
        (?=\S+$)          # no whitespace allowed in the entire string
        .{8,}             # anything, at least eight places though
        $                 # end-of-string
     */

    public static void main(String[] args) {
        PasswordFuerte unaPasswordFuerte = new PasswordFuerte();
        unaPasswordFuerte.setValue("P@so999aaa");
    }
}
