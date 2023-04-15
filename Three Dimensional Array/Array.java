import java.util.Scanner;

/* 
Instruction:
    !Activity in 3D array to add each rows.
    
    ?Ask user to enter the dimensions of the array, and the number of
    ?rows and columns, and layers.
 
    ?Then prompt the user to enter the integers for each element of
    ?the array.
    
    TODO: Finally, print out the sum of all integers in the array.

    Note:
        Each methods are called in different methods. This is applicable since
        The rest of the methods will be dragged up in the UserData method where
        the call will occur. The UserData method then holds all the necessary 
        output to be printed into main method. Multiple loops are used since
        we want to get the output of multiple result, this will help us lessen
        the time consumed and instead we can work on debugging and adjusting the
        codes.

    * Programmer: Rafael D. Martinez
    * BSIT - 1-A1 DAY PROGRAM
    * Programming 2 Activity.
 */
public class Array {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        UserData(); //*User input called to be shown on screen.
    }
    public static void UserData() {
        System.out.printf("Number of tables: ");
        int table = in.nextInt();
        System.out.printf("Number of rows: ");
        int rows = in.nextInt();
        System.out.printf("Number of columns: ");
        int columns = in.nextInt();

        int array[][][] = new int [table][rows][columns];
        int sumArray[][] = new int [table][rows];

        ThreeDimension(array);
        RowSummation(sumArray, array);
    }   //*Method for 3D array input. 3D array passed down and called back to display.
    public static void ThreeDimension(int array[][][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int j2 = 0; j2 < array.length; j2++) {
                    System.out.printf("[%d][%d][%d]Enter Value/s: ", i, j, j2);
                    array[i][j][j2] = in.nextInt();
                }
            }
            System.out.println();
        }
        DataPrint(array);   //*Call DataPrint method. It will bring this method to main for display.
}
public static void DataPrint(int array[][][]) {
    //* Print the result from previous method.
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            for (int j2 = 0; j2 < array.length; j2++) {
                System.out.printf("%d ", array[i][j][j2]);
            }
        System.out.println();
        }
        System.out.println();        
    }
}
    public static void RowSummation(int sumArray[][], int array[][][]) {
    //* Each rows will be added in the method.
        for (int i = 0; i < sumArray.length; i++) {
        for (int j = 0; j < sumArray.length; j++) {
            for (int j2 = 0; j2 < array.length; j2++) {
                sumArray[j][j2] += array[i][j][j2];
            }
        }
    }
    SummationPrint(sumArray, array);
}
    public static void SummationPrint(int sumArray[][], int array[][][]) {
        //* The summation will be printed back to screen and will  be called in RowSummation method.
        System.out.printf("\nResult of Summation\n==========\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d\t", sumArray[i][j]);
            }
            System.out.println();
        }   
    }
}

