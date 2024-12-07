package www.hekeda.first;
import java.util.Random;

public class second {
    public static void main(String[] args) {

    System.out.println(creatcode(4));



    }
    public static String creatcode(int num)
    {
        String code="";
        Random r=new Random();
        for(int i=1;i<=num;i++)
        {
         int a=r.nextInt(3);
         switch(a){
             case 0:
                  code+=r.nextInt(10);
                  break;
                  case 1:
                  code+=(char)((r.nextInt(26))+65);
                  break;
             case 2:
                 code+=(char)((r.nextInt(26))+97);
                 break;
         }


        }
    return code;
    }






}
