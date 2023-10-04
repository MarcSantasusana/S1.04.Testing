package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void listSizeIs12()
    {
        var year = new Year();

        year.addMonths();

        int size = year.getMonthList().size();

        assertEquals(12, size);
    }

    @Test
    void listIsNotNull()
    {
        var year = new Year();

       assertNotNull(year.getMonthList());
    }

    @Test
    void listPosition8IsAugust()
    {
        var year = new Year();

        year.addMonths();

        String eighthMonth = year.getMonthList().get(7);

        assertEquals("August", eighthMonth);

    }

}