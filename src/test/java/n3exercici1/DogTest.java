package n3exercici1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void objectsHaveSameValue()
    {
        Dog gos1 = new Dog("Toby", 23.6);
        Dog gos2 = new Dog("Toby", 23.6);


        assertThat(gos1).usingRecursiveComparison().isEqualTo(gos2);

    }

    @Test
    void objectsHaveDifferentValue()
    {
        Dog gos1 = new Dog("Max", 36);
        Dog gos2 = new Dog("Max", 12);

        assertThat(gos1).usingRecursiveComparison().isNotEqualTo(gos2);
    }





}