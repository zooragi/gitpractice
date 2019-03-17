import java.util.Arrays;

public class Algo12 {

	public static void main(String[] args) {
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
		
		System.out.println("병합된 값");
		double merge[] = new double[a.length + b.length];
		for(int i = 0 ; i < a.length ; i ++)
		{
			merge[i] = a[i];
		}
		
		for(int i = a.length ; i < merge.length ; i ++)
		{
			merge[i] = b[i-a.length];
		}
		
		Arrays.sort(merge);

		
		for(int i = 0 ; i < merge.length ; i ++)
		{
			System.out.println(merge[i]);
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
