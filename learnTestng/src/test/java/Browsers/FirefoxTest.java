package Browsers;

import org.testng.annotations.Test;

public class FirefoxTest {
    @Test(priority=2)
    public void testcase1()
    {
        System.out.println("I'm testcase1 of firefox");
    }

    @Test(priority=1)
    public void testcase2()
    {
        System.out.println("I'm testcase2 of firefox");
    }
}
