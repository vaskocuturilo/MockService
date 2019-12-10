package info.testengineer.dataset;

import info.testengineer.base.BaseDatabase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class DataBaseTest extends BaseDatabase {

    private WorkersService workersService = new WorkersService();

    @Test
    public void testCheckInformation() {
        Workers expectedWorkers = workersService.get(1);
        Assert.assertNotNull(expectedWorkers);
    }

    @Test
    public void testGetAllPositions() throws Exception {
        List<Workers> workers = workersService.getAll();
        assertEquals(1, workers.size());
    }

    @Test
    public void testDeleteData() {
        Workers newWorkers = new Workers();
        newWorkers.setId(2);
        newWorkers.setFirstName("Test");
        newWorkers.setLastName("Test");
        newWorkers.setDepartment("Test");
        newWorkers.setLocation("Test");
        workersService.delete(newWorkers);
        List<Workers> workers = workersService.getAll();
        assertEquals(0, workers.size());
    }
}
