package org.example;

import java.util.Arrays;

public class BinarySearchTree {

    // Instance Variables
    int arrayForTree[];
    int targetValue;

    // Constructor for tree
    BinarySearchTree(int valueForTarget){
         arrayForTree = new int[100];
         targetValue = valueForTarget;
    }

    // Getters & Setters
    public int[] getArrayForTree() {
        return arrayForTree;
    }

    public void setArrayForTree(int[] arrayForTree) {
        this.arrayForTree = arrayForTree;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    // toString if needed
    public String toString() {
        return "Current Tree Values: \nArray Length: " + getArrayForTree().length + "\nTarget Value: " + getTargetValue() ;
    }

    // Method to iterate through tree/array. Establish the min/max for array.
    // Run a while loop that will find the middle point with given values, then
    // display the middle value for each iteration; until we reach our target value.
    // return -1 is default to avoid "missing return statement" from looping.
    public static int binarySearch(int[] arrayForTree, int target){
        int low = 0;
        int high = arrayForTree.length - 1;

        while(low <= high){
            int middle = low + (high - low) / 2;
            int value = arrayForTree[middle];

            System.out.println("Middle: " + value);

            if(value < target){
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }


        }
        return -1;
    }
}
