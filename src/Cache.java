
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public interface Cache {

   /**
     *
     * @param obiectADD - obiect add
     * 
     */
    public void add(Subscriptie obiectADD);

    /**
     *
     * @param obiectRemove - obiect remove
     * @param memorieCache - memoria Cache
     * @param nrOperatii - numarul de operatii ADD si GET
     */
    public void remove(Subscriptie obiectRemove, ArrayList<Subscriptie> memorieCache, int nrOperatii);

}
