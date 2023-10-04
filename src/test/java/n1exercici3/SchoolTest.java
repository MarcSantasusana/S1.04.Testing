package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void throwsArrayIndexOutOfBoundsException()
    {
        var school = new School();

       assertThrows(ArrayIndexOutOfBoundsException.class,
               () -> {
                   school.printStudent(-1);

               });

    }

}