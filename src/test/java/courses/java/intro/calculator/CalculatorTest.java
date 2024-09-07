package courses.java.intro.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp(){
        System.out.println("Set up before each test run");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Set up before class");
    }

    @Test
    public void verifyAdditionComputeTest(){
    System.out.println("Verify audition works accordingly");
    Assert.assertEquals(5, calculator.compute(2,3,"+"),3);
    Assert.assertEquals(-1, calculator.compute(-4,3,"+"),3);

    }

    @Test
    public void verifyUnsupportedOperator(){
        System.out.println("Verify unsupported operator");
        try {
            calculator.compute(1, 4, "op");
            Assert.fail();
        } catch (IllegalArgumentException e){
            System.out.println("Test return expected IllegalArgumentException: " + e.getMessage());
            Assert.assertEquals("UNSUPPORTED OPERATOR: op", e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperator2(){
        System.out.println("Verify unsupported operator");
        calculator.compute(1,4,"op2");
    }

    @After
    public void cleanUp(){
        System.out.println("Clean up after each test run");
    }

    @AfterClass
    public static void  cleanAfterClass(){
        System.out.println("Clean up after class run");
    }
}