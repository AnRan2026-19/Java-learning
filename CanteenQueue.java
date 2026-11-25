import java.util.Scanner;

public class CanteenQueue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int people=3;//有3人排队
        //当还有人排队时
        while (people>0){
            System.out.println("当前排队人数："+people);
            System.out.println("请第"+(4-people)+"位同学取餐");
            people--;//取餐后人数-1即people自减1
            System.out.println("取餐完成了吗(1-完成)：");
            input.nextInt();//读取是否输入了1
        }
        System.out.println("当前无人排队");
        input.close();

    }
}
