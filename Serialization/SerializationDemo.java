import java.io.*;
import java.util.Scanner;

public class SerializationDemo {
    static int n=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no of details : ");
        n = sc.nextInt();
        Employee emps[]= new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a name :");
            String name = sc.next();
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            emps[i]=new Employee(name,age);
            }

        try
        {
            FileOutputStream fos = new FileOutputStream("D:\\ghost videos\\suhail.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            for(int i=0;i<n;i++) {
                os.writeObject(emps[i]);
            }
            os.close();
            fos.close();
            System.out.println("suhail file stored");
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            FileInputStream fis = new FileInputStream("D:\\ghost videos\\suhail.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            for(int i=0;i<n;i++) {
               emps[i]=(Employee) ois.readObject();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            for(int i=0;i<n;i++)
            {
                System.out.println(emps[i]+" ");
            }
        }
    }
}
class Employee implements Serializable
{
    String name;
    int age;
    Employee( String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public String toString()
    {
        return "\t"+name+"\t"+age;
    }


}
