package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AnimalShelter {

    private Queue<Pet> shelter = new LinkedList<>();
    private Stack<Pet> frontStack1 = new Stack<>();
    private Stack<Pet> frontStack2 = new Stack<>();
    private Stack<Pet> backStack1 = new Stack<>();
    private Stack<Pet> backStack2 = new Stack<>();
    public Pet animal;


    public void enqueue(Pet pet) {
        shelter.add(pet);
    }

    public Pet dequeue(String preference) {

        if(shelter.isEmpty()) {
            return null;
        }

        if(!shelter.contains(preference)) {
            animal = null;
            return animal;
        }

        if (shelter.peek().toString() == preference){
            return shelter.poll();
        } else {

            while (shelter.peek().toString() != preference) {
                frontStack1.push(shelter.poll());
            }
            animal = shelter.poll();

            while (!shelter.isEmpty()) {
                backStack1.push(shelter.poll());
            }

            while (!frontStack1.isEmpty()) {
                frontStack2.push(frontStack1.pop());
            }

            while (!backStack1.isEmpty()) {
                backStack2.push(backStack1.pop());
            }

            while (!frontStack2.isEmpty()) {
                shelter.add(frontStack2.pop());
            }

            while (!backStack2.isEmpty()) {
                shelter.add(backStack2.pop());
            }
        }
        return animal;
    }

    @Override
    public String toString() {
        return shelter.toString();
    }
}
