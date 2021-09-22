package td1;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(String document, String date, int points, Devoir devoir, Enseignant enseignant) {
        this.document = document;
        this.date = date;
        this.points = points;
        this.devoir = devoir;
        this.enseignant = enseignant;
    }

    private String document;
    private String date;
    private int points;
    private Devoir devoir;
    private Enseignant enseignant;


    /**
     * @param doc
     */
    public void setDocument(String doc) {
        this.document=doc;
    }

    /**
     * @param ens
     */
    public void affecterEns(Enseignant ens) {
        this.enseignant = ens;
    }

    /**
     * 
     */
    public String getDoc() {
        return document;
    }

    /**
     * @param note
     */
    public void setNote(int note) {
        this.points=note;
    }

}