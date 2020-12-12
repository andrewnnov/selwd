package testngtutorial.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ItestListeners interface which implements Testing
public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("I succesfuly executed Listeners Pass code");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        //screenshot code
        //response if APIis faild

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
