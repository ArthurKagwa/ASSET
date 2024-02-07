import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
public class Client 
{
    private int loanDuration;
    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private double loanAmount;
    private String Admin;
    private double interestRate;
    private double weeklyPayment;
    private String security;
    private double securityValue;
    private double amountExpected;
    public double getAmountExpected() {
        return amountExpected;
    }

    public void setAmountExpected(int weeks) {
        this.amountExpected = weeks*this.weeklyPayment;
    }

    //private int loanDuration;
    //private LocalDateTime dateTaken;
    private double totalPayment;
    private double totalInterest;
    private  Date dateTaken;
    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    Scanner scanObj=new Scanner(System.in);
    public static ArrayList<Client> clients=new ArrayList<Client>();
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String clientId;
    
    public Client()
    {
        System.out.println("Enter First Name:");
        this.firstName=scanObj.nextLine();
        System.out.println("Enter Last Name:");
        this.lastName=scanObj.nextLine();
        System.out.println("Enter Email:");
        this.email=scanObj.nextLine();

        System.out.println("Enter Client id");
        this.clientId = scanObj.nextLine();
        System.out.println("Enter the loan amount:");
        this.loanAmount=scanObj.nextDouble();
        System.out.println("Enter interest rate:");
        this.interestRate=scanObj.nextDouble();
        this.weeklyPayment=this.loanAmount*this.interestRate;
        System.out.println("Enter security:");
        this.security=scanObj.next();
        System.out.println("Enter security value:");
        this.securityValue=scanObj.nextDouble();
        this.totalInterest=this.totalPayment-this.loanAmount;
        System.out.println("enter the date taken in the format yyyy-mm-dd");
        String date=scanObj.next();
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.dateTaken = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        

        

    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String admin) {
        Admin = admin;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getWeeklyPayment() {
        return weeklyPayment;
    }

    public void setWeeklyPayment(double weeklyPayment) {
        this.weeklyPayment = weeklyPayment;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public double getSecurityValue() {
        return securityValue;
    }

    public void setSecurityValue(double securityValue) {
        this.securityValue = securityValue;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment += totalPayment;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public static void main(String[] args) {

        
    }

}