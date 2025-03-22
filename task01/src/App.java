import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static BigInteger checkNum(String num) {
        if (num.length() > 1000) {
            throw new IllegalArgumentException("[Ошибка]: одно из чисел превышает 1000 символов.");
        }
        try { return new BigInteger(num); }
        catch (Exception e) {
            throw new IllegalArgumentException("[Ошибка]: Невозможно преобразовать введенное значение в BigInteger.");
        }
    }

    public static String checkSign(String sign) {
        if (!sign.equals("-") && !sign.equals("+"))
        {
            throw new IllegalArgumentException("[Ошибка]: Введен неизвестный оператор. Доступные операторы: '+' или '-'.");
        }
        return sign;
    }

    public static BigInteger calc(BigInteger a, String sign, BigInteger b) {
        if (sign.equals("+")) {
            return a.add(b);
        } else {
            return a.subtract(b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = App.checkNum(scanner.nextLine());
        String sign = App.checkSign(scanner.nextLine());
        BigInteger b = App.checkNum(scanner.nextLine());

        BigInteger result = App.calc(a, sign, b);

        System.out.println(result);
        scanner.close();
    }
}
