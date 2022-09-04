package Point;

import javax.persistence.*;
import java.util.*;

public class Inicio {
    public static void main(String[] args) {
        // Abrimos la conexión de la base de datos
        // Creamos la DB en caso de no existir
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/Juan.odb");
        EntityManager em = emf.createEntityManager();

        // Almacenamos 1000 objetos de tipo punto
        em.getTransaction().begin();
        for (int i = 0; i < 10; i++) {
            Point p = new Point(i, 2*i);
            em.persist(p);
        }
        em.getTransaction().commit();

        // Encontramos el numeros de objetos creados.
        Query q1 = em.createQuery("SELECT COUNT(p) FROM Point p");
        System.out.println("Total Points: " + q1.getSingleResult());

        // Encontrar el valor medio de X.
        Query q2 = em.createQuery("SELECT AVG(p.x) FROM Point p");
        System.out.println("Average X: " + q2.getSingleResult());

        // Listamos todos los puntos de la base de datos.
        TypedQuery<Point> query = em.createQuery("SELECT p FROM Point p", Point.class);
        List<Point> results = query.getResultList();
        for (Point p : results) {
            System.out.println(p);
        }

        // Cerramos la conexión con la base de datos.
        em.close();
        emf.close();
    }
}
