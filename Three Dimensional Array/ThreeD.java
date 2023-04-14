import java.util.Scanner;

/**
 Ask user to enter the dimensions of the array, and the number of
    rows and columns, and layers.
 
 Then prompt the user to enter the integers for each element of
    the array.
    
 Finally, print out the sum of all integers in the array.
 
Programmer: Rafael D. Martinez
Date: Wednesday, April 12, 2023

3D ARRAY ASSIGNMENT - PROGRAMMING 2
    
 **/

public class ThreeD {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Enter tables: ");
        int table = in.nextInt();        
        System.out.printf("Enter rows: ");
        int rows = in.nextInt();
        System.out.printf("Enter columns: ");
        int columns = in.nextInt();
    
        //* Initialize array with it's corresponding TRC.

    int firstArray[][][] = new int [table][rows][columns];

        //* 3 for loops since there are 3 Dimensions in our array.
        //* values taken from user stored in every part of TRC.
    for (int i = 0; i < firstArray.length; i++) {
        for (int j = 0; j < firstArray.length; j++) {
            for (int j2 = 0; j2 < firstArray.length; j2++) {
                System.out.printf("[%d][%d][%d] Enter Values: ", i, j, j2);
                firstArray[i][j][j2] = in.nextInt();                                           
            }
        }
        System.out.println();
    }   
    //* A sumArray[][][] declared to store total of each TRC.
    //* If table is already complete we can add both arrays with different table.
    //! It is important that 3D arrays be added to it's own since we are using user input and not fix values.
    //* Finally, print out the output of the array.
    for (int i = 0; i < firstArray.length; i++) {
        for (int j = 0; j < firstArray.length; j++) {
            int sumArray[][][] = new int [table][rows][columns];
            for (int j2 = 0; j2 < firstArray.length; j2++) {
                sumArray[i][j][j2] = firstArray[i][j][j2] + firstArray[i][j][j2]; 
                System.out.printf("%d ", sumArray[i][j][j2]);                            
            }
        }
        System.out.println();
    }
  }
}
