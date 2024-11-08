package entitie;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * Classe charactérisant le magasin, format JPA POJO pour créer une table "pet_store" dans la base de données
 */
@Entity
@Table(name = "pet_store")
public class PetStore implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Nom du magasin
     */
    @Column(name = "NAME")
    private String name;
    /**
     * Nom du manager du magasin
     */
    @Column(name = "MANAGER_NAME")
    private String managerName;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public PetStore() {
    }

    /**
     * Constructeur
     * @param id
     * @param name
     * @param managerName
     */
    public PetStore(Long id, String name, String managerName) {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
    }

    /** Getter
     *@return id
     */
    public Long getId() {
        return id;
    }

    /** Setter
     *@param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** Getter
     *@return name
     */
    public String getName() {
        return name;
    }

    /** Setter
     *@param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Getter
     *@return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    /** Setter
     *@param managerName managerName
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}