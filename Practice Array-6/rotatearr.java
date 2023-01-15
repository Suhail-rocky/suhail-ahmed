import java.util.Arrays;
 class rotatearr
{
	static int arr[] = new int[]{1, 2, 3, 4, 5};
	
	// Method for rotation
	static void rotate()
	{
	int x = arr[arr.length-1], i;//(arr.length = 5-1 = 4) x=4
	for (i = arr.length-1; i > 0; i--)//(i=5-1 => i=4)
		arr[i] = arr[i-1];//arr[4] = arr[4-1] >= 5 = 4
	arr[0] = x;//1= 5
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		rotate();
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
}
