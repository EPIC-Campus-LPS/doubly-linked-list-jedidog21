import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    @org.junit.jupiter.api.Test
    void add() {
        DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(10, doubly.get(0));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(0,20);
        assertEquals(20, doubly.get(0));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(20, doubly.remove());
    }

    @org.junit.jupiter.api.Test
    void testRemove() {DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(20, doubly.remove(1));
    }

    @org.junit.jupiter.api.Test
    void get() {DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(10, doubly.get(0));
    }

    @org.junit.jupiter.api.Test
    void set() {DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.set(0, 20);
        assertEquals(20, doubly.get(0));
    }

    @org.junit.jupiter.api.Test
    void size() {DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(2, doubly.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {DoublyLinkedList <Integer> doubly = new DoublyLinkedList<Integer>();
        doubly.add(10);
        doubly.add(20);
        assertEquals(false, doubly.isEmpty());
    }
}