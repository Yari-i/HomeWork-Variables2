
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int intVar = 1123;
        byte byteVar = 12;
        short shortVar = 32311;
        long longVar = 1_000_000L;
        float floatVar = 1.4F;
        double doubleVar = 6.8;
        System.out.println("Значение переменной intVar с типом int равно " + intVar + ".");
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar + ".");
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar + ".");
        System.out.println("Значение переменной longVar с типом long равно " + longVar + ".");
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar + ".");
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar + ".");

        //Task 2
        System.out.println("Task 2");

        float var1 = 27.12F;
        long var2 = 987_678_965_549L;
        double var3 = 2.786 ;
        int var4 = 569 ;
        int var5 = -159;
        int var6 = 27897;
        byte var7 = 67;

        //Task 3
        System.out.println("Task 3");

        int countOfStudent1 = 23;
        int countOfStudent2 = 27;
        int countOfStudent3 = 30;
        int countOfPaper = 480;

        System.out.println("На каждого ученика рассчитано "+ countOfPaper / (countOfStudent1 + countOfStudent2 + countOfStudent3) + " листов бумаги.");

        //Task 4
        System.out.println("Task 4");

        int performancePerMinutes = 8;
        int countOfBottles1 = performancePerMinutes * 20;
        int countOfBottles2 = performancePerMinutes * 24 * 60;
        int countOfBottles3 = performancePerMinutes * 3 * 24 * 60;
        int countOfBottles4 = performancePerMinutes * 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + countOfBottles1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + countOfBottles2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + countOfBottles3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + countOfBottles4 + " штук бутылок");

        //Task 5
        System.out.println("Task 5");

        int allCountPaint = 120;
        int WhitPerClass = 2;
        int BrownPerClass = 4;
        int countPaintForOneClass = WhitPerClass + BrownPerClass;
        int countClasses = allCountPaint / countPaintForOneClass ;
        int countWhitePaint = countClasses * WhitPerClass;
        int countBrownPaint = countClasses * BrownPerClass;

        System.out.println("В школе, где " + countClasses + " классов, нужно " + countWhitePaint + " банок белой краски и " + countBrownPaint + " банок коричневой краски");

        //Task 6
        System.out.println("Task 6");

        int banana = 5 * 80;
        int milk = 200 * 105;
        int iceCream = 200;
        int egg = 4 * 70;
        int weightGram = banana + milk + iceCream + egg;
        float kg= 1000F;
        float weightKg =  weightGram / kg;

        System.out.println("Вес завтрака в граммх " + weightGram + ". Вес завтрака в килограммах " + weightKg + ".");

        //Task 7
        System.out.println("Task 7");

        int weightToLose = 7 * 1000;
        int losePerDay1 = 250;
        int losePerDay2 = 500;
        int countOfDays1 =  weightToLose / losePerDay1;
        int countOfDays2 =  weightToLose / losePerDay2;

        System.out.println("Кол-во дней для похудения если терять по 250 грамм " + countOfDays1);
        System.out.println("Кол-во дней для похудения если терять по 500 грамм " + countOfDays2);
        System.out.println("Кол-во дней для похудения в среднем " + ((countOfDays1 + countOfDays2) / 2 ));

        // Task 8
        System.out.println("Task 8");

        int SalaryMasha = 67_760;
        int SalaryDenis = 83_690;
        int SalaryKristina = 76_230;

        int increasedSalaryMasha = (int) (SalaryMasha * 1.1);
        int increasedSalaryDenis = (int) (SalaryDenis * 1.1);
        int increasedSalaryKristina = (int) (SalaryKristina * 1.1);

        int additionalMoneyPerYearMash = (increasedSalaryMasha - SalaryMasha) * 12;
        int additionalMoneyPerYearDenis = (increasedSalaryMasha - SalaryMasha) * 12;
        int additionalMoneyPerYearKristina = (increasedSalaryMasha - SalaryMasha) * 12;

        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + additionalMoneyPerYearMash + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + additionalMoneyPerYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + additionalMoneyPerYearKristina + " рублей");




        }
    }
