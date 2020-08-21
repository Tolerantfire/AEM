import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите опреацию: ");
        System.out.println();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.contains(".") | str.contains(",")) {
            throw new Exception("Нецелое арабское число");
        }
        String[] massive = str.split(" ");
        if (massive[0].matches("^\\d+") && massive[2].matches("^\\d+")) {
                int x = Integer.parseInt(massive[0]);
                int y = Integer.parseInt(massive[2]);
                if (x < 0 | y < 0 | x > 10 | y > 10) {
                    throw new Exception("Неподходящее арабское число");
                }
                else {
                    switch (massive[1]) {
                        case "+":
                            System.out.println(x + y);
                            break;
                        case "-":
                            System.out.println(x - y);
                            break;
                        case "/":
                            int c = x % y;
                            if (c != 0) {
                                double z = x;
                                System.out.println(z / y);
                                break;
                            } else System.out.println(x / y);
                            break;
                        case "*":
                            System.out.println(x * y);
                            break;
                        default: throw new Exception("Невернвый знак операции");
                    }
                }

        }
        else if (massive[0].matches("^\\D+") && massive[2].matches("^\\D+")) {
            IntoRoman rn = new IntoRoman();
            Operation calc = new Operation();
            System.out.println(rn.intoRoman(calc.Calculate(massive[0],massive[2],massive[1])));
        }

        else {
            throw new Exception("Вы ввели римские и арабские цифры");
        }

    }
}





