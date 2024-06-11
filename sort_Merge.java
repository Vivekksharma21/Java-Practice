//import java.util.Scanner;
//
//public class sort_Merge {
//	static void merge(int[] arr, int left , int mid , int right,int size)
//	{
//		int lsize = mid - left + 1;
//		int rsize = right - mid;
//		int[] leftt = new int[lsize];
//		int[] rightt = new int[rsize];
//		int i,j,k;
//		for(i=0;i<lsize;i++) {leftt[i] = arr[left+i];}
//		for(j=0;j<rsize;j++) {rightt[j] = arr[mid+1+j];}
//		i=0;j=0;k=left;
//		while(i<lsize && j<rsize)
//		{
//			if(leftt[i] < rightt[j])
//			{
//				arr[k] = leftt[i];
//				k++;
//				i++;
//			}
//			else
//			{
//				arr[k++] = rightt[j];
//				k++;
//				j++;
//			}
//		}
//		while(i<lsize)
//		{
//			arr[k++] = leftt[i++];
//		}
//		while(j<rsize)
//		{
//			arr[k++] = rightt[j++];
//		}
//	}
//	static void merge_sort(int[] arr, int left, int right) {
//		if(left<right) {
//		int mid = (left + right)/2;
//
//            merge_sort(arr, left, mid);
//            merge_sort(arr, mid + 1, right);
//
//            merge(arr, left, mid, right, arr.length); 
//		}
//    }
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of the array : ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("Enter array elements : ");
//		for(int i=0;i<size;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		int left = 0;
//		int right =size-1;
//		
//		merge_sort(arr,left,right);
//		
//		System.out.println("After sorting array is : ");
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		sc.close();
//	}
//}

class sort_Merge {  
  
/* Function to merge the subarrays of a[] */  
void merge(int a[], int beg, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
   /* temporary Arrays */  
        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
      
    /* copy data to temp arrays */  
    for (i = 0; i < n1; i++)    
    LeftArray[i] = a[beg + i];    
    for (j = 0; j < n2; j++)    
    RightArray[j] = a[mid + 1 + j];    
      
    i = 0; /* initial index of first sub-array */  
    j = 0; /* initial index of second sub-array */   
    k = beg;  /* initial index of merged sub-array */  
      
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }    
}    
  
void mergeSort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
        int mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);  
        mergeSort(a, mid + 1, end);  
        merge(a, beg, mid, end);  
    }  
}  
  
/* Function to print the array */  
void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
  
public static void main(String args[])  
{  
    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
    int n = a.length;  
    sort_Merge m1 = new sort_Merge();  
    System.out.println("\nBefore sorting array elements are - ");  
    m1.printArray(a, n);  
    m1.mergeSort(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    m1.printArray(a, n);  
    System.out.println("");  
}  
  
  } 
