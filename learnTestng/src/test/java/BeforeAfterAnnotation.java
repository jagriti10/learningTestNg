import org.testng.annotations.*;

public class BeforeAfterAnnotation {

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("I'm inside BeforeMethod");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("I'm inside BeforeClass");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.println("I'm inside BeforeTest");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("I'm inside AfterMethod");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("I'm inside AfterClass");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("I'm inside AfterTest");
    }
}
