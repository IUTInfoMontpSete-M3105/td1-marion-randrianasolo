
import java.util.*;

/**
 * 
 */
public class Etudiant extends Utilisateur {

    /**
     * Default constructor
     */
    public Etudiant(String nom, String prenom, String adresse, String mail, String numEtudiant) {
        super(nom,prenom,adresse,mail);
        this.numEtudiant = numEtudiant;
    }

    private String numEtudiant;

    /**
     * 
     */
    public void participer(Cours cours) {
        // TODO implement here
    }

}