import java.util.Scanner;

public class TwoThreeD {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.printf("Enter tables: ");
        int table = in.nextInt();        
        System.out.printf("Enter rows: ");
        int rows = in.nextInt();
        System.out.printf("Enter columns: ");
        int columns = in.nextInt();
    
    int firstArray[][][] = new int [table][rows][columns];
    int secondArray[][][] = new int [table][rows][columns];
    int sumArray[][][] = new int [table][rows][columns];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                for (int j2 = 0; j2 < firstArray.length; j2++) {
                    System.out.printf("[%d][%d][%d] Enter Values: ", i, j, j2);
                    firstArray[i][j][j2] = in.nextInt();                                           
                }
            }
            System.out.println();
        }
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray.length; j++) {
                for (int j2 = 0; j2 < sumArray.length; j2++) {
                    System.out.printf("[%d][%d][%d] Enter Values: ", i, j, j2);
                    firstArray[i][j][j2] = in.nextInt();
                }
            }
            System.out.println();
        } 
        for (int i = 0; i < sumArray.length; i++) {
                for (int j = 0; j < sumArray.length; j++) {
                    for (int j2 = 0; j2 < sumArray.length; j2++) {
                        System.out.printf("[%d][%d][%d] Enter Values: ", i, j, j2);
                        secondArray[i][j][j2] = in.nextInt();
                    }   
                }
                System.out.println();
            }
            for (int i = 0; i < sumArray.length; i++) {
                for (int j = 0; j < sumArray.length; j++) {
                    for (int j2 = 0; j2 < sumArray.length; j2++) {
                        sumArray[i][j][j2] = firstArray[i][j][j2] + secondArray[i][j][j2];
                    }
                    System.out.println();
                }
            }
            for (int i = 0; i < sumArray.length; i++) {
                for (int j = 0; j < sumArray.length; j++) {
                    for (int j2 = 0; j2 < sumArray.length; j2++) {
        
                        System.out.printf("%d\t", sumArray[i][j][j2]);
                    }
                    System.out.println();
                }
          }
    }   
}
