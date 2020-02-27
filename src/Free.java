
import java.io.PrintWriter;

/**
 *
 * @author Vladimir
 */
public class Free extends Subscriptie {

    Free() {

    }

    /**
     * Seteaza numele subscriptiei
     */
    @Override
    public void SetNume() {
    }
    /**
     * Decrementeaza subscriptia
     */
    @Override
    public void Decrementare() {

    }
   /**
     * afiseaza in fisierul de output
     * @param out - fisier output
     */
    @Override
    public void display(PrintWriter out) {
        out.println("Free");

    }

}
