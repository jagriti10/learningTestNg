package Browsers;

import org.testng.annotations.Test;

public class SafariTest {
    @Test
    public void testcase1()
    {
        System.out.println("I'm testcase1 of safari");
    }

    @Test(enabled=false)
    public void testcase2()
    {
        System.out.println("I'm testcase2 of safari");
    }
}
