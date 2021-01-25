package passwordExercise;


import java.util.regex.PatternSyntaxException;

public class Password {

    private static Regex pass;

    public Regex getPass() {
        return pass;
    }

    public void setPass(Regex pass) {
        this.pass = pass;
    }

    public Password() {
    }

    public Password(Regex regex) {
        this.pass = regex;
    }

    public static void setValue(String pwd)
    {
        if ( pass.isValid(pwd) )
        {
            System.out.println("Contraseña válida");
        }else
        {
            throw new PatternSyntaxException("Contraseña inválida", pass.getPatron(), 0);
        }
    }

}
