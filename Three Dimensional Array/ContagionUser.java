import java.util.Scanner;

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
 *      ?This line of codes can be inserted at Process method to show result by not using for loop.
 *      
        System.out.printf("\n\nTotal Healthy Male Jr: "+healthyMaleJr);
        System.out.printf("\nTotal Healthy Male Sr: "+healthyMaleSr);
        System.out.printf("\nTotal Health Female Jr: "+healthyFemaleJr);
        System.out.printf("\nTotal Healthy Female Sr: "+healthyFemaleSr);
        
        System.out.printf("\n\nTotal Sick Male Jr: "+sickMaleJr);
        System.out.printf("\nTotal Sick Male Sr: "+sickMaleSr);
        System.out.printf("\nTotal Sick Female Jr: "+sickFemaleJr);
        System.out.printf("\nTotal Sick Female Sr: "+sickFemaleSr);
        
        System.out.printf("\n\nTotal Carrier Male Jr: "+carrierMaleJr);
        System.out.printf("\nTotal Carrier Male Sr: "+carrierMaleSr);
        System.out.printf("\nTotal Carrier female Jr: "+carrierFemaleJr);
        System.out.printf("\nTotal Carrier female Sr: "+carrierFemaleSr);
 */
public class ContagionUser {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Process();
    }
    public static void Process() {
        System.out.printf("Enter Number of Male Senior: ");
        int maleSr = in.nextInt();
        
        System.out.printf("Enter Number of Male Junior: ");
        int maleJr = in.nextInt();
        
        System.out.printf("Enter Number of Female Senior: ");
        int femaleSr = in.nextInt();

        System.out.printf("Enter Number of Female Junior: ");
        int femaleJr = in.nextInt();

        int maleCount = MaleTotal(maleSr, maleJr);
        int femaleCount = MaleTotal(femaleSr, femaleJr);

        System.out.printf("\n\nTotal Number Of Male: "+maleCount);
        System.out.printf("\nTotal Number Of Female: "+femaleCount);
        
        int healthyMaleJr = HealthyMaleJr(maleJr);
        int healthyMaleSr = HealthyMaleSr(maleSr);
        int healthyFemaleJr = HealthyFemaleJr(femaleJr);
        int healthyFemaleSr = HealthyFemaleSr(femaleSr);

        int sickMaleJr = SickMaleJr(maleJr);
        int sickMaleSr = SickMaleSr(maleSr);
        int sickFemaleJr = SickFemaleJr(femaleJr);
        int sickFemaleSr = SickFemaleSr(femaleSr);

        int carrierMaleJr = CarriersMaleJr(maleJr);
        int carrierMaleSr = CarriersMaleSr(maleSr);
        int carrierFemaleJr = CarrierfemaleJr(femaleJr); 
        int carrierFemaleSr = CarriersfemaleSr(femaleSr);

        int arr[][] = new int[2][3];

        arr[0][0] = healthyMaleJr + healthyMaleSr;
        arr[0][1] = sickMaleJr + sickMaleSr;
        arr[0][2] = carrierMaleJr + carrierMaleSr;   
        
        arr[1][0] = healthyFemaleJr + healthyFemaleSr;
        arr[1][1] = sickFemaleJr + sickFemaleSr;
        arr[1][2] = carrierFemaleJr + carrierFemaleSr;
        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j] == arr[0][0]){
                    System.out.println("Total Healthy Male: "+arr[0][0]);
                } else if(arr[i][j] == arr[0][1]){
                    System.out.println("Total Sick Male: "+arr[0][1]);
                } else if(arr[i][j] == arr[0][2]){
                    System.out.println("Total Carrier Male: "+arr[0][2]); 
            }   
        } 
    } 
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == arr[1][0]){
                System.out.println("Total Healthy Female: "+arr[1][0]);
            } else if(arr[i][j] == arr[1][1]){
                System.out.println("Total Sick Female: "+arr[1][1]);
            } else if(arr[i][j] == arr[1][2]){
                System.out.println("Total Carrier Female: "+arr[1][2]); 
        }   
    }

}
    }   //!Division of task calculations.
    public static int MaleTotal(int maleSr, int maleJr) {
        return maleJr + maleSr;
    }
    public static int FemaleCount(int femaleSr, int femaleJr) {
        return femaleJr + femaleSr;
    }
    public static int HealthyMaleJr(int maleJr) {
        return  (int) (maleJr * 0.15);
    }
    public static int HealthyMaleSr(int maleSr) {
        return  (int) (maleSr * 0.25);
    }
    public static int HealthyFemaleJr(int femaleJr) {
        return  (int) (femaleJr * 0.15);
    }
    public static int HealthyFemaleSr(int femaleSr) {
        return  (int) (femaleSr * 0.25);
    }
    public static int SickMaleJr(int maleJr) {
        return (int) (maleJr * 0.35);
    }
    public static int SickMaleSr(int maleSr) {
        return (int) (maleSr * 0.30);
    }
    public static int SickFemaleJr(int femaleJr) {
        return  (int) (femaleJr * 0.35);
    }
    public static int SickFemaleSr(int femaleSr) {
        return  (int) (femaleSr * 0.30);
    }
    public static int CarriersMaleJr(int maleJr) {
        return (int) (maleJr * 0.50);
    }
    public static int CarriersMaleSr(int maleSr) {
        return (int) (maleSr * 0.45);
    }
    public static int CarrierfemaleJr(int femaleJr) {
        return (int) (femaleJr * 0.50);
    }
    public static int CarriersfemaleSr(int femaleSr) {
        return (int) (femaleSr * 0.45);
    }
}
