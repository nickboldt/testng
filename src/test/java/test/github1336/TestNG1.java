package test.github1336;

import org.testng.annotations.Test;

public class TestNG1 extends BaseClass {
    @Test(priority = 1)
    public void test1TestNG1() throws InterruptedException {
        runTest("http://testng.org/doc/download.html");
    }

    @Test(priority = 2)
    public void test2TestNG1() throws InterruptedException {
        runTest("http://www3.lenovo.com/in/en/");
    }

    @Test(priority = 3)
    public void test3TestNG1() throws InterruptedException {
        runTest("https://github.com/");
    }
}
