/**
 * @author:aman kumar
 * 
 * 
 * purpose:binary conversion
 * 
 * 
 * date:
 *
 */

	

	public class Bin {
	static void toBinary(int num)
	{
		int a=num;
		String n="";
		while(num!=0)
		{
			int dec=num%2;
			n=dec+n;
			num=num/2;
		}
		System.out.println("the binary value of "+a+" is ("+n+")2");
		nibbles(n);
	}
	static void nibbles(String n)
	{
		String nibble="";
		char c[]=n.toCharArray();
		int mid=c.length/2;
		for(int i=mid;i<c.length;i++)
		{
			nibble=nibble+c[i];
		}
		for(int i=0;i<mid;i++)
		{
			nibble=nibble+c[i];
		}
		System.out.println("the nibble value is "+nibble);
		int num=Integer.parseInt(nibble);
		
		int count=Integer.toString(num).length(),j=0,sum=0;
		while(count!=0)
		{
			int rem=num%10;
			//System.out.println(rem);
			j++;
			int dec=1;
			if(rem==1)
			{
				//System.out.println(j);
				for(int i=0;i<j-1;i++)
				{
					dec=dec*2;
					
				}
				sum=sum+dec;
				
			}
			num=num/10;
			count--;
		}
		System.out.println(sum);
	}
	}


