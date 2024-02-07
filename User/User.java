
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;



public class User
{
    //only the admin shall use this program
    public static Scanner scanObj = new Scanner(System.in);
    public static Scanner scanObj1 = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String username;
    public String phoneNumber;
    public String address;
    public Date dateOfBirth;
    public int status=0;
     
  
    
    
    //constructor
User()
{
    System.out.println("Enter your first name");
    this.firstName = scanObj1.nextLine();
    System.out.println("Enter password");
    this.password = scanObj1.nextLine();
    status=0;
    // System.out.println("Enter your last name");
    // this.lastName = scanObj1.nextLine();
    // System.out.println("Enter your email");
    // this.email = scanObj1.nextLine();
    
    // System.out.println("Enter your username");
    // this.username = scanObj1.nextLine();
    // System.out.println("Enter your phone number");
    // this.phoneNumber = scanObj1.nextLine();
    // System.out.println("Enter your address");
    // this.address = scanObj1.nextLine();
    // System.out.println("Enter your date of birth (yyyy-MM-dd)");
    // String dateOfBirthStr = scanObj1.nextLine();

    // try {
    //     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //     this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
    // } catch (ParseException e) {
    //     System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd.");
    //     System.out.println("Enter your date of birth (yyyy-MM-dd)");
    //     dateOfBirthStr = scanObj1.nextLine();
        
    // }
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
        System.out.println("Login started");
        System.out.println("Enter first name;");
            String fname=scanObj1.nextLine();
            System.out.println(adminArrayList.get(0).firstName);
            for (Admin admin : adminArrayList) {
                if(admin.firstName.equals(fname))
                {
                    System.out.println("Enter password for" +admin.firstName);
                    String pass=scanObj1.nextLine();
                    if(admin.password.equals(pass))
                    {
                        System.out.println("SUCCESSFUL LOGIN");
                        admin.status=1;
                        
                    }
                    else
                    {
                        System.out.println("FAILED");
                    }
                }
    
            }
        }
          
    

public static void main(String[] args) {
    System.out.println("Welcome to the loan management system");
    System.out.println("Do you want to login or register an Admin");
    System.out.println("1. Login");
    System.out.println("2. Register");
    
    int choice = scanObj.nextInt();
   
   

    ArrayList<Admin> admins = new ArrayList<Admin>();
   
    
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

}
}



 



    


