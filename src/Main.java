public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte a = 11;
        short b = 15000;
        int c = 900400;
        long d = 12400600;
        float ab = 3.85f;
        double cd = 150.71f;
        System.out.println(" Значение переменной с типом byte равно " + a);
        System.out.println(" Значение переменной с типом short равно " + b);
        System.out.println(" Значение переменной с типом int равно " + c);
        System.out.println(" Значение переменной с типом long равно " + d);
        System.out.println(" Значение переменной с типом float равно " + ab);
        System.out.println(" Значение переменной с типом double равно " + cd);

        float z = 27.12f;
        long x = 987678965549L;
        float v = 2.786f;
        short n = 569;
        short m = -159;
        short s = 27897;
        byte f = 67;

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalSheets = 480;
        int totalStudent = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int listStudent = totalSheets / totalStudent;
        System.out.println(" На каждого ученика расчитано " + listStudent + " листов бумаги ");

        int p = 16;
        int t = 2;
        int p1 = p / t;
        int t1 = 20;
        int t2 = 60 * 24;
        int t3 = 60 * 24 * 3;
        int t4 = 60 * 24 * 31;
        int p2 = p1 * t1;
        int p3 = t2 * p1;
        int p4 = t3 * p1;
        int p5 = t4 * p1;
        System.out.println(" За 20 минут машина произвела " + p2 + " штук бутылок");
        System.out.println(" За сутки машина произвела " + p3 + " штук бутылок");
        System.out.println(" За 3 дня машина произвела " + p4 + " штук бутылок");
        System.out.println(" За 1 месяц машина произвела " + p5 + " штук бутылок");

int totalCans = 120;
int white = 2;
int brown = 4;
int summClass = white + brown;
int totalClass = totalCans / summClass;
int sumWhite = white * totalClass;
int sumBrown = brown * totalClass;
System.out.println(" В школе где " + totalClass + " классов нужно " + sumWhite + " банок белой краски и " + sumBrown + " банок коричневой краски ");

int bananas = 80 * 5;
int milk = 105 * 2;
int iceCream = 100 * 2;
int egs = 70 * 4;
int sum = bananas + milk + iceCream + egs;
System.out.println(" Вес такого завтрака составляет " + sum + " грамм ");
float sumKg = sum / 1000f;
        System.out.println(" Вес такого завтрака составляет " + sumKg + " киллограмм ");

        int target = 7;
        float loss1 = 250 / 1000f;
        float loss2 = 500 / 1000f;
        float time1 = target / loss1;
        float time2 = target / loss2;
        System.out.println(" Если терять по " + loss1 + " кг в день, то на достижение результата уйдет " + time1 + " дней " );
        System.out.println(" Если терять по " + loss2 + " кг в день, то на достижение результата уйдет " + time2 + " дней " );

        int masha1 = 67760;
        int den1 = 83690;
        int kris1 = 76230;
        double masha2 = masha1 * 0.1 + masha1;
        double den2 = den1 * 0.1 + den1;
        double kris2 = kris1 * 0.1 + kris1;
        double masha1Year = masha1 * 12;
        double den1Year = den1 * 12;
        double kris1Year = kris1 * 12;
        double masha2Year = masha2 * 12;
        double den2Year = den2 * 12;
        double kris2Year = kris2 * 12;
        double profitMasha = masha2Year - masha1Year;
        double profitDen = den2Year - den1Year;
        double profitKris = kris2Year - kris1Year;
        System.out.println(" Маша теперь получает " + masha2 + " рублей в месяц. Годовой доход вырос на " + profitMasha + " рублей " );
        System.out.println(" Денис теперь получает " + den2 + " рублей в месяц. Годовой доход вырос на " + profitDen + " рублей " );
        System.out.println(" Кристина теперь получает " + kris2 + " рублей в месяц. Годовой доход вырос на " + profitKris + " рублей " );


    }
}