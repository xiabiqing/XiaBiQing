package www.hekeda.first;

import java.util.Random;
import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        contain1(arr);

    }
    public static void contain1(int[] arr)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for(int i=0;i<(arr.length)/2;i++)
        {
         int num1=(r.nextInt(1)+3);
            int temp=arr[i];
            arr[i]=arr[num1];
            arr[num1]=temp;
        }
        System.out.println("请输入任意内容领取红包：");
        for(int j=0;j<arr.length;j++)
        {
            sc.next();
            System.out.println("恭喜你，领取红包"+arr[j]);

        }
        System.out.println("小屁孩，红包已经被抢完了。");
    }
}
