import java.util.Scanner;

public class sorting_lexicographical {
	public static void sortfruits(String[] fruits , int size)
	{
		for(int i=0;i<=size-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<size;j++)
			{
				// e.g1  college<cot<cottage
				// e.g2  1<10<100<2<20
				// s1.compareTo(s2)
				// if  s1<s2 = negative no. , s1>s2 = positive no. , s1==s2 = 0 
				if(fruits[j].compareTo(fruits[min_index]) < 0)
				{
					min_index = j;
				}
			}
			String temp = fruits[min_index];
			fruits[min_index] = fruits[i];
			fruits[i] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] fruits = new String[size];
		System.out.println("Enter array elements(Enter only strings element): ");
		for(int i=0;i<size;i++)
		{
			fruits[i] = sc.nextLine();
		}
		sortfruits(fruits,size);
		for(String val : fruits)
		{
			System.out.print(val +",");
		}
	}
}
