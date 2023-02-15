package ecole.metier;

/**
 * Class Cours de l'école
 * @author Arnaud
 * @version 1.0
 */
public class Cours {

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String matiere;

    /**
     *
     */
    private String description;


    public Cours(){}

    public Cours (int id, String matiere, String description){

        this.id = id;
        this.matiere = matiere;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", matiere='" + matiere + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
