import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputFloat();
    }
    public static float inputFloat(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Введите дробное число (типа float): ");
                String input = sc.nextLine();
                System.out.println(Float.parseFloat(input));
                return Float.parseFloat(input);
            } catch (NumberFormatException e){
                System.out.println("Ошибка ввода.");
            }
        }
    }
}
