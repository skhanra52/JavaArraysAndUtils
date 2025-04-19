import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This project contains all the java common" +
                " array and Array utils related example ");

        int [] sampleInt = new int[5];
        for(int i=0; i<sampleInt.length; i++){
            sampleInt[i] = sampleInt.length - i;
        }
        // Reading the array element using enhanced for loop.
        for(int element: sampleInt){
            System.out.println("Elements in array: " + element);
        }
        System.out.println("---------------------------------");
        // Random number create and return function assigned to newly created array.
        int [] unsortedArr = getRandomNumbers(10);
        System.out.println(Arrays.toString(unsortedArr));
        int [] copyOfUnsortedArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
        int [] reverseSort = descendingSort(copyOfUnsortedArr);
        System.out.println(Arrays.toString(reverseSort));

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

        int[] nums = {1,2,3,4,5,6};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        reverseThroughMid(nums);
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