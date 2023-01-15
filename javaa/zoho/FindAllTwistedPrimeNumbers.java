//import required classes and packages  
import java.util.*;  
import java.io.*;  
  
//create FindAllTwistedPrimeNumbers class to get all the twisted prime numbers in the given range  
class FindAllTwistedPrimeNumbers {  
   
    // create checkPrimeNumber() method to check whether the number is prime or not  
    static boolean checkPrimeNumber(int number)  
    {  
        int i;  
        int m = 0;  
        int flag = 0;        
        m = number/2;        
        if(number == 0 || number == 1){    
            return false;        
        }else{    
            for(i = 2; i <= m ;i++){        
                if(number%i == 0){        
                    flag=1;        
                    return false;       
                }        
            }        
            if(flag == 0)    
            {   
                return true;  
            }    
        }  
        return false;  
    }  
      
    static int getReverseNumber(int number){  
        int rev = 0;    
        while(number != 0)     
        {    
            int rem = number % 10;    
            rev = rev * 10 + rem;    
            number = number/10;    
        }  
        return rev;  
    }  
   
    // create checkTwistedPrimeNumber() to check whether the numbers are twisted prime or not  
    static boolean checkTwistedPrimeNumber(int number)  
    {  
        if(checkPrimeNumber(number) && checkPrimeNumber(getReverseNumber(number)))  
            return true;  
        else  
            return false;  
    }  
   
    /* Driver program to test above function */  
    public static void main(String[] args)  
    {  
        int startRange, endRange;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter start value");  
          
        //store user entered value into variable startRange  
        startRange = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter last value");  
          
        //store user entered value into variable endRange  
        endRange = sc.nextInt();  
          
        System.out.println("The twisted prime numbers between" + startRange + " and " + endRange + "are:");  
          
        for (int i = startRange; i < endRange; i++) {  
            if (checkTwistedPrimeNumber(i)){  
                System.out.println(i);  
            }  
        }  
    }  
}  
