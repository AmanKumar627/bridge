/**
 * @author:aman kumar
 * 
 * purpose:display all numbers which is prime as well as anagram between 1 to 1000
 *
 * date:
 */
public class PrimeAna {
	public static void main(String[] args) {
		//creating array of size 200;
		int p[]=new int[200];
		int n;int count=0;
		int pp=0;
		for(int i=2;i<1000;i++) {
			int flag=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			//checking if flag is 0 or not	
			}if(flag==1) {
				
				System.out.println(i);
			    
				p[pp]=i;
			    pp++;
			    count++;
			}
	}
		n=count;
	//for(int i=0;i<p.length;i++) {
	//if(p[i]!=0)
	    //System.out.println(p[i]);
	//}
	int k=0;
	int count1=0;
	boolean b=false;
	int aa[]=new int[200];	
	//calling my stack class 
	MyStack m=new MyStack();

	for(int i=0;i<p.length-2;i++) {
		for(int j=i+1;j<p.length;j++) {
		if(p[i]!=0&&p[j]!=0)
		//calling check method anagram calss	
			b=AnaQueue.check(p[i],p[j]);
		if(b==true) {
			System.out.println(p[i]+"  "+p[j]);
			aa[k]=p[i];
			m.push(p[i]);
		//	System.out.println(aa[k]);
			k++; 
			aa[k]=p[j];
			k++;
			m.push(p[j]);
			count1++;
//			if(p[i]==aa[k-2]) {
//				System.out.println(p[i]+" "+aa[k-2]);
//			}
		//	System.out.println(aa[k]);
		//	System.out.println(aa[k-1]+" "+aa[k-2]);
				}
		}


	}
	//for(int i=0;i<count1*2;i++)
	//{int a=m.popint();
	//if(p[i]!=0)
		//System.out.println(a);
	//}
	//for(int t=0;t<aa.length;t++) {
		//if(aa[t]!=0) {
		//	System.out.println(aa[t]);
		//}
	//}
	System.out.println("this is for stack");
	System.out.println(" ************************");

	m.reverse();
	       System.out.println(count1); 
	System.out.println("this for queue");
	System.out.println(" ************************");
	MyQueue mq=new MyQueue(count1*2);
	for(int i=0;i<p.length-2;i++) {
		for(int j=i+1;j<p.length;j++) {
		if(p[i]!=0&&p[j]!=0)
			b=AnaQueue.check(p[i],p[j]);
		if(b==true) {
			//System.out.println(p[i]+"  "+p[j]);
			//aa[k]=p[i];
			mq.enqueue(p[i]);
		//	System.out.println(aa[k]);
			//k++; 
			//aa[k]=p[j];
			//k++;
			mq.enqueue(p[j]);
			
//			if(p[i]==aa[k-2]) {
//				System.out.println(p[i]+" "+aa[k-2]);
//			}
		//	System.out.println(aa[k]);
		//	System.out.println(aa[k-1]+" "+aa[k-2]);
				}
		}


	}
	//for(int i=0;i<(count1*2)-1;i++);
	//{
	//int a=mq.dequeue();
	//System.out.println(a);
	//}
	System.out.println(mq);


	}
	}


