package n3exercici4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {


    @Test
    void sortedObjectsArrayList()
    {
        List<Object> list = new ArrayList<Object>();

        Tree tree = new Tree("Pinus halepensis", 20);
        Car car = new Car("Audi", "A4");
        Person person = new Person("Josep Maria", "Ortiz");

        list.add(tree);
        list.add(car);
        list.add(person);

        assertThat(list).containsSequence(tree,car,person);

    }

    @Test
    void arrayListInAnyOrder()
    {
        List<Object> list = new ArrayList<Object>();

        Tree tree = new Tree("Pinus halepensis", 20);
        Car car = new Car("Audi", "A4");
        Person person = new Person("Josep Maria", "Ortiz");

        list.add(tree);
        list.add(car);
        list.add(person);

        assertThat(list).contains(car, person, tree);

    }

    @Test
    void objectOnlyOnce()
    {
        List<Object> list = new ArrayList<Object>();

        Tree tree = new Tree("Pinus halepensis", 20);
        Car car = new Car("Audi", "A4");
        Person person = new Person("Josep Maria", "Ortiz");

        list.add(tree);
        list.add(car);
        list.add(person);

        assertThat(list).containsOnlyOnce(person);


    }

    @Test
    void objectDoesNotAppear()
    {
        List<Object> list = new ArrayList<Object>();

        Tree tree = new Tree("Pinus halepensis", 20);
        Car car = new Car("Audi", "A4");
        Person person = new Person("Josep Maria", "Ortiz");

        list.add(tree);
        list.add(car);

        assertThat(list).doesNotContain(person);
    }
}
