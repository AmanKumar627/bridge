
public class Sort {static String[] sort(String a[],int low,int high)
{
	if(low<high)
	{
		int mid=(low+high)/2;
		//System.out.println(low+" "+mid);
		sort(a, low, mid);
		//System.out.println((mid+1)+" "+high);
		sort(a,mid+1,high);
		//System.out.println(low+" "+mid+" "+high);
		Merge.merge(a, low, mid, high);
	}
	return a;
}
}


