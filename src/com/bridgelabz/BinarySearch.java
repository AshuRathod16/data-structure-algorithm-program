package com.bridgelabz;

public class BinarySearch {
    public static void main(String[] args) {
        String[] array = {"Amazon", "Flipcart", "Myntra", "Nykaa", "Sugar"};
        BinarySearch binarysearch = new BinarySearch();
        binarysearch.search(array);
    }

    public void search(String[] string){
     int leftIndex = 0;
     int rightIndex = string.length - 1;
     String searchstring = "Nykaa";
     while (leftIndex <= rightIndex){
         int midIndex = (leftIndex + rightIndex) / 2;
         int result = searchstring.compareTo(string[midIndex]);
         if (result == 0){
             System.out.println(searchstring + " is Found");
             break;
         } else if (result > 0) {
            leftIndex = midIndex + 1;
         } else if (result < 0){
             rightIndex = midIndex - 1;
         }
     }
    }
}
