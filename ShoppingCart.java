import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("请输入顾客类型（vip顾客输入1，普通顾客输入2）：");
        Scanner input=new Scanner(System.in);
        int type= input.nextInt();
        System.out.println("请输入购物金额：");
        double accout= input.nextDouble();
        System.out.println("支付金额为：");
        double pay= accout;

        if (type==1){
            if(accout>=1000) {
                pay=accout*0.75;
            }else {
                if (accout>=300){
                    pay=accout*0.8;
                }
            }

        }else {
            if (accout>=300){
                pay=accout*0.9;
            }

        }
        System.out.println("购物该支付金额为"+pay);
        input.close();
    }
}
