package Browsers;

import org.testng.annotations.Test;

public class EdgeTest {
    @Test(dependsOnMethods = {"testcase2"})
    public void testcase1()
    {
        System.out.println("I'm testcase1 of edge");
    }

    @Test
    public void testcase2()
    {
        System.out.println("I'm testcase2 of egde");
    }
}
