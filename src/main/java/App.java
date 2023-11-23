import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[]args){
        // Veritabanına bağlanmak için:
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_management_system");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        //transaction u başlatmak için:
        //entityManager.getTransaction().begin();




        // eğer hata alınmazsa commitleme işlemi yap
        //entityManager.getTransaction().commit();
    }
}
