package www.hekeda.first;

public class fifth {
    public static void main(String[] args) {
    int[] arr1={11,22,33};
    int[] arr2=copy(arr1);
    contain1(arr2);

    }
    public static int[] copy(int[] arr1)
    {
     int[] arr2=new int[arr1.length];
     for(int i=0;i<arr2.length;i++)
     {
         arr2[i]=arr1[i];
     }

     return arr2;
    }
    public static void contain1(int[] arr)
    {
        System.out.print("{");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr.length-1==i?arr[i]:arr[i]+",");
        }
        System.out.print("}");

    }

}
