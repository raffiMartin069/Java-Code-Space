/**
 * Junior Male = 100
 * Junior Female = 120
 * 
 * Senior Male = 80
 * Senior Female = 100
 * 
 * Healthy:
 *  Junior male and Junior female = 15%
 *  Senior male and Senior Female = 25%
 * 
 *  Sick Junior male and female = 35%
 *  Sick Senior male and female = 30% 
 * 
 *  Carriers Junior male and female = 50%
 *  Carriers Senior male and female = 45%
 * 
 * ?How many is sick, healthy and carrier?
 */
public class Contagion {

    public static void main(String[] args) {
   
        //* 2x3 array is used. 2 Sexes or gender (Male & Female).
        //* 3 rows for the values of healthy, sick and
        int arr[][] = new int [2][3];
        arr[0][0] = 35;
        arr[0][1] = 59;
        arr[0][2] = 86;

        arr[1][0] = 43;
        arr[1][1] = 72;
        arr[1][2] = 105;

        //!ARRAY IS KNOWN! PRINT ARRAY DIRECTLY.
        //!The array is declared as 2x3 (rows x columns).
        //* I printed based on my calculations through the use of paper.
        //* Fixed values are then set to display output.

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                if (arr[i][j] == arr[0][0] || arr[i][j] == arr[0][1] || arr[i][j] == arr[0][2]) {
                    System.out.printf("Male\n======");
                    System.out.printf("\nHealthy: %d", arr[0][0]);
                    System.out.printf("\nSick: %d", arr[0][1]);
                    System.out.printf("\nCarrier: %d", arr[0][2]);
                    System.out.println();
                } else if (arr[i][j] == arr[1][0] || arr[i][j] == arr[1][1] || arr[i][j] == arr[1][2]){
                    System.out.printf("Female\n======");
                    System.out.printf("\nHealthy: %d", arr[1][0]);
                    System.out.printf("\nSick: %d", arr[1][1]);
                    System.out.printf("\nCarrier: %d", arr[1][2]);
                }
            }
            System.out.println();
        }
    }
}