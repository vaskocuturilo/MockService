package info.testengineer.dataset;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The class Workers service.
 */
public class WorkersService {

    /**
     * The private value entityManager.
     */
    private EntityManager entityManager = Persistence.createEntityManagerFactory("DBUnitExecution").createEntityManager();

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Workers> getAll() {
        TypedQuery<Workers> namedQuery = entityManager.createNamedQuery("Workers.getAll", Workers.class);

        return namedQuery.getResultList();
    }

    /**
     * Get workers.
     *
     * @param id the id
     * @return the workers
     */
    public Workers get(int id) {
        return entityManager.find(Workers.class, id);
    }


    /**
     * Delete.
     *
     * @param workers the workers
     */
    public void delete(Workers workers) {
        entityManager.getTransaction().begin();
        entityManager.remove(workers);
        entityManager.getTransaction().commit();
    }
}
