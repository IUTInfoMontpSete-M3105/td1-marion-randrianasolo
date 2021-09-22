package td1;

import java.util.*;

/**
 *
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre, Enseignant chargeDeCours) {
        this.nom = nom;
        this.semestre = semestre;
        this.chargeDeCours = chargeDeCours;
        enseignants = new ArrayList<>();
        participations = new ArrayList<>();
    }

    private String nom;
    private int semestre;
    private Enseignant chargeDeCours;
    private List<Enseignant> enseignants;
    private List<Participation> participations;


    /**
     * @param doc
     */
    public void uploadDoc(String doc) {
        // TODO implement here
    }

    /**
     * @param ens
     */
    public void informerEns(Enseignant ens) {
        // TODO implement here
    }

    /**
     * @param note
     */
    public void informerEtud(int note) {
        // TODO implement here
    }

    /**
     * @param note
     */
    public void notification(int note) {
        // TODO implement here
    }

    public void delivrerCertificat(){
        // TODO implement here
    }

}