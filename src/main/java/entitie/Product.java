package entitie;

import enumPack.ProdType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

/**
 * Classe charactérisant des produits, format JPA POJO pour créer une table "product" dans la base de données
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    /**
     * Id qui sert de clef primaire dans la table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /**
     * Code identifiant un produit
     */
    @Column(name = "CODE")
    private String code;
    /**
     * Nom du produit
     */
    @Column(name = "LABEL")
    private String label;
    /**
     * Catégorie du produit issue de l'enum "ProdType"
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private ProdType type;
    /**
     * Prix du produit
     */
    @Column(name = "PRICE")
    private double price;

    /**
     * Liaison Many to Many avec la table "pet_store" représentée dans la classe Product
     */
    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petStores;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public Product() {
    }

    /**
     * Constructeur
     * @param id id
     * @param code code
     * @param label label
     * @param type type
     * @param price price
     */
    public Product(Long id, String code, String label, ProdType type, double price) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
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
     *@return code
     */
    public String getCode() {
        return code;
    }

    /** Setter
     *@param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** Getter
     *@return label
     */
    public String getLabel() {
        return label;
    }

    /** Setter
     *@param label label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /** Getter
     *@return type
     */
    public ProdType getType() {
        return type;
    }

    /** Setter
     *@param type type
     */
    public void setType(ProdType type) {
        this.type = type;
    }

    /** Getter
     *@return price
     */
    public double getPrice() {
        return price;
    }

    /** Setter
     *@param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Getter
     *@return petStores
     */
    public Set<PetStore> getPetStores() {
        return petStores;
    }

    /** Setter
     *@param petStores petStores
     */
    public void setPetStores(Set<PetStore> petStores) {
        this.petStores = petStores;
    }
}

