import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner input=new Scanner(System.in);
        int score= input.nextInt();
        int resul=score;

        if (score<0||score>100){
            System.out.println("输入错误！分数在0到100以内");
        }else {
            if (score >= 60 && score <= 100) {
                resul = score;
                System.out.println("恭喜，成绩及格！" + resul);
            } else {
                resul = score;
                System.out.println("请再接再厉！");
            }
        }
        input.close();

    }
}
