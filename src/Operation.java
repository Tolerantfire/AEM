public class Operation {

    private static int result = 0;

    public static int Calculate (String massive0, String massive2, String massive1) throws Exception {
       IntoArabic rtd = new IntoArabic();
        int x = rtd.intoArabic(massive0);
        int y = rtd.intoArabic(massive2);
        if (x < 0 | y < 0 | x > 10 | y > 10) {
         throw new Exception("Неверное римское число");
        }
        else{
        switch (massive1) {
            case "+":
                result = x + y;
                break;

            case "-":
                result = x - y;
                break;

            case "/":
                int c = x % y;
                if (c != 0){
                    throw new Exception("Не бывает дробных римских чисел");
                }
                else{
                result = x / y;
                break;}

            case "*":
                result = x * y;
                break;
            default: throw new Exception("Неверная операция");
        }
        return result;
    }
    };

}


