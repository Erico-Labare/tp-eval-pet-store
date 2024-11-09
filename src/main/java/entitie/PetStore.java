package entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

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
     * Liaison One to Many avec la table "animal" représentée dans la classe Animal
     */
    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
    private Set<Animal> animals;

    /**
     * Liaison Many to Many avec la table "product" représentée dans la classe Product
     */
    @ManyToMany
    @JoinTable(
            name = "STORE_PROD",
            joinColumns = @JoinColumn(name = "ID_STORE", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_PROD", referencedColumnName = "ID"))
    private Set<Product> products;

    /**
     * Liaison One to One avec la table "adresse" représentée dans la classe Adresse
     */
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    /**
     *Constructeur vide pour que la classe soit POJO
     */
    public PetStore() {
    }

    /**
     * Constructeur
     * @param id id
     * @param name name
     * @param managerName managerName
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

    /** Getter
     *@return animals
     */
    public Set<Animal> getAnimals() {
        return animals;
    }

    /** Setter
     *@param animals animals
     */
    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    /** Getter
     *@return products
     */
    public Set<Product> getProducts() {
        return products;
    }

    /** Setter
     *@param products products
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    /** Getter
     *@return address
     */
    public Address getAddress() {
        return address;
    }

    /** Setter
     *@param address address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}