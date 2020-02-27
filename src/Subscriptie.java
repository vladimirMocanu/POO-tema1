
import java.io.PrintWriter;

/**
 *
 * @author Vladimir
 */
public abstract class Subscriptie {

    String numeObiect;
    int nrPremium;
    int nrBasic;
    int timestamp;

    Subscriptie() {

    }

    /**
     * Seteaza numele subscriptiei
     */
    public void SetNume() {
    }

    /**
     * Decrementeaza subscriptia
     */
    public void Decrementare() {
    }

    /**
     * afiseaza in fisierul de output
     * @param out - fisier output
     */
    public void display(PrintWriter out) {
    }

}
