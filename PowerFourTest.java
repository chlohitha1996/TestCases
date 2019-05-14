import org.junit.*;

import static org.junit.Assert.*;

public class PowerFourTest {
    /**
     *
     */
    static PowerFour  p;

    @BeforeClass
    public static void setUpBeforeClass()
    {
        p=new PowerFour();

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
    public void getNumber()
    {
        p=new PowerFour();
        int result =p.powerFour(17);
        assertEquals(0,0);
    }

    @Test
    public void Powerfour()
    {
        p=new PowerFour();
        int result =p.powerFour(36);
        assertEquals(1,1);
    }


}