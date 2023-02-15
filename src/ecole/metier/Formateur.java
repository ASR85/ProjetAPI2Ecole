package ecole.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *  Classe Formateur de l'école
 *  @author Arnaud
 *  @version 1.0
 *  @see Maitrise
 * @see SessionCours
 */

public class Formateur {
    /**
     * Identifiant unique du formateur
     */
    protected int idFormateur;

    /**
     * Nom du formateur
     */
    protected String nom;

    /**
     * Prénom du formateur
     */
    protected String prenom;

    /**
     * Email du formateur
     */
    protected String mail;


    /**
     * Ensemble des Sessions de cours
     */
    protected List<SessionCours> sessionsCour = new ArrayList<>();

    /**
     * Ensemble des maitrises
     */
    protected List<Maitrise> maitrises = new ArrayList<>();

    /**
     * Constructeur par défaut
     */
    public  Formateur(){};

    /**
     * Constructeur paramétré
     * @param idFormateur ID du formateur
     * @param nom du formateur
     * @param prenom du formateur
     * @param mail du formateur
     */
    public Formateur (int idFormateur, String nom, String prenom, String mail){

        this.idFormateur = idFormateur;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    /**
     * Getter id du formateur
     * @return l'identifiant du formateur
     */
    public int getIdFormateur() {
        return idFormateur;
    }

    /**
     * Setter idFormateur
     * @param idFormateur identifiant du formateur
     */
    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    /**
     * Getter nom
     * @return nom du formateur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter nom
     * @param nom nom du formateur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter prenom
     * @return prenom du formateur
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter prenom
     * @param prenom prenom du formateur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter mail
     * @return mail du formateur
     */
    public String getMail() {
        return mail;
    }

    /**
     * Setter mail
      * @param mail mail du formateur
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Getter Sessions de cours du formateur
     * @return les sessions de cours du formateur
     */
    public List<SessionCours> getSessionsCour() {
        return sessionsCour;
    }

    /**
     * Setter SessionsCours
     * @param sessionsCour Sessions de cours du formateur
     */
    public void setSessionsCour(List<SessionCours> sessionsCour) {
        this.sessionsCour = sessionsCour;
    }

    /**
     * Getter des maitrises du formateur
     * @return maitrises du formateur
     */
    public List<Maitrise> getMaitrises() {
        return maitrises;
    }

    /**
     * Setter maitrises
     * @param maitrises Maitrises du formateur
     */
    public void setMaitrises(List<Maitrise> maitrises) {
        this.maitrises = maitrises;
    }

    /**
     * Egalité de deux formateurs  basée sur le triplet nom,prénom,mail
     * @param o autre élément
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Formateur formateur)) return false;
        return nom.equals(formateur.nom) && prenom.equals(formateur.prenom) && mail.equals(formateur.mail);
    }

    /**
     * calcul du hashcode du formateur basé sur le triplet nom,prénom,mail
     * @return valeur du hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, mail);
    }

    /**
     * Méthode toString
     * @return les informations complètes sur le formateur
     */
    @Override
    public String toString() {
        return "Formateur{" +
                "id Formateur =" + idFormateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }


}

