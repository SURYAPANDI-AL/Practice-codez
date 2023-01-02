import java.util.Scanner;

public class O11LeftRotateMultiDimensionalArrsy {
	
	public static int[] leftRotate(int arr[],int s) 
	{
		int b[]=new int[arr.length];
		int shift=s % (arr.length);
		System.arraycopy(arr, arr.length-shift, b, 0, shift);
		System.arraycopy(arr,0, b, shift, arr.length-shift);
		arr=b.clone();
		return arr;
	}
	public static int[] createArray(int grid[][],int x,int y,int m,int n)
	{
		if(m*n==1) {
			int arr[]= {grid[m-1][n-1]};
			return arr;
		}
		int len=2*(m+n-2);
		int arr[]=new int[len];
		int count=0,startx=x,starty=y;
		while(x<startx+m) {
			arr[count++]=grid[x][y];
			x++;
		}
		x--;y++;
		while(y<starty+n) {
			arr[count++]=grid[x][y];
			y++;
		}
		x--;y--;
		while(x>=startx) {
			arr[count++]=grid[x][y];
			x--;
		}
		x++;y--;
		while(y>starty) {
			arr[count++]=grid[x][y];
			y--;
		}
		return arr;
	}
	public static int[][] rotateGrid(int grid[][],int x,int y,int m,int n,int arr[]) 
	{
		if(m*n==1) {
			return grid;
		}
		int count=0,startx=x,starty=y;
		while(x<startx+m) {
			grid[x][y]=arr[count++];
			x++;
		}
		x--;y++;
		while(y<starty+n) {
			grid[x][y]=arr[count++];
			y++;
		}
		x--;y--;
		while(x>=startx) {
			grid[x][y]=arr[count++];
			x--;
		}
		x++;y--;
		while(y>starty) {
			grid[x][y]=arr[count++];
			y--;
		}
		return grid;
		
		
	}
	public static int[][] result(int a[][],int r)
	{
		int m=a.length,n=a[0].length,x=0,y=0;
		while(m>0&&n>0) {
			int arr[]=createArray(a,x,y,m,n);
			arr=leftRotate(arr,r);
			a=rotateGrid(a,x,y,m,n,arr);
			m-=2;n-=2;x+=1;y+=1;
		}
		return a;
	}

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int m=sc.nextInt(),n=sc.nextInt();
		int a[][]= new int[m][n];
		System.out.println("enter matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Matrix before the rotation:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		} 
		System.out.println("enter no of rotates:");
		int rotate=sc.nextInt();
        a=result(a,rotate);
        System.out.println("Matrix after the rotation:");
        for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		} 
        sc.close();
    }

}