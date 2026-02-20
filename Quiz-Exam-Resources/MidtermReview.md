# Midterm Review
The midterm will be held on Friday, February 27th. The exam is 55 minutes. 
The exam will be a paper exam, so a writing utensil is required. 
The exam is individual and talking will not be tolerated. 
On the day of your exam, please wait outside the classroom as I will be seating you for the midterm.

Majority of questions are multiple choices, some short answer, a couple matching, and a few fill in the blank with code.

## OOP Review, Abstract Classes, Interfaces
You will need to understand the following concepts.

Topics include:
* Inheritance
* Deep vs Shallow copies
* Polymorphism
* Abstract classes
  * Can I create an object for an abstract class?
  * What methods need to be implemented by children of an abstract class?
  * Can I inherit more than one abstract class?
* Interfaces
  * Can I implement more than one interface?
  * Understand Comparable interface and how it's used
  * Understand Comparator interface and how it's used

## Generics and Collections
For these questions, you will be expected to:
* Understand the benefits of using generics, especially with ArrayList
* Understand where a generic can be used
* Understand when to extend versus contain a class, specifically ArrayList
* Read/Write a generic class header
* Write a generic method header
* Understand bounded type parameters


## ADTs and Data Structures
You will need to understand the following concepts.

Topics include:
* ADTs
  * Understand what an ADT specifies (or rather DOESN'T specify)
* For all the following, you must be able to understand an example of how the data structure may be used
* Lists
  * Understand code using ArrayLists and LinkedLists
  * Differences between ArrayList and LinkedList implementations
  * Understand how both use memory
  * Understand which is faster/more efficient at which operations
* Stacks and Queues
  * Understand code using Stacks, Queues, and PriorityQueues
  * Understand each's policy for adding/removing items
  * Understand PriorityQueues and how they work (they are not internally sorted!!!)
* Maps and Sets
  * Understand the basics of each of these


## Sample Review Questions


1. What kind of copy is being made in this example
    ```java
        public class Container {

            private ArrayList<Item> contents;

            public Container(ArrayList<Item> initial){
                this.contents = initial;
            }
        }
    ```
    - Shallow Copy

1. Since java doesn't have multi-inheritance, we often use _____ instead
    - Interfaces


1. What type of copy is being made in this example
    ```java
    public class Container {

        private ArrayList<Item> contents;

        public Container(ArrayList<Item> initial){
            for(Item i : initial){
                this.contents.add(new Item(i));
            }
        }
    }
    ```
    - Deep Copy

1. When adding an ActionListener, use this so action is encapsulated in a separate pre-existing component (i.e. not accessible by a different component)
    - Top Level Class

1. Lets us define data types as a parameters
    - Generics

1. Which of the following is true about type T?
    ```java
    public class Container<T extends Comparable<T>> {

        private ArrayList<T> contents;

        public Container(ArrayList<T> initial){
            this.contents.addAll(initial);
        }
    }

    ```

    - T must implement the comparable against another T

1. Method that was no body
    - Abstract Method

1. Denotes that a generic should implement an interface
    - extends

1. What class do we extend when we want to define our own error types?
    - Exception

1. What interface do we use when we want sort our own custom classes in a natural order?
    - Comparable

1. Copies an object's reference
    - Shallow Copy

1. Constructor that takes in an instance of the same object
    - Copy Constructor

1. Indicates that a method will duck its responsibility
    - Throws

1. Lets you specify that a generic should be an instance of a parent type
    - Bounded types

1. What underlying data structure allows the user to access elements fastest (`O(1)`)?
    - Array

1. Which ADT lets you associate keys with values?
    - Map
