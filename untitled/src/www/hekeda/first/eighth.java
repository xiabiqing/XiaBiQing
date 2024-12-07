package www.hekeda.first;


public class eighth {
    public static void main(String[] args) {
        int[] arr2=search(100,200);
        System.out.println("素数有"+arr2[0]);
        for (int i=1;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
    public static int[] search(int num1,int num2)
    {
        int count1=0;
        int[] arr=new int[43];
        for(int i=num1;i<=num2;i++)
        {
            boolean flag=true;
            for(int j=2;j<=i/2&&flag;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }

            }

            if(flag)
            {
                count1++;
                arr[count1]=i;
            }
        }

        arr[0]=count1;
        return arr;

    }
}
