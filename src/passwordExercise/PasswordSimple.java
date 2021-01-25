package passwordExercise;

public class PasswordSimple extends Password{

    //Debe tener al menos 1 número
    public PasswordSimple() {
        this.setPass( new Regex("(?=.*[0-9])") );
    }

}
