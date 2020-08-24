public class IntoArabic {

        static int strLength = 0;
        static int up = 0;
        static int down = 0;

        public static int intoArabic(String romanNumber) throws Exception {
            strLength = romanNumber.length();
            int answer = 0;
            int previouseFigure = 0;
            int mcounter = 0, dcounter = 0, ccounter = 0, lcounter = 0, xcounter = 0, vcounter = 0, icounter = 0;
            for (int i = romanNumber.length() - 1; i >= 0; i--) {
                char ConvertToDec = romanNumber.charAt(i);

                switch (ConvertToDec) {
                    case 'M':
                        answer = processNumeral(1000, previouseFigure, answer);
                        previouseFigure = 1000;
                        mcounter++;
                        dcounter = 0; ccounter = 0; lcounter = 0; xcounter = 0; vcounter = 0; icounter = 0;
                        if (mcounter > 3) throw new Exception("Неверное римское число");
                        break;

                    case 'D':
                        answer = processNumeral(500, previouseFigure, answer);
                        previouseFigure = 500;
                        dcounter++;
                        mcounter = 0; ccounter = 0; lcounter = 0; xcounter = 0; vcounter = 0; icounter = 0;
                        if (dcounter > 3) throw new Exception("Неверное римское число");
                        break;

                    case 'C':
                        answer = processNumeral(100, previouseFigure, answer);
                        previouseFigure = 100;
                        ccounter++;
                        dcounter = 0; mcounter = 0; lcounter = 0; xcounter = 0; vcounter = 0; icounter = 0;
                        if (ccounter > 3) throw new Exception ("Неверное римское число");
                        break;

                    case 'L':
                        answer = processNumeral(50, previouseFigure, answer);
                        previouseFigure = 50;
                        lcounter++;
                        dcounter = 0; ccounter = 0; mcounter = 0; xcounter = 0; vcounter = 0; icounter = 0;
                        if (lcounter > 3) throw new Exception("Неверное римское число");
                        break;

                    case 'X':
                        answer = processNumeral(10, previouseFigure, answer);
                        previouseFigure = 10;
                        xcounter++;
                        dcounter = 0; ccounter = 0; lcounter = 0; mcounter = 0; vcounter = 0; icounter = 0;
                        if (xcounter > 3) throw new Exception("Неверное римское число");
                        break;

                    case 'V':
                        answer = processNumeral(5, previouseFigure, answer);
                        previouseFigure = 5;
                        vcounter++;
                        dcounter = 0; ccounter = 0; lcounter = 0; xcounter = 0; mcounter = 0; icounter = 0;
                        if (vcounter > 1) throw new Exception("Неверное римское число");
                        break;

                    case 'I':
                        answer = processNumeral(1, previouseFigure, answer);
                        previouseFigure = 1;
                        icounter++;
                        dcounter = 0; ccounter = 0; lcounter = 0; xcounter = 0; vcounter = 0; mcounter = 0;
                        if ( icounter > 3 ) throw new Exception("Неверное римское число");
                        break;
                    default: throw new Exception("Неверное римское число");
                }
            }
            return answer;
        }

        public static int processNumeral(int meaning, int lastNumber, int previouseMeaning) throws Exception {
            if (down > up) throw new Exception ("Неверное римское число");

            if (lastNumber > meaning) {
                down++;
                return previouseMeaning - meaning;
            } else {
                up++;
                return previouseMeaning + meaning;


            }
        }

    }


