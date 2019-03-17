import java.util.Arrays;

public class Main {
	public Main() {
		
	
		int n = 10;
		double[] a = new double[n];
		
		System.out.println("a 정렬");
		for(int i = 0; i <n ; i++)
		{
			a[i]=(Math.random()*45) + 1;
		}
		Arrays.sort(a);
		
		for (int i = 0 ; i < n ; i++) 
		{
			System.out.println(a[i]);
		}
		
		double[] b =new double[n];
		System.out.println("b 정렬");
		
		for(int i = 0; i <n ; i++)
		{	
			b[i]=(Math.random()*45) + 1;
		}
		Arrays.sort(b);
		
		for (int i = 0 ; i < n ; i++) 
		{
			System.out.println(b[i]);
		}
		
		/*int merge[] = new int[a.length+b.length];
		System.arraycopy(a, 0, merge, 0, a.length);
	    System.arraycopy(b, 0,merge,a.length,merge.length);
		for(int i = 0 ; i < merge.length ; i++)
		{
			System.out.println(merge[i]);
		}*/
	
	}
}
