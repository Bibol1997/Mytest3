package kz.kaz;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class a{
    public static Scanner input = new Scanner(System.in);
    public static int Answer;
    public static int Random1, Random2, Random3;
    public static int sum;
    public static int win, loss;
    public static int Score, TotalScore;
    public static long AnswerTime;
    public static double TotalTime;
    public static void main(String[] args) {
        AddGame();
    }
    public static void AddGame() {
        RandomEasy();
        long startTime = System.currentTimeMillis();
        while (true) {
            String line = input.nextLine();

            try {
                Answer = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Пожалуйста, введите номер : ");
            }
        }
        long stopTime = System.currentTimeMillis();
        AnswerTime = (stopTime - startTime) / 1000;
        TotalTime += AnswerTime;
        if ((win + loss) != 30) {
            if (Answer == sum) {
                win++;
                System.out.println("Верный!");
                AddGame();
            } else if (Answer != sum) {
                loss++;
                System.out.println("Неправильно!");
                AddGame();
            }
        } else if ((win + loss) == 30){
            double Percentage = win/30.0;
            System.out.println();
            System.out.println("ваш счет : " + win + "/30(" + Percentage *100 + "%)");
            System.out.println("Ваши средние секунды / ответ : " + TotalTime/30 +  " seconds");
            System.out.println();
            System.out.print("Вы хотите повторить попытку? (Y or N) : ");
            while (true) {
                String retry = input.nextLine();
                if (("y".equals(retry)) || ("Y".equals(retry))) {
                    win = 0;
                    loss = 0;
                    AddGame();
                } else if (("n".equals(retry)) || ("N".equals(retry))) {
                    System.out.println("Спасибо за игру!");
                    System.exit(1);
                } else if (!("y".equals(retry)) || !("Y".equals(retry) || ("n".equals(retry)) || !("N".equals(retry)))) {
                    System.out.print("Неправильный ввод. Вы хотите повторить попытку?(Y or N) : ");

                }
            }
        }
    }
    public static void RandomEasy(){
        Random1 = (int) (Math.random() * 10 * 5);
        Random2 = (int) (Math.random() * 20 * 5);
        sum = Random1 + Random2;
        System.out.print("Вопрос " + Random1 + " + " + Random2 + "? : ");

    }
    public static void RandomMed(){
        Random1 = ThreadLocalRandom.current().nextInt(15, 30 + 1);
        Random2 = ThreadLocalRandom.current().nextInt(15, 30 + 1);
        sum = Random1 + Random2;
        System.out.print("Вопрос" + Random1 + " *" + Random2 + "? : ");
    }
    public static void RandomHard(){
        Random1 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        Random2 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        Random3 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        sum = Random1 + Random2 + Random3;
        System.out.print("Вопрос " + Random1 + " - " + Random2 + " + " + Random3 + "? : ");
    }

}