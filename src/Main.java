import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приступить к расчету длины анкеровки арматуры в бетон? y/n");
        Scanner console = new Scanner(System.in);
        String GoNoGo = console.nextLine() ; //Прием ответа о начале работы
        if (GoNoGo.equals("y"))
            Estimation.estimation();
        if (GoNoGo.equals("n"))
            System.out.println("Bye");
        else
            System.out.println("Buy");
    }
}