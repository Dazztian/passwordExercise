package passwordExercise;

public class PasswordIntermedia extends Password{

    public PasswordIntermedia() {
        //Longitud mínima 8 caracteres, debe incluir números y letras
        this.setPass( new Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$") );
    }

}
