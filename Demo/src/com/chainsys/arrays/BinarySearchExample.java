package com.chainsys.arrays;

public class BinarySearchExample {
	 public static int binarySearch(byte[] a, byte key) {
	        int low = 0;
	        int high = a.length - 1;

	        while (low <= high) {
	            int mid = (low + high) >>> 1;
	            byte midVal = a[mid];

	            if (midVal < key) {
	                low = mid + 1;
	            } else if (midVal > key) {
	                high = mid - 1;
	            } else {
	                return mid; // key found
	            }
	        }
	        return -(low + 1);  // key not found
	    }

	    public static void main(String[] args) {
	        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        byte key = 2;
	        int index = binarySearch(array, key);

	        if (index >= 0) {
	            System.out.println("Key " + key + " found at index " + index);
	        } else {
	            System.out.println("Key " + key + " not found. " +
	                               "Insertion point would be at index " + (-index - 1));
	        }
	    }

}
