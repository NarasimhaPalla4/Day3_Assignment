public class Luggage {
    public static void main(String[] args) {
        float shruthiLuggage = 15.1f,bhavyaLuggage = 18, amount;
        try {
            float weight;
            weight = shruthiLuggage;
            if (weight > 15) {
                throw new WeightException();
            } else {
                System.out.println("No need to pay any additional amount");
            }
        }
        catch (Exception e) {
            amount=(shruthiLuggage-15)*500;
            System.out.println("Additional amount Shruthi has to pay is: "+amount);
        }

        try {
            float weight;
            weight = bhavyaLuggage;
            if (weight > 15) {
                throw new WeightException();
            } else {
                System.out.println("No need to pay any additional amount");
            }
        }
        catch (Exception e) {
            amount=(bhavyaLuggage-15)*500;
            System.out.println("Additional amount Bhavya has to pay is: "+amount);
        }

        finally {
            System.out.println("Thank you, Have a safe journey");
        }
    }
}
class WeightException extends Exception{
    WeightException(){
        System.out.println("Your luggage is more than 15kg, so you have to pay some additional amount");
    }
}
