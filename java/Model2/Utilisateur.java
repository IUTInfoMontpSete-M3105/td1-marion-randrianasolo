
import java.util.*;

/**
 * 
 */
public abstract class Utilisateur {

    /**
     * Default constructor
     * @param nom
     * @param prenom
     * @param adresse
     * @param mail
     */
    public Utilisateur(String nom, String prenom, String adresse, String mail) {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.mail=mail;
    }

    /**
     * 
     */
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;

}