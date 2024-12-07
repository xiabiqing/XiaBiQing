package www.hekeda.first;

import java.util.Scanner;

public class third {
    public static void main(String[]args)
    {

    System.out.println("平均分:"+averagescore(31));

    }
    public static double averagescore(int number)
    {
     int[] scores=new int[number];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<scores.length;i++)
        {
          int score=sc.nextInt();
          scores[i]=score;


        }
        int max=scores[0];
        for(int j=1;j<scores.length;j++)
        {
            if(max<scores[j])
            {
                max=scores[j];
            }

        }
        int min=scores[0];
        for(int k=1;k<scores.length;k++)
        {
            if(min>scores[k])
            {
                min=scores[k];
            }

        }
        double sum=0;
        for(int l=0;l<scores.length;l++)
        {

            sum+=scores[l];


        }
        return (sum-max-min)/(number-2);
    }


}
