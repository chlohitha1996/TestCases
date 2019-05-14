import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    /**
     *
     */
    static Palindrome p;

    @BeforeClass
    public static void setUpBeforeClass()
    {
        p=new Palindrome();

        System.out.println("Inside BeforeClass");
        System.out.println("Before class: Executed only once");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {

        p=null;
        /* All the resources are made to null */
        System.out.println("Inside AfterClass");
        System.out.println("After class: Executed only once");

    }

    @Before
    public void setUp()
    {
        //arrange


        System.out.println("Inside Before method - Executed for every @Test method");

    }

    @After
    public void tearDown()
    {
        //arrange


        System.out.println("Inside After method - Executed after every @Test method");

    }

    @Test
    public void getPalindromeNumber()
    {

        int result =p.palindromeCheck("171");
        assertEquals(1,1);
    }

    @Test
    public void getPalindromeNonNumber()
    {
        int result =p.palindromeCheck("145");
        assertEquals(0,0);
    }
    @Test
    public void getPalindromeString()
    {

        int result =p.palindromeCheck("iilii");
        assertEquals(1,1);
    }

    @Test
    public void getPalindromeNonString()
    {
        int result =p.palindromeCheck("lohi");
        assertEquals(0,0);
    }


}