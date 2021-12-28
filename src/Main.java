import com.abdel.Vehicul;
import com.abdel.Voiture;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bonjour Bien venu sur mon programme en IntelliJ");

        Voiture voiture = new Voiture("307 HDi", 4);

        String pro = voiture.caracteristique();
        System.out.println(pro);
    }
}
