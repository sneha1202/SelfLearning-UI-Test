package basics;

public class EnhancerForLoop {
	public static void main(String[] args) {
		
		String arr[]= {"abc","def","ghi"};
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
