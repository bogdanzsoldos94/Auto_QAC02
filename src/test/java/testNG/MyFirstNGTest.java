package testNG;

import courses.java.intro.calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    @Test

public class MyFirstNGTest {

        @BeforeTest
        public void setUp(){
            System.out.println("Set up before each test run");

        }

        @BeforeClass
        public static void setUpClass() {
            System.out.println("Set up before class");
        }

    public void test1(){
        System.out.println("This is test1");

    }

    @Test

    public void test2(){
        System.out.println("This is test2");

        }

    }



