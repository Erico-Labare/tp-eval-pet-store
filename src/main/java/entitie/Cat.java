package entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe charactérise des chats, format JPA POJO pour créer une table "cat" dans la base de données.
 * Cette classe hérite de la classe Animal
 */
@Entity
@Table(name = "cat")
public class Cat extends Animal implements Serializable {
    /**
     * Id de la puce associé au chat
     */
    @Column(name = "CHIP_ID")
    private String chipId;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Cat() {
    }

    /**
     *
     * @param id id
     * @param birth birth
     * @param couleur couleur
     * @param petStore petStore
     * @param chipId chipId
     */
    public Cat(Long id, Date birth, String couleur, PetStore petStore, String chipId) {
        super(id, birth, couleur, petStore);
        this.chipId = chipId;
    }

    /** Setter
     *@param chipId chipId
     */
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}

