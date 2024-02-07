import java.time.*;
import java.util.*;
class Client extends User
{
     String clientId;
    private double loanAmount;
    private double interestRate;
    private double weeklyPayment;
    private String security;
    private double securityValue;
    //private int loanDuration;
    //private LocalDateTime dateTaken;
    private double totalPayment;
    private double totalInterest;
    public Client()
    {
        super();
        System.out.println("Enter your client id");
        this.clientId = scanObj.nextLine();
        System.out.println("Enter the loan amount:");
        this.loanAmount=scanObj.nextDouble();
        System.out.println("Enter interest rate:");
        this.interestRate=scanObj.nextDouble();
        this.weeklyPayment=this.loanAmount*this.interestRate;
        System.out.println("Enter security:");
        this.security=scanObj.nextLine();
        System.out.println("Enter security value:");
        this.securityValue=scanObj.nextDouble();
        System.out.println("Enter ");
        this.totalInterest=this.totalPayment-this.loanAmount;

    }

    public static void main(String[] args) {

        
    }

}