package td1;

public class App {

    public static void main(String[] args) {

        Administrateur administrateur = new Administrateur("Edison","Park","Los Angeles", "edisonpark@gmail.com");

        Enseignant ens1 = new Enseignant("Fu","Leslie","San Francisco", "fuslie@gmail.com",30,4310);
        Enseignant ens2 = new Enseignant("Fooze","April","Los Santos", "aprilfooze@gmail.com",20,8070);

        Etudiant etudiant1 = new Etudiant("Sumi","Natalie","Los Santos","natsumi@gmail.com","244243FR");
        Etudiant etudiant2 = new Etudiant("Luo", "Wendy","Toronto","wendell@gmail.com","345133WL");

        Cours coursProg = new Cours("prog",3,ens1);

        Devoir devoir1 = ens1.creerDevoir("prog","Récursivité","16/08/2021",11,coursProg);
        Devoir devoir2 = ens2.creerDevoir("prog", "Optimisation","20/08/2021",13,coursProg);



    }

}
