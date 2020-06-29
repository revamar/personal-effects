package com.devops.qa.api.test.reports;

import org.testng.*;

import com.aventstack.extentreports.AnalysisStrategy;

public class ExtentITestListenerAdapter implements ITestListener, IInvokedMethodListener {

    private Boolean createdMethodBeforeInvocation = false;

    public synchronized void onStart(ITestContext context) {
        ExtentService.getInstance().setAnalysisStrategy(AnalysisStrategy.TEST);
    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        ExtentService.getInstance().flush();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
        if (!createdMethodBeforeInvocation)
            ExtentTestManager.createMethod(result);
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        ExtentTestManager.log(result);
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        ExtentTestManager.log(result);
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        ExtentTestManager.log(result);
    }

    @Override
    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.getTestMethod().isBeforeMethodConfiguration()) {
            createdMethodBeforeInvocation = true;
            ExtentTestManager.createMethod(testResult);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

    }

}