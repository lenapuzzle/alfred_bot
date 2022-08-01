import java.util.ArrayList;


public class arrays {
    public static void main(String[] args) {

        // Fixed arrays

        // String[] fruits = new String[5]; 
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        String[] fruits = {"banana", "pear", "papaya", "kiwi"};
        // To swap the value at index 0 and index 3
        String temp = fruits[0]; // assigns temp to "banana"

        // fixed arrays manipulation - you can not add or remove, but you can change the values or their positions
        fruits[0] = fruits[fruits.length - 1]; // { "kiwi", "pear", "papaya", "kiwi"}
        fruits[3] = temp; // { "kiwi", "pear", "papaya", "banana"}
        for (int i = 0; i < fruits.length; i++) {
                System.out.println(fruits[i]); // prints [null, null, null, null, null] - default values of a string
            }

        System.out.println(fruits.length); // 4
        // Array is currently { "kiwi", "pear", "papaya", "banana" }
        System.out.println(fruits[fruits.length - 1]); // "banana"


        int[] arr = new int[5]; 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // prints [0, 0, 0, 0, 0] - default values of an integer
        }

        // Array lists
        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList);

        myList.add(10);  // adding values to the list
        myList.add(23);
        System.out.println(myList);

        // Getters and Setters to manipulate
        Integer num = myList.get(0); // accessing the element of a list
        System.out.println(num);
        myList.set(0, 7);           // setting it to a new value
        System.out.println(myList);

        // you can put different types in a list - generic
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);

        System.out.println(things);

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }

        // regular for loop
        for(int i = 0; i < dynamicArray.size(); i++){
            String name = dynamicArray.get(i);
            System.out.println("hello " + name);
            // other operations using name
        }

        // enhanced for loop
        for(String name : dynamicArray){
            System.out.println("hello " + name);
            // other operations using name
        }

        // you cannot use enhanced for loop and modify it at the same time
        // for example
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");
        for(String snack : snacks ) {
            if(snack.charAt(0) == 'A') {
                snacks.remove(snack);
            }
        }
        // this will encounter an error like
        // Exception in thread "main" java.util.ConcurrentModificationException

        // no errors with traditional for loop
        for(int i=0; i<snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
            }
        }
        

        
        
        
        



    }
}


