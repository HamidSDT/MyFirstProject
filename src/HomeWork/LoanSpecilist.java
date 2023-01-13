package HomeWork;

public class LoanSpecilist {
    public static void main(String[] args) {


        int laanAmount = 300000;  // this is the loan amount the client needs

        if(laanAmount<=200000){                   // this is the loan amount I can approve
            System.out.println("loan is approved");
        }else{
            System.out.println("loan is rejected"); // clint request will be rejected , cuz he/she is asking more than the approval amount which is 200000.
        }










    }
}
