import java.util.Scanner;
class PetrolBunk
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many petrol in Car(litres) : ");
		int petrol = sc.nextInt();
		System.out.println("Enter a no of distances in each petrol bunk : ");
		int bunk=sc.nextInt();
		int petrolBunk[]=new int[bunk];
		for(int i=0;i<bunk;i++)
		{
			petrolBunk[i]=sc.nextInt();
		}
		System.out.println("Enter a no of capacity : ");
		int capacity = sc.nextInt();
		int capacities[]=new int[capacity];
		for(int i=0;i<capacity;i++)
		{
			capacities[i]=sc.nextInt();
		}
		for(int i=0;i<bunk;i++)
		{
			petrol +=petrolBunk[i];
			capacity += capacities[i];
		}
		System.out.println("Remaining "+(petrol-capacity)+" litres");
		
	}
}