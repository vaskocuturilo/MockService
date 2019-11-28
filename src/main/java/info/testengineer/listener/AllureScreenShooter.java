package info.testengineer.listener;

import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;


/**
 * The class Allure screen shooter.
 */
public class AllureScreenShooter extends ExitCodeListener {

    /**
     * The method onTestFailure.
     *
     * @param result this is ITestResult.
     */
    public void onTestFailure(final ITestResult result) {
        super.onTestFailure(result);
        AllureHelpers.takeScreenshot();

    }
}
