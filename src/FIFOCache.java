
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author Vladimir
 * In FIFOCache initializam memorieCache si adaugam in ea
 * In LRUCache nu am mai facut acest luru, toate obiectele se adauga in FIFOCache
 * 
 */
public class FIFOCache implements Cache {

    static int contor = 0;
    static int nrElementeCache = 0;
    ArrayList<Subscriptie> memorieCache = new ArrayList<>();

    FIFOCache() {

    }
    
    /**
     *
     * @param obiectAdd
     */

    @Override
    public void add(Subscriptie obiectAdd) {
        memorieCache.add(obiectAdd);
        nrElementeCache++;
    }

    /**
     *
     * @param obiectRemove - obiect remove
     * @param memorieCache1 - memoria Cache
     * @param nrOperatii - numarul de operatii ADD si GET
     *
     */
    @Override
    public void remove(Subscriptie obiectRemove, ArrayList<Subscriptie> memorieCache1, int nrOperatii) {
        int index = memorieCache.indexOf(obiectRemove);
        if (index >= 0) {
            memorieCache.remove(obiectRemove);
            nrElementeCache--;
        }
    }

    public void verificareCache(Subscriptie b, PrintWriter out, int maxCache, String tipCache, int nrOperatii) {
        LRUCache lru = new LRUCache();
        int contor1 = 0;

        if (memorieCache.isEmpty()) {
            add(b);
            out.printf("1 ");
            return;
        }
        for (Subscriptie c : memorieCache) {
            if (b.numeObiect.equals(c.numeObiect)) {
                out.printf("0 ");
                contor1 = 1;
                return;
            }
        }
        if (contor1 == 0) {
            if (nrElementeCache >= maxCache) {

                if ("FIFO".equals(tipCache)) {
                    remove(memorieCache.get(0), memorieCache, nrOperatii);
                } else if ("LRU".equals(tipCache)) {
                    lru.remove(b, memorieCache, nrOperatii);

                }

            }
            add(b);
            out.printf("1 ");
        }
    }
}
