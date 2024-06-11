public class Array_1
{
    public static void main(String args[])
    {

        /// 1st method for creating array 
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 100;

        System.out.println("First marks : "+marks[0]);
        System.out.println("Second marks : "+marks[1]);
        System.out.println("Third marks : "+marks[2]);


        System.out.println("2nd method");

        //// 2nd method for creating array

        int[] mark = {98,97,96};
        System.out.println("First marks : "+mark[0]);
        System.out.println("Second marks : "+mark[1]);
        System.out.print("Third marks : "+mark[2]);

    }
}