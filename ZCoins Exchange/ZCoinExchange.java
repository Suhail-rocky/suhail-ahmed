import java.util.*;
import java.util.regex.*;
public class ZCoinExchange
{
    Scanner sc = new Scanner(System.in);
    static int id=1;
    static int acc=1;

    static int zid =0;
    static int count=0;

    ArrayList<Account> coins = new ArrayList<Account>();
    ArrayList<Account> admin = new ArrayList<Account>();

    public static void main(String[] args)
    {

        ZCoinExchange zc = new ZCoinExchange();
        zc.Login();
    }
    public void Accountwork()
    {
        int m=0;
        do{

            System.out.println("1.view 2.Exit");
            m = sc.nextInt();
            switch(m)
            {
                case 1:
                    viewAccount();
                    break;
            }
        }while(m != 2);


    }
    public void createAccount()
    {
        System.out.println("Enter a Name : ");
        String names = sc.next();
        System.out.println("Enter a EmailID :");
        String emailid=sc.next();
        System.out.println("Enter a mobile number");
        long mobilenumber=sc.nextLong();
        System.out.println("Enter a Password");
        String password=sc.next();
        if(checkPassword(password))
        {
            System.out.println("Enter a initial amount :");
            int amt = sc.nextInt();
            Account ac = new Account(names,emailid,mobilenumber,id*1+1000,password,amt,0);
            id++;
            coins.add(ac);
            acc++;
        }
        else
        {
            createAccount();
        }

    }
    public void viewAccount()
    {
        int check=0;
        System.out.println("\tID\tname\tEmailID\t\tmobileNumber\tpassword\t\tInitialAmount\tzcoin ");
        for(int i=0;i<coins.size();i++)
        {
            System.out.println(coins.get(i));
        }
        do {
            System.out.println("1.approved 2.Reject 3.Exit");
            check = sc.nextInt();
            switch(check)
            {
                case 1:
                    ZEapproval();
                    break;
                case 2:
                    ZERemoval();
                    break;
            }

        }while(check != 3);

    }
    private boolean checkPassword(String password)
    {
        String regex="^(?=.*[a-z])+(?=.*[0-9])+(?=.*[A-Z])+(?=.*[!@#$%&*%])+(?=[\\S+$]).{8,20}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean var=m.matches();
        return var;


    }
    public void Login()
    {
        int check=0;
        do
        {
            System.out.println("1.AgentLogin  2.UserLogin 3.Exit ");
            check=sc.nextInt();
            switch(check)
            {
                case 1:
                    agentLogin();
                    break;
                case 2:
                    userLogin();
                    break;
                default:
                    break;
            }
        }while(check != 3);


    }
    public void agentLogin()
    {
        System.out.println("Enter a username :");
        String username = sc.next();
        System.out.println("Enter a password :");
        String password = sc.next();
        if(username.equals("admin") && password.equals("admin123"))
        {
            System.out.println("Login Sucessfully");
            Accountwork();
        }
        else
        {
            System.out.println("Try again");
            agentLogin();
        }
    }
    public void userLogin() {
        int n = 0;
        do {
            System.out.println("1.SignUp 2.SignIn 3.Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    signUps();
                    break;
                case 2:
                    signIn();
                    break;
                default:
                    //  System.out.println("Try Again ");
                    break;

            }
        } while (n != 3) ;


    }
    public void signUps()
    {
        createAccount();
    }
    public void signIn()
    {
        System.out.println("Waiting for Admin approval");
        if(count == 1) {
            int check = 0;
            count =0;
            System.out.println("Admin approved SucessFully");
            System.out.println("Enter username : ");
            String username = sc.next();
            System.out.println("Enter password : ");
            String password = sc.next();
            for (int i = 0; i < coins.size(); i++) {
                if (coins.get(i).name.equals(username) && coins.get(i).password.equals(password)) {
                    System.out.println("SignIn Successfully");
                    UserAccountManagementPanel();
                    check = 1;

                }
            }
            if (check == 0) {
                System.out.println("Your account has been rejected Try Again");
            }
        }
        if(count == 2)
        {
            count=0;
            System.out.println("admin rejected Please Try Again !");
            System.out.println("1.Re-Signup 2.Exit");
            int trs= sc.nextInt();
            switch (trs)
            {
                case 1:
                    signUps();
                    break;
            }
        }
    }
    public void ZEapproval()
    {
        count++;
        System.out.println("Enter a Unique ID :");
        int uniqueID = sc.nextInt();
        for(int i=0;i<coins.size();i++)
        {
            if(coins.get(i).H_ID == uniqueID)
            {
                admin.addAll(coins);
            }
        }
        System.out.println("ZE Approved Successfully ");


    }
    public void ZERemoval()
    {
        count=2;
        System.out.println("Enter a Unique ID :");
        int uniqueID = sc.nextInt();
        for(int i=0;i<coins.size();i++)
        {
            if(coins.get(i).H_ID == uniqueID)
            {
                coins.remove(i);
            }
        }
        System.out.println("ZE Removed Successfully ");


    }

    public void UserAccountManagementPanel()
    {
        int choice = 0;
        do
        {
            System.out.println("1.Account Details 2.Transaction History 3.Change Password 4.RC Transaction 5.Zcoin Transaction 6.Exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    accountDetails();
                    break;
                case 2:
                    transactionHistory();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                    RCtransaction();
                    break;
                case 5:
                    Zcointransaction();
                    break;
                default:
                    System.out.println("Try Again");
                    break;

            }
        }while(choice != 6);

    }
    private void accountDetails()
    {
        System.out.println("\tID\tname\tInitialAmount\tZcoins ");
        for(int i=0;i<coins.size();i++)
        {
            System.out.print("\t"+coins.get(i).H_ID+"\t"+coins.get(i).name+"\t"+coins.get(i).rc+"\t"+coins.get(i).zcoin);
        }
        System.out.println();
    }
    private void transactionHistory()
    {

    }
    private void changePassword()
    {
        System.out.println("Enter a Unique ID :");
        int uniqueID = sc.nextInt();
        for(int i=0;i<coins.size();i++)
        {
            if(coins.get(i).H_ID == uniqueID)
            {
                System.out.println("Enter the change password : ");
                String changePassword =sc.next();
                if(checkPassword(changePassword))
                {
                    coins.get(i).password=changePassword;
                }
                else {
                    changePassword();
                }
            }
        }
        System.out.println("Changed Sucessfully");

    }
    private void RCtransaction()
    {

        System.out.println("Enter a Unique ID : ");
        int uid = sc.nextInt();
        for(int i=0;i<coins.size();i++)
        {
            if(coins.get(i).H_ID==uid)
            {
                coins.get(i).zcoin=coins.get(i).rc/2;
            }
        }
        System.out.println("Changed Sucessfully");

    }
    private void Zcointransaction()
    {

        System.out.println("Enter a Unique ID : ");
        int uid = sc.nextInt();
        for(int i=0;i<coins.size();i++)
        {
            if(coins.get(i).H_ID==uid)
            {
                coins.get(i).rc=coins.get(i).zcoin-(float)0.15;
                coins.get(i).zcoin=0;
            }
        }
        System.out.println("Changed Sucessfully");
    }
}

class Account
{
    String name;
    String emailid;
    long mobilenumber;
    int H_ID;
    String password;
    float rc;
    float zcoin;
    Account(String name,String emailid,long mobilenumber,int H_ID,String password,float rc,float zcoin)
    {
        this.name = name;
        this.emailid=emailid;
        this.mobilenumber=mobilenumber;
        this.H_ID=H_ID;
        this.password=password;
        this.rc=rc;
        this.zcoin=zcoin;

    }
    public String toString()
    {
        return "\t"+H_ID+"\t"+name+"\t"+emailid+"\t"+mobilenumber+"\t"+password+"\t"+rc+"\t"+zcoin;
    }

}

