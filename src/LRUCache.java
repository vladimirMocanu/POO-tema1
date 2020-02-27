
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class LRUCache implements Cache {

    /**
     *
     * @param obiectADD - obiect add
     */
    @Override
    public void add(Subscriptie obiectADD ) {
    }

    /**
     *
     * @param obiectRemove - obiect remove
     * @param memorieCache - memoria Cache
     * @param nrOperatii - numarul de operatii ADD si GET
     */
    @Override
    public void remove(Subscriptie obiectRemove, ArrayList<Subscriptie> memorieCache, int nrOperatii) {
        int min = nrOperatii;
        int index = -1;
        int index2 = -1;

        for (Subscriptie c : memorieCache) {
            if (min > c.timestamp) {
                min = c.timestamp;
                index = memorieCache.indexOf(c);
            }
            index2 = memorieCache.indexOf(c);

        }
        if (index >= 0) {
            memorieCache.set(index, memorieCache.get(index2));
            memorieCache.remove(index2);
            FIFOCache.nrElementeCache--;
        }
    }
}
