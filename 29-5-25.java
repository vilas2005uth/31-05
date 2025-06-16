class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


~CLASS ARRAY INSERTION

import java.util.Scanner;

public class ArrayInsertion {

        if (index < 0 || index > array.length) {
            System.out.println("Invalid index.");
            return array;
        }
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        newArray[index] = element;
        
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to insert:");
        int element = scanner.nextInt();
        System.out.println("Enter the index where you want to insert the element:");
        int index = scanner.nextInt();
        array = insertElement(array, element, index);
        System.out.println("Array after insertion:");
        printArray(array);
    }
}


~MINIMUM VALUE IN AN ARRAYimport java.util.Scanner;

public class FindMinimum {

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int min = findMinimum(array);
        System.out.println("The minimum value in the array is: " + min);
    }
}


~FINDING THE SUM OF THE ELEMENTS IN AN ARRAY

import java.util.Scanner;

public class FindElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The elements in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

~EVEN NUMBERS IN AN ARRAY

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}

~ODD NUMBERS IN AN ARRAY

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}


RECCURSIVE CALL

class Main {
    public static void main(String[] args) {
        printRange(1, 5); // Example usage
    }

    public static void printRange(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(start);
        printRange(start + 1, end);
    }
}

REVERSE RECCURSIVE CALL

class Main {
    public static void main(String[] args) {
        printRange(1, 5); // Example usage
    }

    public static void printRange(int start, int end) {
        if (start > end) {
            return;
        }
        printRange(start + 1, end);
        System.out.println(start);
    }
}

FACTORIAL OF A NUMBER

class Main {
    public static void main(String[] args) {
        System.out.println(fact(16));
    }
public static int fact(int n){
        if (n==1) {
            return 1;
        }
       int val=n*fact(n-1);
       return val;
    }
}


defining a stack

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.print(); 
        System.out.println("Top: " + s.peek()); 
        s.pop();
        s.print(); 
    }
}

ELEMENTS IN THE STACK

import java.util.Stack;
public class Main {
    public static void pushBottom(Stack<Integer>stack,int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int val=stack.pop();
        pushBottom(stack,element);
        stack.push(val);
    }
        public static void main(String[]args){
            Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushBottom(s,2345);
        System.out.println("elements in stack are:");
        System.out.println(s);
}
}

STAR PATTERN IN JAVA (11-6-25)

import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}


INSERTION SORT (12-6-25)

class Main {
    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 6, 1, 3};  // Example array

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


