package automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//onStart:获取运行测试的目录
//onFinish:存储所有已运行测试的信息
//onTestStart:指示特定的测试方法已经开始
//onTestSkipped：指示特定的测试方法已被跳过
//onTestSuccess:指示特定的测试方法已成功完成其执行
//onTestFailure:指示特定的测试方法已失败
//onTestFailedButWithinSuccessPercentage:每次测试方法失败但在提及的成功百分比之
// 内，都会调用此方法。 为了实现此方法，我们在TestNG中使用两个属性作为测试注释的参数，
// 即successPercentage和invocationCount。 成功百分比取成功百分比的值，调用计数表
// 示特定测试方法将执行的次数。
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
