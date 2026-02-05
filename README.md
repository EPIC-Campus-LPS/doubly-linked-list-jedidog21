# Doubly Linked List

## Objective

- Create a `Node<E>` class using generics to hold a value and the prev/next node in the list
- Using `Node`, implement a `DoublyLinkedList` class that implements the provided `List` interface.

### `Node<E>` Class

You will use this `Node<E>` class to represent a node in your `DoublyLinkedList`. This class should be able to hold a value  of any type and the previous/next node when appropriate. When there is no previous or next node, the values should be `null`.

Create and implement the class as you see fit with necessary instance variables, constructors, and getter/setter methods, keeping in mind how it will be used by other classes.

In addition to the required `Node` functionality, your `Node` class should include the following methods.

- Overrides `String toString()` to print out the value of the node
- Overloads `boolean equals(Node<E> node)` and returns true if the nodes are equivalent and false otherwise

As an example `Node` class should print `rubber goose` and `false` when the following program is run.
**This is not a comprehensive test of the functionality of your class. You are responsible for rigorously testing your own program.**

```
Node<String> first = new Node<>("obtuse");  
  
Node<String> next = new Node<>("rubber goose");  
first.setNextNode(next);  
next.setPrevNode(first);  
  
Node<String> after = new Node<>("guava juice", next);  
next.setNextNode(after);  
System.out.println(after.getPrevNode().getValue()); // "rubber goose"  
  
Node<String> last = new Node<>("giant snake");  
System.out.println(next.equals(last));
```

### DoublyLinkedList

Create a class `DoublyLinkedList<E>` that implements the provided `List` interface. This class should implement a doubly linked list of a generic type using `Node<E>`. 

Since your class implements the `List` interface, your class must contain (at least) all the methods defined by the interface. They should fulfill the functionality described by the comments in the interface and throw all exceptions as described. You may add any private helper methods or private instance variables you need to complete the functionality of the class. You will at least need to a default constructor that creates an empty list.

*Tip:* Create a new class called `DoublyLinkedList` then add `implements List` to the header. Then use the context actions to populate your class with all the required method headers and Javadoc comments. Since you are implementing an interface that uses generics, you will need to use `Object` in place of `E` for your program. If you run into errors when creating and manipulating node, _casting_ should help resolve the error.

Your class should produce the stated output for the given program.
**This is not a comprehensive test of the functionality of your class. You are responsible for rigorously testing your own program.**

```
DoublyLinkedList<Integer> list = new DoublyLinkedList<>();  
list.add(10);  
list.add(20);  
list.add(30);  
System.out.println(list.toString()); // [10, 20, 30]  
  
list.add(2, 40);  
list.add(0, 5);  
list.set(2, 50);  
System.out.println(list.toString()); // [5, 10, 50, 40, 30]  
  
list.remove(4);  
list.remove(2);  
System.out.println(list.size()); // 3  
System.out.println(list.toString()); // [5, 10, 40]
```
### JUnit

This lab, we are going to start **JUnit testing**. JUnit is a framework for creating and running test cases in your project. From here on out, you will need to write appropriate JUnit tests for all of your projects. For this lab, create a class called `DoublyLinkedListTest` for your test cases.

_Tip: _ To easily create your test class, put your cursor in your class header and press 'Alt-Enter' then select 'Create test'. From the menu, you can then select all the methods you want to create tester methods, and it will auto-generate your class for you. Then, use context actions again to add to the correct library to your classpath. This is often significantly easier than searching for the necessary package.

The number of tests you write doesn't matter as much as the quality of your tests. One way to assess test quality is through  **code coverage** (how many lines of source code have been run by the test cases). When you run your tests, you can generate a code coverage report which will tell you what percentage of the lines of code in your main program were executed by the test cases. The first 80% is generally straightforward to cover; it's the last 20% that is tricky. Ideally your test cases  will cover all 100%, but for this project we will aim for 80%.

When writing test cases, focus not just on writing tests to test the accuracy of your code, but the resiliency. Write tests to check that your code is throwing errors when appropriate and rejecting inaccurate input. Coming up with these **edge cases** can be difficult, but is often the most valuable part of testing.

**Resources**
- [Getting Started with JUnit 5](https://www.jetbrains.com/help/idea/junit.html)
- [Creating Tests](https://www.jetbrains.com/help/idea/create-tests.html)
- [Running Tests with Coverage](https://www.jetbrains.com/help/idea/running-test-with-coverage.html#run-config-with-coverage)
- [Reading the Coverage Report](https://www.jetbrains.com/help/idea/viewing-code-coverage-results.html)


### Javadoc

For your `Node` class and `DoublyLinkedList` class, generate proper Javadoc documentation. The classes you generate to run your JUnit test do not have to commented using Javadoc notation, but should still include inline comments and follow style conventions to make their function understandable to an outside user.
