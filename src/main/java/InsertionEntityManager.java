import entitie.*;
import enumPack.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe pour remplir la DataBase PetStore avec des données définis
 */
public class InsertionEntityManager {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp-eval-pet-store");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Adresses

        Address address1 = new Address();
        address1.setNumber("123");
        address1.setStreet("Rue de la rue");
        address1.setZipCode("31500");
        address1.setCity("Toulouse");
        em.persist(address1);

        Address address2 = new Address();
        address2.setNumber("321");
        address2.setStreet("Rue de l'avenue");
        address2.setZipCode("31500");
        address2.setCity("Toulouse");
        em.persist(address2);

        Address address3 = new Address();
        address3.setNumber("121");
        address3.setStreet("Rue de l'impasse");
        address3.setZipCode("31500");
        address3.setCity("Toulouse");
        em.persist(address3);

        // Produits

        Product product1 = new Product();
        product1.setCode("FOOD01");
        product1.setLabel("Nourriture pour chien");
        product1.setType(ProdType.Food);
        product1.setPrice(10.0);
        em.persist(product1);

        Product product2 = new Product();
        product2.setCode("ACC01");
        product2.setLabel("Laisse pour chien");
        product2.setType(ProdType.Accessory);
        product2.setPrice(15.0);
        em.persist(product2);

        Product product3 = new Product();
        product3.setCode("PEI01");
        product3.setLabel("Peigne pour chien");
        product3.setType(ProdType.Cleaning);
        product3.setPrice(5.0);
        em.persist(product3);

        // PetStore

        PetStore petStore1 = new PetStore();
        petStore1.setName("Animo");
        petStore1.setManagerName("Jean Bon");
        petStore1.setAddress(address1);
        Set<Product> listProduits1 = new HashSet<>();
        listProduits1.add(product1);
        listProduits1.add(product2);
        petStore1.setProducts(listProduits1);
        em.persist(petStore1);

        PetStore petStore2 = new PetStore();
        petStore2.setName("Chien & Poisson");
        petStore2.setManagerName("Bilbon LeHobbit");
        petStore2.setAddress(address2);
        Set<Product> listProduits2 = new HashSet<>();
        listProduits2.add(product2);
        listProduits2.add(product3);
        petStore2.setProducts(listProduits2);
        em.persist(petStore2);

        PetStore petStore3 = new PetStore();
        petStore3.setName("Pet SHOP");
        petStore3.setManagerName("Jean Petit");
        petStore3.setAddress(address3);
        Set<Product> listProduits3 = new HashSet<>();
        listProduits3.add(product3);
        listProduits3.add(product1);
        petStore3.setProducts(listProduits3);
        em.persist(petStore3);

        // Animaux

        Fish fish1 = new Fish();
        fish1.setBirth(new Date());
        fish1.setCouleur("Rouge");
        fish1.setLivingEnv(FishLivEnv.Fresh_Water);
        fish1.setPetStore(petStore3);
        em.persist(fish1);

        Fish fish2 = new Fish();
        fish2.setBirth(new Date());
        fish2.setCouleur("Bleu");
        fish2.setLivingEnv(FishLivEnv.Sea_Water);
        fish2.setPetStore(petStore1);
        em.persist(fish2);

        Fish fish3 = new Fish();
        fish3.setBirth(new Date());
        fish3.setCouleur("Vert");
        fish3.setLivingEnv(FishLivEnv.Sea_Water);
        fish3.setPetStore(petStore1);
        em.persist(fish3);

        Cat cat1 = new Cat();
        cat1.setBirth(new Date());
        cat1.setCouleur("Noir");
        cat1.setChipId("P3PDJ9384");
        cat1.setPetStore(petStore3);
        em.persist(cat1);

        Cat cat2 = new Cat();
        cat2.setBirth(new Date());
        cat2.setCouleur("Blanc");
        cat2.setChipId("JU76T5RF5");
        cat2.setPetStore(petStore2);
        em.persist(cat2);

        Cat cat3 = new Cat();
        cat3.setBirth(new Date());
        cat3.setCouleur("Orange");
        cat3.setChipId("OP9IUY654");
        cat3.setPetStore(petStore2);
        em.persist(cat3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

