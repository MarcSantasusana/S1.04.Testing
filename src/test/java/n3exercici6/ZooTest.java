package n3exercici6;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ZooTest {

    @Test
    void throwsArrayIndexOutOfBoundsException()
    {
        String[] animals = {"Gorilla", "Tiger", "Crocodile", "Giraffe"};
        Zoo zoo = new Zoo("Zoo Barcelona", animals);

        assertThatThrownBy(() -> {
           zoo.printAnimal(-1);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }


}