import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        System.out.println("请输入三个数字");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x=input.nextInt();
        System.out.println("请输入第二个数");
        int y= input.nextInt();
        System.out.println("请输入第三个数");
        int z= input.nextInt();

        int max,mid,min;
        if (x>=y){
            max=x;
            if(y>=z){
                mid=y;min=z;
            }else {
                if (x>=z){
                    mid=z;min=y;
                }else {
                    max=z;mid=x;min=y;
                }
            }
        }else {
            max=y;
            if (x>=z){
                mid=x;min=z;
            }else {
                if (y>=z){
                    mid=z;min=x;
                }else {
                    max=z;mid=y;min=x;
                }
            }
        }
        System.out.println("最大："+max+"中等："+mid+"最小："+min);
        input.close();
    }
}
