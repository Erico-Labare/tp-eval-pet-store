import entitie.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

/**
 * Classe qui requête à la database l'int "petStoreId"
 * et renvoie sous forme de la liste "animals" tous les animaux lié aux entrés de la table PetSore de même ID
 * les affiches ensuite avec leur ID et Type respectif
 */
public class TestQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp-eval-pet-store");
        EntityManager em = emf.createEntityManager();

        int petStoreId = 3;

        List<Animal> animals = em.createQuery(
                        "SELECT a FROM Animal a WHERE a.petStore.id = :petStoreId", Animal.class)
                .setParameter("petStoreId", petStoreId)
                .getResultList();

        for (Animal animal : animals) {
            System.out.println("ID Animal: " + animal.getId() + ", Type: " + animal.getClass().getSimpleName());
        }

        em.close();
        emf.close();
    }
}