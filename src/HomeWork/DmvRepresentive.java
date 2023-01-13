package HomeWork;

public class DmvRepresentive {
    public static void main(String[] args) {

        /*You are DMV representative ,and you need to ask customer their age. If they are 18 and older you will
        issue a driver licence to them, otherwise you will offer them to get a learners permit.

         */

        int age = 19;
        if (age>=18){  // in this case age is greater than 18 , driver's license  will be issued to the customer
            System.out.println("we will issue you a driver license ");  // this block will be executed , cuz the condition is true, age is higher than 18,
        } else {
            System.out.println("get a learners permit"); // if instead of age-19 there was 17 or under , this block was going to be executed
        }







    }
}
