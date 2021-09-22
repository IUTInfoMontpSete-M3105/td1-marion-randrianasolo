package td1;

/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */
    public Enseignant(String nom, String prenom, String adresse, String mail, int numem, int harpege) {
        super(nom,prenom,adresse,mail);
        this.numem=numem;
        this.harpege=harpege;
    }


    private int harpege;
    private int numem;



    public Devoir creerDevoir(String nom, String description, String deadline, int nbrePoints, Cours cours){
        return new Devoir(nom,description,deadline,nbrePoints,cours);
    }

    public void donner(Cours cours){
        // TODO implement here
    }

    public void participer(Cours cours){
        // TODO implement here
    }

    public void corriger(Rendu rendu){
        // TODO implement here
    }

}