import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我已经想好了一个1~100的数字，请开始猜测吧！");
        Random random=new Random();//随机类--用于随机产生一个数
        int targetNumber= random.nextInt(100)+1;//生成一个1~100之间的数字，存放在targetNumber中；+1是因为前面的范围是0~99
        int guess;//猜的数字
        int count=0;//统计猜测次数
        while (true){
            System.out.println("请输入你输入的数字");
            guess= input.nextInt();
            count++;//每猜一次，count都加1
            if (guess>targetNumber){
                System.out.println("猜大了");
            }else if (guess<targetNumber){
                    System.out.println("猜小了");
                }else {
                break;
            }

        }
        System.out.println("恭喜你猜对啦！答案是"+targetNumber+"!");
        System.out.println("你一共猜了"+count+"次");
         input.close();
    }
}
