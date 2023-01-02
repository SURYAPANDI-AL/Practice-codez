import java.util.*;
public class O09MergeArray{
	public static int[] mergeArr(int arr1[],int arr2[] ) {
		int mergedArr[]=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++,k++)
			mergedArr[i]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			mergedArr[k+i]=arr2[i];
		Set<Integer> nodup=new HashSet<>();
		for(int i=0;i<mergedArr.length;i++)
			nodup.add(mergedArr[i]);
		Iterator<Integer> iterate=nodup.iterator();
		int merge[]=new int[nodup.size()];
		for(int i=0;iterate.hasNext();i++)
			merge[i]=iterate.next();
		Arrays.sort(merge);
		return merge;
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of elements in array1:");
		int l1=sc.nextInt();
		int arr1[]=new int[l1];
		for(int i=0;i<l1;i++)
			arr1[i]=sc.nextInt();
		System.out.println("enter the num of elements in array2:");
		int l2=sc.nextInt();
		int arr2[]=new int[l2];
		for(int i=0;i<l2;i++)
			arr2[i]=sc.nextInt();
		System.out.print("Merged Array:"+Arrays.toString(mergeArr(arr1,arr2)));
		sc.close();
	}
}
