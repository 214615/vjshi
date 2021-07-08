package Automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        System.out.println("passeas "+result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("kip "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("ok "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Failures "+result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("% "+result.getName());
    }
    @Override
    public void onStart(ITestContext context){
        System.out.println("This is onStart method "+context.getOutputDirectory());
    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println("This is onStart method "+context.getPassedConfigurations());
        System.out.println("This is onStart method "+context.getFailedConfigurations());
    }
}
