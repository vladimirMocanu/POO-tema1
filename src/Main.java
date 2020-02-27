
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Vladimir
 */
public class Main {

    /**
     *
     * @param args - argumente in linia de comanda
     * @throws FileNotFoundException
     * @throws IOException
     * in functia main parcurgem fisierul si apelam functiile ADD si GET
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File input = new File(args[0]);
        Scanner in = new Scanner(input);
        FileWriter out = new FileWriter(args[1]);
        try (PrintWriter printWriter = new PrintWriter(out)) {
            Memorie memorie1 = new Memorie(); //pentru memorie
            
            String tipCache;
            int maxCache;
            int nrOperatii;
            
            tipCache = in.nextLine();
            maxCache = in.nextInt();
            nrOperatii = in.nextInt();
            
            int nrBasic = 0;
            int nrPremium = 0;
            
            String numeObiect = "dada";
            String numeObiectGet;
            
            for (int i = 0; i < nrOperatii; i++) {
                
                if ("ADD".equals(in.next())) {
                    
                    if (in.hasNext()) {
                        numeObiect = in.next();
                    }
                    if (in.hasNextInt()) {
                        nrBasic = in.nextInt();
                    }
                    if (in.hasNextInt()) {
                        nrPremium = in.nextInt();
                    } else {
                        nrPremium = 0;
                    }
                    memorie1.ADD(numeObiect, nrBasic, nrPremium); //pentru memorie
                } else {
                    if (in.hasNext()) {
                        numeObiectGet = in.next();
                        memorie1.GET(numeObiectGet, printWriter, maxCache, tipCache, nrOperatii);
                    }
                }
            }
        } //pentru memorie
    }
}
