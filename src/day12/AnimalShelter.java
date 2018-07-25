package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AnimalShelter {

    public Queue<Pet> shelter = new LinkedList<>();
    public Stack<Pet> frontStack1 = new Stack<>();
    public Stack<Pet> frontStack2 = new Stack<>();
    public Stack<Pet> backStack1 = new Stack<>();
    public Stack<Pet> backStack2 = new Stack<>();
    public Pet animal;


    public void enqueue(Pet pet) {
        shelter.add(pet);
    }

    public Pet dequeue(String preference) {

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
}
