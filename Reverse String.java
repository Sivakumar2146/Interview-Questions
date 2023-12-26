package Java_IV_Q;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1) using + (string concatenation ) operator
		String str="SIVA";
		String rev="";
		
		int len=str.length();  //4
           
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
	
	System.out.println("Revered string is here:"  +   rev);
	
	
	
	//2 using character  array
		
		
		char a[]=str.toCharArray();
		int len=a.length;
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Revered string is here:"  +   rev);	
		
	3) String builder
   	StringBuffer sb=new StringBuffer(str);
    System.out.println(	sb.reverse());
		
		
	}
	
	

}
