/**
 * 
 * author:aman kumar
 * 
 * 
 * purpose: search the element
 * 
 *  
 *  date:
 */
	


	public class InSearch {
	static void search(int a[],int f,int l,int n){
	int flag=0;
		while(f<=l) {
		int mid=(f+l)/2;

		if(a[mid]==n) {
			System.out.println("elemnt is found"+n);
			flag=1;
			break;
		}else if(a[mid]>n) {
			l=mid-1;
			
		}
		else if(a[mid]<n) {
			f=mid+1;
		}
	}
	if(flag==0) {
		System.out.println("elemt is not found");
	}
	}
	static public int searchstr(String s[],String key,int low,int last ) {
		while(low<=last) {
			int mid=(low+last)/2;
			if(s[mid].compareTo(key)==0) {
				System.out.println("elemt found"+key+"at the index"+mid);
				break;
			} 
			else if(s[mid].compareTo(key)>0) {
				last=mid-1;
			}else if(s[mid].compareTo(key)<0) {
				low=mid+1;
			}
		}return 1;
	}
	}


