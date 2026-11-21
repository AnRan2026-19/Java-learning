import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("程序设计基础程序成绩是：");
        int a= input.nextInt();
        System.out.println("数据库基础成绩是：");
        int b= input.nextInt();

        int c;
        c=a-b;
        System.out.println("两科分数差为："+c);

        double d;
        d=(a+b)/2.0;
        System.out.println("两科平均分为：" +d);
        input.close();
    }
}
