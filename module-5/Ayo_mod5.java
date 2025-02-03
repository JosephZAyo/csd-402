/**
 *
 * @author Joseph Ayo
 * 2/2/2025
 * Project Assignment M5 - CSD 402
 * Program Function: Create four methods. Two return the largest element in the array passed to the method, and will return a 1-dimensional array containing two location elements.
 * The last 2 methods will return the smallest element in the array instead.  */
//First up, the double array method
public static int[] finddLargest(double[][] arrayParam) {
    int[] location = new int[2]; // Array to store row and column index of the largest element
    double largest = arrayParam[0][0];
    location[0] = 0; // Obtain row of the largest element
    location[1] = 0; // Obtain index of the largest element

    // Loop through the array to find the largest element
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j]; 
                location[0] = i; // Updates row index
                location[1] = j; // Updates column index
            }
        }
    }
    return location;
    
}
// Second, the method that utilized int arrays to find the largest element
public static int[] findiLargest(int[][] arrayParam) {
    int[] location = new int[2]; // Array to store row and column index of the largest element
    int largest = arrayParam[0][0];
    location[0] = 0; // Obtain row of the largest element
    location[1] = 0; // Obtain index of the largest element

    // Loop through the array to find the largest element
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                location[0] = i; // Updates row index
                location[1] = j; // Updates column index
            }
        }
    }
    return location;
}
// Method for locating the smallest element in a double array
public static int[] finddSmallest(double[][] arrayParam) {
    int[] location = new int[2]; // Array to store row and column index of the largest element
    double smallest = arrayParam[0][0]; 
    location[0] = 0; // Obtain row of the smallest element
    location[1] = 0; // Obtain index of the smallest element

    // Loop through the array to find the smallest element
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                location[0] = i; // Updates row index
                location[1] = j; // Updates column index
            }
        }
    }
    return location
}
// Method for locating the smallest element in an int array
public static int[] findiSmallest(int[][] arrayParam) {
    int[] location = new int[2]; // Array to store row and column index of the largest element
    int smallest = arrayParam[0][0]; 
    location[0] = 0; // Obtain row of the smallest element
    location[1] = 0; // Obtain index of the smallest element

    // Loop through the array to find the smallest element
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                location[0] = i; // Updates row index
                location[1] = j; // Updates column index
            }
        }
    }
    return location;
}