import java.util.Scanner;

public class ExecptionHandling {
    public static void main(String[] args) {

       {
            try( Scanner myscan = new Scanner(System.in)){ // using resources. open scanner after each loop
                while(true) {                              // closes it when its done
                    try {
                        System.out.println("please enter a number between 0 - 9 "); // prompt in the loop so it will run again
                        String input = myscan.nextLine();
                        int myNum = Integer.parseInt(input);// these throw an expection
                        if (myNum >= 0 && myNum <= 9) {
                            System.out.println("You entered " + myNum);
                            break;
                        } else {
                            System.out.println("Wrong you donkey");
                        }

                    }
                    catch(NumberFormatException nf){
                        System.out.println("wrong " + nf.getMessage());
                    }

                    catch(Exception e){
                        System.out.println("wrong " + e.getMessage());
                    }
                }
            }


            // finally block not required when using try with resources

        }
    }

}
