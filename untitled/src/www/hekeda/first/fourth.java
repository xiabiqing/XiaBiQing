package www.hekeda.first;

public class fourth {
    public static void main(String[] args) {

        int number;
        System.out.println(secret(1983));

    }
    public static String secret(int number) {
       int[]numbers= split(number);
        for(int i=0;i<numbers.length;i++)
        {
           numbers[i]=(numbers[i]+5)%10;
        }
    //1 2 3 4
        turn(numbers);
        String arr2="";
        for(int i=0;i<numbers.length;i++)
        {
           arr2+=numbers[i];
        }
    return arr2;

    }
    public static int[] split(int number){
        int[] arr=new int[4];
        arr[0]=number/1000;
        arr[1]=number/100%10;
        arr[2]=number/10%10;
        arr[3]=number%10;
        return arr;


    }
    public static int[] turn(int []numbers)
    {
        for(int i=0,j=numbers.length-1;i<j;i++,j--)
        {
            int temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
    return numbers;
    }








}
