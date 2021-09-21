/**
 * 
 */
public class Participation {

    /**
     * Default constructor
     */
    public Participation(Etudiant etudiant, int totalPoints, String appreciation, Cours cours) {
        this.etudiant = etudiant;
        this.totalPoints = totalPoints;
        this.appreciation = appreciation;
        this.cours = cours;
    }

    /**
     * 
     */
    private Etudiant etudiant;
    private int totalPoints;
    private String appreciation;
    private Cours cours;
    public EP EP;


    /**
     * @param note
     */
    public void updateParticip(int note) {
        // TODO implement here
    }

    public void delivrerCertificat(){
        // TODO implement here
    }

}