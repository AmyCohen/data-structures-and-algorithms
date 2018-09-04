# Selection Sort
<!-- Short summary or background information -->
Implement selection sort

## Challenge

### Feature Tasks

Implement SelectionSort to sort numbers of type double.

Random r = new Random();

double dd = r.nextDouble();

Write tests to verify it works. Write a function called isSorted to verify an array is sorted.

Write a function called "randomN" that generates an array of size N filled with random double numbers. Write another function called "copy" that takes an array and produces and exact copy. Write a program that times out how long it takes to sort an array. Sort arrays of the following sizes:

10,000

100,000

10,000,000 (or whatever your computer can support if this is impossible on your machine)

Write a program that generates a random array of those sizes, copies the array so there's two copies, and then sort the array with two sorting algorithms: SelectionSort and Merge Sort. Time how long they take to look and record the results in a README.md file.

Time them by using System.currentTimeMillis()

 

long start = System.currentTimeMillis()

sortStuff()

long delta = System.currentTimeMillis() - start;

### Structure and Testing
- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

- Write at least three test assertions for each method that you define.

- Ensure your tests are passing before you submit your solution.

## Solution
<!-- Embedded whiteboard image -->

Array Length: 10,000

![tenthousand](https://github.com/AmyCohen/data-structures-and-algorithms/blob/master/src/day37/assets/tenthousand.jpg)

Array Length: 100,000

![onehundredthousand](https://github.com/AmyCohen/data-structures-and-algorithms/blob/master/src/day37/assets/onehundredthousand.jpg)

Array Length: 1,000,000

![onemillion](https://github.com/AmyCohen/data-structures-and-algorithms/blob/master/src/day37/assets/onemillion.jpg)