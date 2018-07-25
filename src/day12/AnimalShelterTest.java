package day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void enqueueMultipleAnimals() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("meitze");
        Cat cat2 = new Cat("fluffy");
        Cat cat3 = new Cat("smokey");
        Dog dog1 = new Dog ("mandie");
        Dog dog2 = new Dog ("lisa");
        Dog dog3 = new Dog ("jake");
        shelter.enqueue(cat1);
        shelter.enqueue(dog1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);

        String actual = shelter.toString();
        String expected = "[meitze, mandie, fluffy, lisa, jake, smokey]";

        assertEquals(expected, actual);
    }

    @Test
    void enqueueEmptyShelter() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("meitze");
        Cat cat2 = new Cat("fluffy");
        Cat cat3 = new Cat("smokey");
        Dog dog1 = new Dog ("mandie");
        Dog dog2 = new Dog ("lisa");
        Dog dog3 = new Dog ("jake");

        String actual = shelter.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    void dequeueWithAnimals() {
        AnimalShelter shelter2 = new AnimalShelter();
        Cat cat1 = new Cat("meitze");
        Cat cat2 = new Cat("fluffy");
        Cat cat3 = new Cat("smokey");
        Dog dog1 = new Dog ("mandie");
        Dog dog2 = new Dog ("lisa");
        Dog dog3 = new Dog ("jake");
        shelter2.enqueue(cat1);
        shelter2.enqueue(dog1);
        shelter2.enqueue(cat2);
        shelter2.enqueue(dog2);
        shelter2.enqueue(dog3);
        shelter2.enqueue(cat3);

        shelter2.dequeue("fluffy");

        String actual = shelter2.toString();
        String expected = "[meitze, mandie, lisa, jake, smokey]";

        assertEquals(expected, actual);
    }

    @Test
    void dequeueEmptyShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.dequeue("fluffy");

        Pet actual = animalShelter.animal;
        Pet expected = null;

        assertEquals(expected, actual);
    }

    @Test
    void dequeueOneNonMatchingAnimal() {
        AnimalShelter shelter3 = new AnimalShelter();
        Dog dog1 = new Dog ("sadie");
        shelter3.enqueue(dog1);
        shelter3.dequeue("fluffy");

        Pet actual = shelter3.animal;
        Pet expected = null;

        assertEquals(expected, actual);
    }


}