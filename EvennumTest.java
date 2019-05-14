import org.junit.*;

import static org.junit.Assert.assertEquals;

public class EvennumTest {
    Evennum even;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        even=new Evennum();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        even=null;

        System.out.println("Inside After");

    }

    @Test
    public void isEven()
    {


        //act
        boolean result=even.isEven(28);

        //assert
        assertEquals(true,result);
    }


    @Test
    public void isOdd()
    {


        //act
        boolean result=even.isEven(5);

        //assert
        assertEquals(false,result);
    }


}