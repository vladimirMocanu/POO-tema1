
import java.io.PrintWriter;

/**
 *
 * @author Vladimir
 */
public class Premium extends Basic {

    Premium(String numeObiect1, int nrBasic, int nrPremium, int timestamp) {
        this.numeObiect = numeObiect1;
        this.nrBasic = nrBasic;
        this.nrPremium = nrPremium;
        this.timestamp = timestamp;

    }

    /**
     * Seteaza numele subscriptiei
     */
    @Override
    public void SetNume() {
        this.numeObiect = "Premium";
    }

    /**
     * Decrementeaza subscriptia
     */
    @Override
    public void Decrementare() {

        if (this.nrPremium > 0) {
            this.nrPremium--;
        } else {
            super.Decrementare();
        }

    }

    /**
     * afiseaza in fisierul de output
     *
     * @param out - fisier output
     */
    @Override
    public void display(PrintWriter out) {

        if (this.nrPremium > 0) {
            out.println("Premium");
        } else {
            super.display(out);
        }
    }
}
