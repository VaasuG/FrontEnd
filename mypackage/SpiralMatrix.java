import java.util.*;
public class SpiralMatrix
{
    public static void main()
    {
        Scanner vg = new Scanner(System.in);
        System.out.println("\t \t || Welcome to SpiralMatrixGen || \t @VaasuG");
        System.out.print("\n || Enter the limit (n) of the Matrix ->  ");
        int n = vg.nextInt();
        int arr[][] = new int [n][n];
        int k =0,c1=0,r1=0,c2=n-1,r2=n-1;
        int i,j;
        while(k!=n*n)
        {
            for (i=c1;i<=c2;i++)
                arr[r1][i] = ++k;
            for(j=r1+1;j<=r2;j++)
                arr[j][c2] = ++k;
            for(i=c2-1;i>=c1;i--)
                arr[r2][i] = ++k;
            for(j=r2-1;j>=r1+1;j--)
                arr[j][c1] = ++k;

            c1++;
            c2--;
            r1++;
            r2--;
        }
        System.out.println("\t \t || GENERATED MATRIX ||");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print( "\t|"+arr[i][j]+ "|");
            System.out.println();
        }
    }
}
