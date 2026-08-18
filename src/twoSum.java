import java.util.Scanner;

public class twoSum
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the index of array");
        int n=input.nextInt();
        int[]ar=new int[n];
        for (int i=0;i<ar.length;i++) {
            System.out.println("enter the element of array");
            ar[i] = input.nextInt();
        }
        int i=0;
        int j=n-1;
        while (i<j)
        {
            if (ar[i]+ar[j]>1)
            {
                j++;
            }
            else if (ar[i]+ar[j]<1)
            {
                i++;
            }
            else if (ar[i]+ar[j]==1)
            {
                if (ar[i]==ar[i+1]&&ar[j]==ar[j-1])
                {
                    i++;
                    j--;
                }
              else   if (ar[i]==ar[i-1])
                {
                    i++;
                }
              else if (ar[j]==ar[j-1])
                {
                    j--;
                }
              else
                {
                    System.out.println("index i"+i+"j "+j);
                    i++;
                }
            }
        }
    }
}
