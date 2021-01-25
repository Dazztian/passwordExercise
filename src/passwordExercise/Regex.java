package passwordExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Regex {

    String patron;

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public Regex(String patron) {
        this.patron = patron;
    }

    public boolean isValid( String cadenaAAnalizar)
    {
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadenaAAnalizar);
        return matcher.find();
    }

   
}
