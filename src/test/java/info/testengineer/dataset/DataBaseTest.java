package info.testengineer.dataset;

import info.testengineer.base.BaseDatabase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class DataBaseTest extends BaseDatabase {

    private WorkersService service = new WorkersService();

    @Test
    public void testCheckInformation() {
        Workers expectedWorkers = service.get(1);
        Assert.assertNotNull(expectedWorkers);
    }

    @Test
    public void testGetAllPositions() throws Exception {
        List<Workers> workers = service.getAll();
        assertEquals(1, workers.size());
    }

    @Test
    public void testDeleteData() {
        Workers worker = em.find(Workers.class, 1);
        em.getTransaction().begin();
        em.remove(worker);
        em.getTransaction().commit();
        List<Workers> workers = em.createNamedQuery("Workers.getAll", Workers.class).getResultList();
        assertEquals(0, workers.size());
    }
}
