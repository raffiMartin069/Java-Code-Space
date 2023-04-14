public class ContagionOptimal {
    public static void main(String[] args) {

           
                int[][] arr = {{35, 59, 86}, {43, 72, 105}}; // Use array initialization syntax
        
                // Use a foreach loop to iterate over the rows of the array
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0) {
                        System.out.printf("Male\n======\n");
                    } else if (i == 1) {
                        System.out.printf("\nFemale\n======\n");
                    }
        
                    // Use a switch statement to handle the columns of the array
                    for (int j = 0; j < arr[i].length; j++) {
                        switch (j) {
                            case 0:
                                System.out.printf("Healthy: %d\n", arr[i][j]);
                                break;
                            case 1:
                                System.out.printf("Sick: %d\n", arr[i][j]);
                                break;
                            case 2:
                                System.out.printf("Carrier: %d\n", arr[i][j]);
                                break;
                            default:
                                break;
                        }
                    }
                    System.out.println();
                }
            }
        }

