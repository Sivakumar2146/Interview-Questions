package Java_IV_Q;

public class Large_MAX_MINI_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,30,20,90,600};
       
	    int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum of number is :"+max);
		
   int mini=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<mini)
			{
				mini=a[i];
			}
		}
		System.out.println("Minimun of number is :"+mini);
	
	
	}

}
