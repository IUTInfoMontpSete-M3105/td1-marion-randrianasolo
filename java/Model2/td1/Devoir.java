package td1;

import java.util.*;

/**
 *
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String description, String deadline, int nbrePoints, Cours cours) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.nbrePoints = nbrePoints;
        this.cours = cours;
        rendu = new ArrayList<>();
    }



    private String nom;
    private String description;
    private String deadline;
    private int nbrePoints;
    private List<Rendu> rendu;
    private Cours cours;

    @Override
    public String toString() {
        return "Devoir{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", nbrePoints=" + nbrePoints +'\''+
                ", rendu=" + rendu + '\''+
                ", cours=" + cours + '\''+
                '}';
    }
}