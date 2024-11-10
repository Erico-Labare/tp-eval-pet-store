package entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe charactérise des animaux, format JPA POJO pour créer une table "animal" dans la base de données.
 * Cette classe est la class mère de plusieurs classes filles
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "animal")
public abstract class Animal implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Date de naissance
     */
    @Column(name = "BIRTH")
    private Date birth;
    /**
     * Couleur de la peau/poils/écailles
     */
    @Column(name = "COULEUR")
    private String couleur;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Animal() {
    }

    /**
     * Liaison Many to One avec la table "pet_store" représentée dans la classe Petstore
     */
    @ManyToOne
    @JoinColumn(name = "ID_PETSTORE")
    private PetStore petStore;

    /**
     * Constructeur
     * @param id id
     * @param birth birth
     * @param couleur couleur
     * @param petStore petStore
     */
    public Animal(Long id, Date birth, String couleur, PetStore petStore) {
        this.id = id;
        this.birth = birth;
        this.couleur = couleur;
        this.petStore=petStore;
    }

    /** Getter
     *@return id
     */
    public Long getId() {
        return id;
    }

    /** Setter
     *@param birth birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /** Setter
     *@param couleur couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /** Setter
     *@param petStore petStore
     */
    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
