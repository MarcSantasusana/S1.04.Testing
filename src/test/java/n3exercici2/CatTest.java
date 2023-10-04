package n3exercici2;

import n3exercici1.Dog;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void objectsHaveSameReference()
    {
        Cat gat1 = new Cat("Bimba", 12, "Black");
        Cat gat2 = gat1;

        assertThat(gat1).isEqualTo(gat2);

    }

    @Test
    void objectsHaveDifferentReference()
    {
        Cat gat1 = new Cat("Simba", 4, "White");
        Cat gat2 = new Cat("Simba", 4, "White");


        assertThat(gat1).isNotEqualTo(gat2);
    }



}