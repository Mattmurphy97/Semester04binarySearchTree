package org.example;

import java.util.*;

public class TestBinarySearchTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CLI Starts here
        Display.header();
        // This loop never breaks, instead the user must choose the option to end program
        // otherwise you can continue selecting different target values for searching array/tree
        while (true){

            Display.mainMenu();
            int option01 = sc.nextInt();
            sc.nextLine();
            Display.div();

            // Condition to make sure user selects proper value to check premade array
            if(option01 > 0 && option01 < 100) {

                // Creates a new tree object
                BinarySearchTree newTree = new BinarySearchTree(option01);

                // This populates the array from 0-99
                for(int i = 0; i < newTree.getArrayForTree().length; i++){
                    newTree.arrayForTree[i] = i;
                    //System.out.println(newTree.getArrayForTree()[i]);
                }
                // See Class for more info on Method
                newTree.binarySearch(newTree.getArrayForTree(), newTree.getTargetValue());

                Display.div();
                Display.taskComplete01();

                // This loop gives user option to end program or continue, then checks condition
                while (true){
                    int option02 = sc.nextInt();
                    sc.nextLine();

                    if (option02 == 1){
                        Display.div();
                        break;
                    } else if (option02 == 2) {
                        Display.div();
                        Display.goodbye();
                        System.exit(0);;
                    } else {
                        System.out.println("Invalid Selection, Please Try Again");
                    }
                }

            } else {
                System.out.println("Invalid Target Number, Please select between 0 & 99");
                System.out.println();
            }

        }




//        // Construct newTree object
//        BinarySearchTree newTree = new BinarySearchTree(42);
//
//        // Populate array with values, loop just creates sequential #'s
//        for(int i = 0; i < newTree.getArrayForTree().length; i++){
//            newTree.arrayForTree[i] = i;
//        }
//
//        int index = newTree.binarySearch(newTree.getArrayForTree(), newTree.getTargetValue());

//        System.out.println("-------------------------------------------");
//        for (int i = 0; i < newTree.getArrayForTree().length; i++){
//            System.out.println(newTree.getArrayForTree()[i]);
//        }


//        int arrayForTree[] = new int[100];
//        int targetValue = 42;
//
//
//        // CLI STARTS HERE, INITIALIZE targerValue then assign value through scanners
//
//
//
//        for (int i=0; i<arrayForTree.length; i++){
//            arrayForTree[i] = i;
//        }
//
//        int index = binarySearch(arrayForTree, targetValue);
//
//        if(index == -1){
//            System.out.println(targetValue + " Not Found");
//        }else{
//            System.out.println("Element found at: " + index);
//        }
//
//    }
//
//    private static int binarySearch(int[] array, int target){
//
//        int low = 0;
//        int high = array.length -1;
//
//        while(low <= high){
//            int middle = low + (high - low) / 2;
//            int value = array[middle];
//
//            System.out.println("Middle: " + value);
//
//            if(value < target){
//                low = middle + 1;
//            } else if (value > target) {
//                high = middle - 1;
//            } else {
//                return middle;
//            }
//        }
//
//        return -1;
    }
}