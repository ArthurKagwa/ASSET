import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class Admin
{   
    public static int AdminIndex;
    public static ArrayList<Admin> admins = new ArrayList<Admin>();
    //only the admin shall use this program
    public static Scanner scanObj = new Scanner(System.in);
    public static Scanner scanObj1 = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private int status=0;
    private String adminId;
    public String getAdminId() {
        
        return adminId;
    }
    public static Scanner getScanObj() {
        return scanObj;
    }
    public static void setScanObj(Scanner scanObj) {
        Admin.scanObj = scanObj;
    }
    public static Scanner getScanObj1() {
        return scanObj1;
    }
    public static void setScanObj1(Scanner scanObj1) {
        Admin.scanObj1 = scanObj1;
    }
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

   public Admin()
    {
        System.out.println("Enter  first name");
    this.firstName = scanObj1.nextLine();
    System.out.println("Enter password");
    this.password = scanObj1.nextLine();
    status=0;
    System.out.println("Enter last name");
    this.lastName = scanObj1.nextLine();
    System.out.println("Enter your admin id");
        this.adminId = scanObj1.nextLine();
    System.out.println("Enter email");
    this.email = scanObj1.nextLine();
    
    System.out.println("Enter username");
    this.username = scanObj1.nextLine();
    System.out.println("Enter your phone number");
    this.phoneNumber = scanObj1.nextLine();
    System.out.println("Enter your address");
    this.address = scanObj1.nextLine();
    System.out.println("Enter your date of birth (yyyy-MM-dd)");
    String dateOfBirthStr = scanObj1.nextLine();

    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
    } catch (ParseException e) {
        System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd.");
        System.out.println("Enter your date of birth (yyyy-MM-dd)");
        dateOfBirthStr = scanObj1.nextLine();
            }
        
    }
    public void createClient()
    {
        System.out.println("!!!!!");
        System.out.println("INSTRUCTIONS");
        System.out.println("1. Loan amount must be 1.5*Loan amount otherwise Loan shall be denied.");
        Client client=new Client();
        client.setAdmin(this.firstName+" "+this.lastName);
        if(client.getSecurityValue()>=client.getLoanAmount()*1.5)
        {
            System.out.println("************************************");
            System.out.println("Loan approved.");
            Client.clients.add(client); 
        }
        else
        {
            System.out.println("Insufficient Security.");
        }
        
     
    }   

    public void updateLoanamount()
    {
        System.out.println();
        System.out.println("Enter the client id");
        String clientId=scanObj1.next();
        for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
        {
            System.out.println("Enter the new loan amount");
                double loanAmount=scanObj1.nextDouble();
                client.setLoanAmount(loanAmount);
        }
    }
    }
    public void updateInterest()
    {
        System.out.println();
        System.out.println("Enter the client id");
        String clientId=scanObj1.next();
        for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
        {
            System.out.println("Enter the new  Interest");
                double loanAmount=scanObj1.nextDouble();
                client.setInterestRate(loanAmount);
        }
    }
    }

    public void updateDateTaken()
    {
        System.out.println("Enter the client id");
        String clientId=scanObj1.next();
        for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
            {
                System.out.println("Enter the new date in the format yyyy-MM-dd");
                String date=scanObj1.next();
                try {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    client.setDateTaken(dateFormat.parse(date));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
    }
    }

    static  Admin registerAdmin()
    {
        System.out.println("Enter Admin details");
    
        System.out.println("================ADMIN================");
            
            Admin admin =new Admin();
            System.out.println("SUCCESSFULL REGISTRATION");
    
            return admin;
    
    }
    static void logAdmin( ArrayList<Admin> adminArrayList)
    {
        System.out.println();
        System.out.println("Login started");
        System.out.println("Enter Admin ID or username or email;");
            String fname=scanObj1.nextLine();
            
            for (Admin admin : adminArrayList) {
                if(admin.username.equals(fname)||admin.email.equals(fname)||admin.adminId.equals(fname))
                {
                    System.out.println("Enter password for" +admin.firstName+" "+admin.lastName);
                    String pass=scanObj1.nextLine();
                    if(admin.password.equals(pass))
                    {
                        System.out.println("SUCCESSFUL LOGIN");
                        admin.status=1;
                        
                    }
                    else
                    {
                        System.out.println("FAILED");
                        logAdmin(adminArrayList);
                    }
                }
                else{
                    System.out.println("No record found for "+fname);logAdmin(adminArrayList);

                }
    
            }
        }
          
    
        public void manageClient()
        {
            System.out.println("Choose an option");
            System.out.println("1. To enter client payment");
            System.out.println("2. To change date of loan");
            System.out.println("3. To change loan amount");
            System.out.println("4. To change interest rate");
            System.out.println("5. to view client");
            System.out.println();
            int l=scanObj1.nextInt();
            if(l==1)
            {
                admins.get(AdminIndex).enterClientPayment();
            }
            else if(l==2)
            {
                admins.get(AdminIndex).updateDateTaken();
            }
            else if(l==3)
            {
                admins.get(AdminIndex).updateLoanamount();
            }
            else if(l==4)
            {
               admins.get(AdminIndex).updateInterest();
            }
            
        }

      
    public void viewClient()
    {
        int weeks=0;
        
        System.out.println("Enter client ID");
            String clientId=scanObj1.nextLine();
            for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
            {
                System.out.println("Client id: "+client.getClientId());
                System.out.println("Loan amount: "+client.getLoanAmount());
                System.out.println("Admin: "+client.getAdmin());
                System.out.println("Interest rate: "+client.getInterestRate());
                System.out.println("Weekly payment: "+client.getWeeklyPayment());
                System.out.println("Security: "+client.getSecurity());
                System.out.println("Security value: "+client.getSecurityValue());
                System.out.println("Total interest: "+client.getTotalInterest());
                System.out.println("Total payment: "+client.getTotalPayment());
                Date date=new Date();
                long diff = date.getTime() - client.getDateTaken().getTime();
                 weeks= (int) (diff / (1000*60*60*24*7));
                 client.setLoanDuration(weeks);
                System.out.println("Loan duration: "+client.getLoanDuration()+" weeks");
                client.setLoanDuration(weeks);
                client.setAmountExpected(weeks);
                System.out.println("Expected Amount to be paid: "+client.getAmountExpected());
            }
        }
    }
    public void enterClientPayment()
    {

        System.out.println("Enter client ID");
        String clientId=scanObj1.nextLine();
        for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
            {
                System.out.println("Enter amount paid:");
                double o=scanObj1.nextDouble();
                client.setTotalPayment(o);

            }
        }

    }
    public int loanPeriodInWeeks()
    {
        System.out.println("Enter client ID");
        String clientId=scanObj1.nextLine();
        int weeks=0;
        for(Client client:Client.clients)
        {
            if(client.getClientId().equals(clientId))
            {
                
            }
        }
        return weeks;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the loan management system");
        System.out.println("Do you want to login or register an Admin");
        System.out.println("1. Login");
        System.out.println("2. Register");
        
        int choice = scanObj.nextInt();
        
    
        while(choice==2)
        {
            admins.add(registerAdmin());
            System.out.println("Do you want to register another Admin");
            System.out.println("2 Yes" + "1 No");
            choice = scanObj.nextInt();
        }
        if(choice==1)
        {
            logAdmin(admins);
         
     
        }
        
        
        for(int i=0;i<admins.size();i++)
        {
            if (admins.get(i).status==1){AdminIndex=i;}
        }
        System.out.println("WELCOME ADMIN "+admins.get(AdminIndex).firstName );
        System.out.println("You are signed in.");
        System.out.println("DO You want to create a client?");
        System.out.println("Enter 1 for yes, 2 for no");
        int g=scanObj1.nextInt();
        while(g==1)
        {
            
            admins.get(AdminIndex).createClient();
        
        System.out.println("Do you want to register another client?");
        System.out.println("Enter 1 for yes , 2 for no");
        g=scanObj1.nextInt();
        }
        System.out.println("Do you want to view a client?");
        System.out.println("Enter 1 for yes, 2 for no");
        int j=scanObj1.nextInt();
        while(j==1)
        {
            
                admins.get(AdminIndex).viewClient();
            System.out.println("Do you want to view another client?");
            System.out.println("Enter 1 for yes , 2 for no");
            j=scanObj1.nextInt();
        }
        System.out.println("Do you  want to manage a client??");
        System.out.println("Enter 1 for yes, 2 for no");
        int k=scanObj1.nextInt();
        while(k==1)
        {
            
            admins.get(AdminIndex).manageClient();
            System.out.println("Do you  want to manage another client??");
            System.out.println("Enter 1 for yes, 2 for no");
        k=scanObj1.nextInt();
        }
    }
}
