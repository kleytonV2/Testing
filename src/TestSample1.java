import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestSample1 {

    @Test
    public void testRetornaSis(){
        assertEquals(6,Sample1.retronaSis());
    }

    @Test
    public void testSuma(){
        assertEquals(5,Sample1.suma(3,2));
    }

    @Test
    public void testMultiplicar(){
        assertEquals(18,Sample1.multiplica(2,9));
    }

    @Test
    public void testIsAdultWithEasyYear(){
        assertEquals(true,Sample1.isAdult(2018,2,17,1997,2,1));
        assertEquals(false,Sample1.isAdult(2018,2,17,2012,2,1));
    }

    @Test
    public void testIsAdultWithDifficultYear(){
        assertEquals(true,Sample1.isAdult(2018,2,1,2000,1,1));
        assertEquals(false,Sample1.isAdult(2018,2,17,2000,12,1));
    }

    @Test
    public void testIsAdultWithDifficultMonth(){
        assertEquals(true,Sample1.isAdult(2018,1,10,2000,1,1));
        assertEquals(false,Sample1.isAdult(2018,1,10,2000,1,21));
    }

    @Test
    public void testIsAdultWithDifficultAultToday(){
        assertEquals(true,Sample1.isAdult(2018,5,3,2000,5,3));
    }

    @Test
    public void testHowManyDays(){
        assertEquals(28,Sample1.howManyDays(2,2001));
    }

}

