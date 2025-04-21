import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("This project contains all the java common" +
                " array and Array utils related example ");

//        int [] sampleInt = new int[5];
//        for(int i=0; i<sampleInt.length; i++){
//            sampleInt[i] = sampleInt.length - i;
//        }
        // Reading the array element using enhanced for loop.
//        for(int element: sampleInt){
//            System.out.println("Elements in array: " + element);
//        }
//        System.out.println("---------------------------------");
        // Random number create and return function assigned to newly created array.
//        int [] unsortedArr = getRandomNumbers(10);
//        System.out.println(Arrays.toString(unsortedArr));
//        int [] copyOfUnsortedArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
//        int [] reverseSort = descendingSort(copyOfUnsortedArr);
//        System.out.println(Arrays.toString(reverseSort));

        // Sorting it in ascending order.
//        Arrays.sort(copyOfUnsortedArr);
//        System.out.println(Arrays.toString(copyOfUnsortedArr));
//        // Sorting it in descending order.
//        int [] reverseSort = new int[unsortedArr.length];
//        for(int i=copyOfUnsortedArr.length -1; i>=0; i--){
//            reverseSort[i] = copyOfUnsortedArr[(copyOfUnsortedArr.length-1) - i];
//        }
//        System.out.println(Arrays.toString(reverseSort));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int size = scanner.nextInt();
//        //Reading the array elements one by one from the keyboard.
//        int [] userArray = getIntegers(size);
//        printArray(userArray);
//        int [] sortedArray = sortIntegers(userArray);
//        System.out.println(Arrays.toString(sortedArray));

//       int[] userEntries = readIntegers();
//       System.out.println(Arrays.toString(userEntries));
//       int minElement = findMin(userEntries);
//       System.out.println("Minimum element of the array is: "+minElement);

//        int[] nums = {1,2,3,4,5,6};
//        reverse(nums);
//        System.out.println(Arrays.toString(nums));
//        reverseThroughMid(nums);

        //------------- Example of ArrayList<> has been added below.----------------------------------

//        Key Methods in List Interface:
//        add(E e)
//        add(int index, E element)
//        get(int index)
//        set(int index, E element)
//        remove(int index)
//        remove(Object o)
//        contains(Object o)
//        indexOf(Object o)
//        size()
//        isEmpty()
//        clear()

        // ArrayList is a concrete class in the Java Collections Framework.
        // It implements the List interface, along with a few others like
        // RandomAccess, Cloneable, and Serializable.

        ArrayList <GroceryItems> groceryItems = new ArrayList<>();
        // Simply adding the elements to the end of the groceryItems List.
        groceryItems.add(new GroceryItems("Milk"));
        groceryItems.add(new GroceryItems("Butter"));
        groceryItems.add(new GroceryItems("Apple", "Fruits", 2));

        // If we want to add items at the beginning of the groceryItems,
        // We can override the add with index value and item.
        // Zero is the index value where I should add the item
        groceryItems.add(0, new GroceryItems("Oranges", "Fruits", 6));
        groceryItems.add(3, new GroceryItems("Banana", "Fruits", 9));

        // To replace an entry we can use set method which will take the index value which should be replaced
        // and the item value which will be newly placed.
        // Butter will be replaced by Curd.
        groceryItems.set(2, new GroceryItems("Curd"));

        // To remove the item from the groceryItems we can use remove method which accept the index value to remove.
        // Item Curd will be removed from the new ArrayList.
        groceryItems.remove(2);

        // Traversing the ArrayList created with GroceryItems object.
        for(GroceryItems item: groceryItems){
            System.out.println("Here is item: "+item);
        }
        // Display the entire groceryItems once.
        System.out.println(groceryItems);

        // Example of adding one list to another.
        String[] items = {"Apple","Orange","Banana"};
        List<String> list = List.of(items);
        ArrayList<String> fruits = new ArrayList<>(list);
        System.out.println(fruits);
        String[] moreItems = {"Grapes", "Pineapple","Jack fruit"};
        List<String> moreItemList = List.of(moreItems);
        // We are adding two list here (adding moreItemList to fruits).
        fruits.addAll(moreItemList);
        System.out.println("Final fruits list: " + fruits);

        // Example of retrieving the data from the list. For which we use get() method.
        String itemAtThird = fruits.get(3);
        System.out.println("Here is the item at third position: "+itemAtThird);
        int itemFound = findItemInList(fruits, "banana");
        System.out.println("Item found at the position: "+itemFound);

        // Remove all the items from the List which are found in the original List.
        fruits.removeAll(List.of("Grapes","Jack fruit"));
        System.out.println("After remove All: "+fruits);

        // retainAll() returns the only those item you would like to keep in the list
        fruits.retainAll(List.of("Apple", "Orange", "Banana", "Grapes"));
        System.out.println("After retention:  "+fruits);

        // Emptying the List and checking if the List is empty.
        fruits.clear();
        System.out.println("After clearing the List: "+fruits);
        System.out.println("Check if the list is empty " + fruits.isEmpty());

        // Adding all the values back to List.
        fruits.addAll(Arrays.asList("Apple","Orange","Banana","Grapes","Pineapple","Jack fruit"));
        System.out.println("After adding items in fruits list: "+fruits);

        // Sorting the List.
        fruits.sort(Comparator.naturalOrder());
        System.out.println("After sorting the List in alphabetical order: "+fruits);
        // Sorting the List in reverse order.
        fruits.sort(Comparator.reverseOrder());
        System.out.println("After sorting in reverse Order: "+fruits);
        GroceryItems.chooseMenu();
    }

    public static int findItemInList(ArrayList<String> fruits, String itemToFind){
        int index = -1;
        for(String item: fruits){
            String targetItem = item.toLowerCase().trim();
            if(targetItem.equals(itemToFind.toLowerCase().trim())){
                index = fruits.indexOf(item);
                break;
            }
        }
        return index;
    }

    public static int[] getIntegers(int size){
        int count = 0;
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);
        while(count<size){
            System.out.println("Enter the number: ");
            int elements = scanner.nextInt();
            numbers[count] = elements;
            count++;
        }
        return numbers;
    }

    public static void printArray(int[] userArray){
        for(int i=0;i<userArray.length; i++){
            System.out.println("Elements " + i + " contents "+userArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unSorterArray){
        int[] sortedArray = Arrays.copyOf(unSorterArray, unSorterArray.length);
        boolean flag = true;
        int temp = 0;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    // creating and returning random number array.
    public static int[] getRandomNumbers(int len){
        Random random = new Random();
        int [] randArr = new int[len];
        for(int i=0; i<len; i++){
            randArr[i] = random.nextInt(100);
        }
        return randArr;
    }

    // Bubble sort in descending order
    public static int[] descendingSort(int[] unsortedArr){
        int len = unsortedArr.length - 1;
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<=len - 1;i++){
                if(unsortedArr[i]<unsortedArr[i+1]){
                    temp = unsortedArr[i];
                    unsortedArr[i] = unsortedArr[i+1];
                    unsortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return unsortedArr;
    }

    // Write a method called readIntegers that reads the comma-delimited
    // list of values entered by the user from the console,
    // and then return an array containing the numbers that were entered.
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the comma-delimited numbers: ");
        String [] userArray = scanner.nextLine().split(",");
        int [] intArray = new int[userArray.length];
        for(int i=0; i<userArray.length;i++){
            intArray[i] = Integer.parseInt(userArray[i].trim());
        }
        return intArray;
    }

    //write a method called findMin that takes the array as an argument
    // and returns the minimum value found in the array.
    public static int findMin(int [] intArray){
        int minItem = intArray[0];
        for(int i=1; i<intArray.length;i++){
            if(minItem>intArray[i]){
                minItem = intArray[i];
            }
        }
        return minItem;
    }

    private static void reverse(int [] nums){
        int temp;
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        System.out.println("Array-----> "+Arrays.toString(nums));
        }
    }
// OR we can divide the array by half and swap the values
    private static void reverseThroughMid(int [] nums){
        int right = nums.length - 1;
        int mid = nums.length/2;
        int temp;
        for(int i=0; i<mid;i++){
            temp = nums[i];
            nums[i] = nums[right - i];
            nums[right - i] = temp;
            System.out.println("Reverse---> "+Arrays.toString(nums));
        }
    }

}

// Record created to use in the example of ArrayList<>.
record GroceryItems(String name, String type, int count){
    public GroceryItems(String name){
        this(name,"Dairy", 1);
    }
public static void chooseMenu(){
        System.out.println("""
                Available actions:\s
                0 - to shutdown;
                1 - to add item(s) to list (comma-delimited list).
                2 - to remove any item (comma-delimited list).
                """);
        System.out.println("Enter a number for which action you want to do: ");
        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
        ArrayList<GroceryItems> groceryItems = new ArrayList<>();
        switch (selectedOption){
            case 0 :
                break;
            case 1:
                groceryItems = addItemToList();
            case 2:
                // To remove any item (comma-delimited list).
                removeItem(groceryItems);
                break;
            default:
                // Do something
                for (GroceryItems groceryItem : groceryItems) {
                    System.out.println("Default grocery list" + groceryItems);
                }

        }
}

    public static ArrayList<GroceryItems> addItemToList (){
        System.out.println("To add item(s) to grocery please enter comma-delimited values");
        Scanner scanner = new Scanner(System.in);
        String enteredValue = scanner.nextLine().trim();
        String[] groceryItemTobeAdded = enteredValue.split(",");
        ArrayList<GroceryItems> groceryItems = new ArrayList<>();
        ArrayList<String> noDuplicate = new ArrayList<>();
        for(String grocery: groceryItemTobeAdded){
            if(noDuplicate.isEmpty() || !noDuplicate.contains(grocery)){
                noDuplicate.add(grocery);
            }
        }
        for(String grocery : noDuplicate){
            groceryItems.add( new GroceryItems(grocery));
        }
        // Printing the entered items
        System.out.println("Grocery Items: "+groceryItems);
        return groceryItems;
    }

    public static ArrayList<GroceryItems> removeItem(ArrayList<GroceryItems> availableItems){
        System.out.println("Please enter value or comma-delimited values to remove");
        Scanner scanner = new Scanner(System.in);
        String enteredValue = scanner.nextLine().trim();
        String[] itemToRemove = enteredValue.split(",");
        ArrayList<GroceryItems> groceryItems = new ArrayList<>();
        System.out.println("Here is/are the item(s) user wants to remove:  " +Arrays.toString(itemToRemove));
        for (var item: availableItems){
            for(var removeItem: itemToRemove ){
                if(item.name.trim().equals(removeItem.trim())){
                    groceryItems.add(item);
                }
            }
        }
        availableItems.removeAll(groceryItems);
//       sorting the GroceryItems by name
        availableItems.sort(Comparator.comparing(GroceryItems::name));
        System.out.println("After removing item(s)"+availableItems);
        return availableItems;
    }
}