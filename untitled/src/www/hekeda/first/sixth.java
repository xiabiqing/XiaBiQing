package www.hekeda.first;

import java.util.Random;
import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        int[] arr={22,88,520,99,666};
        contain1(arr);
    }

    public static void contain1(int[] arr)
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("请输入任意内容：");
            sc.next();
            while (true) {
                int num=r.nextInt(5);
                if(arr[num]!=0)
                {
                    System.out.println("恭喜你，抽中红包"+arr[num]);
                    arr[num]=0;
                    break;
                }
            }

        }
        System.out.println("菜，你抢到红包了么？");
    }

}
