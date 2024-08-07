
// Experiment6.java
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Stack Interface
interface StackInterface<T> {
    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();
}

// Queue Interface
interface QueueInterface<T> {
    void enqueue(T element);

    T dequeue();

    T front();

    boolean isEmpty();
}

// Class implementing both Stack and Queue interfaces
class DataStructure<T> implements StackInterface<T>, QueueInterface<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Stack operations
    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Queue operations
    @Override
    public void enqueue(T element) {
        list.addLast(element);
    }

    @Override
    public T dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T front() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }
}

public class Experiment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataStructure<Integer> dataStructure = new DataStructure<>();

        System.out.println("Choose an operation:");
        System.out.println("1. Stack Operations");
        System.out.println("2. Queue Operations");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Stack Operations:");
            while (true) {
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Check if Empty");
                System.out.println("5. Exit");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("Enter element to push:");
                        int element = scanner.nextInt();
                        dataStructure.push(element);
                        break;
                    case 2:
                        try {
                            int poppedElement = dataStructure.pop();
                            System.out.println("Popped element: " + poppedElement);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            int topElement = dataStructure.peek();
                            System.out.println("Top element: " + topElement);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Is stack empty? " + dataStructure.isEmpty());
                        break;
                    case 5:
                        System.out.println("Exiting Stack Operations.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else if (choice == 2) {
            System.out.println("Queue Operations:");
            while (true) {
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Front");
                System.out.println("4. Check if Empty");
                System.out.println("5. Exit");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("Enter element to enqueue:");
                        int element = scanner.nextInt();
                        dataStructure.enqueue(element);
                        break;
                    case 2:
                        try {
                            int dequeuedElement = dataStructure.dequeue();
                            System.out.println("Dequeued element: " + dequeuedElement);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            int frontElement = dataStructure.front();
                            System.out.println("Front element: " + frontElement);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Is queue empty? " + dataStructure.isEmpty());
                        break;
                    case 5:
                        System.out.println("Exiting Queue Operations.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid choice. Exiting program.");
        }

        scanner.close();
    }
}
