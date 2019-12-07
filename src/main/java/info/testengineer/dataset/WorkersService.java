package info.testengineer.dataset;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The class Workers service.
 */
public class WorkersService {
    private EntityManager em = Persistence.createEntityManagerFactory("DBUnitExecution").createEntityManager();

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Workers> getAll() {
        TypedQuery<Workers> namedQuery = em.createNamedQuery("Workers.getAll", Workers.class);

        return namedQuery.getResultList();
    }

    /**
     * Get workers.
     *
     * @param id the id
     * @return the workers
     */
    public Workers get(int id) {
        return em.find(Workers.class, id);
    }


}
