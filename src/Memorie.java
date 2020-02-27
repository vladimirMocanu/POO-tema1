
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class Memorie {

    static int timestamp = 0;
    ArrayList<Subscriptie> memoriePrincipala = new ArrayList<>();
    FIFOCache cache = new FIFOCache();

    Memorie() {

    }
      /**
     *
     * @param numeObiect1 - numele obiectului pentru ADD
     * @param nrBasic - numarul de subscriptii Basic
     * @param nrPremium - numarul de subscriptii Premium
     * in functia ADD adugam in memoriePrincipala
     */
    public void ADD(String numeObiect1, int nrBasic, int nrPremium) {
        int contor = 0;
        timestamp++;

        if (memoriePrincipala.isEmpty()) {
            memoriePrincipala.add(new Premium(numeObiect1, nrBasic, nrPremium, timestamp));
            contor = 1;
        } else {
            for (Subscriptie b : memoriePrincipala) {
                if (numeObiect1.equals(b.numeObiect)) {
                    cache.remove(b, memoriePrincipala, 0);
                    b.nrBasic = nrBasic;
                    b.nrPremium = nrPremium;
                    b.timestamp = timestamp;
                    contor = 1;
                    break;
                }
            }
        }
        if (contor == 0) {
            memoriePrincipala.add(new Premium(numeObiect1, nrBasic, nrPremium, timestamp));
        }
    }
    /**
     *
     * @param numeObiectGet - numele obiectului pt comanda GET
     * @param out - fisier out
     * @param maxCache - maximul Cache
     * @param tipCache - tipul de Cache
     * @param nrOperatii - numarul de operatii ADD si GET
     * In functia GET verificam daca obiectul este si in memorieCache
     * Si il decrementam(apelam alta functie)
     */
    public void GET(String numeObiectGet, PrintWriter out, int maxCache, String tipCache, int nrOperatii) {
        timestamp++;
        int contor = 0;

        for (Subscriptie b : memoriePrincipala) {
            if (numeObiectGet.equals(b.numeObiect)) {
                b.timestamp = timestamp;
                cache.verificareCache(b, out, maxCache, tipCache, nrOperatii);
                b.display(out);
                b.Decrementare();
                contor = 1;
                break;
            }
        }
        if (contor != 1) {
            out.println("2");
        }
    }
}
