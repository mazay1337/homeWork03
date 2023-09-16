public class Main {
    public static void main(String[] args) {

        byte small = 11;
        short medium = 22022;
        int average = 303303;
        long big = 444000444000444L;
        float smallFraction = 5.5f;
        double largeFraction = 6.6666666;
        System.out.println("Значение переменной small с типом byte равно " + small);
        System.out.println("Значение переменной medium с типом short равно " + medium);
        System.out.println("Значение переменной average с типом int равно " + average);
        System.out.println("Значение переменной big с типом long равно " + big);
        System.out.println("Значение переменной smallFraction с типом float равно " + smallFraction);
        System.out.println("Значение переменной largeFraction с типом double равно " + largeFraction);

        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
        System.out.println("Я инициализировала следующие переменные: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + num7 + ".");

        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short paper = 480;
        int paperPortion = paper / ( classLP + classAS + classEA );
        System.out.println("На каждого ученика рассчитано " + paperPortion + " листов бумаги");

        byte bottlesMinute = 16 / 2;
        int minutes20 = bottlesMinute * 20;
        int day = bottlesMinute * 60 * 24;
        int days3 = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + days3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        byte totalCansPaint = 120;
        byte cansWhiteOneClass = 2;
        byte cansBrownOneClass = 4;
        int cansPaintOneClass = cansBrownOneClass + cansWhiteOneClass;
        int totalClasses = totalCansPaint / cansPaintOneClass;
        int cansWhite = totalClasses / cansWhiteOneClass;
        int cansBrown = totalClasses / cansBrownOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + cansWhite + " банок белой краски и " + cansBrown + " банок коричневой краски");

        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCream = 100;
        byte egg = 70;
        int breakfastGrams = (bananaWeight * 5) + (milkWeight * 2) + (iceCream * 2) + (egg * 4);
        float breakfastKilograms = breakfastGrams / 1000f;
        System.out.println("Вес одного спортивного завтрака составляет " + breakfastGrams + " грамм, или " + breakfastKilograms + "кг.");

        short targetWeight = 7000;
        short fastWeightLoss = 500;
        short slowWeightLoss = 250;
        int result1 = targetWeight / fastWeightLoss;
        int result2 = targetWeight / slowWeightLoss;
        int averageResult = (result1 + result2) / 2;
        System.out.println("Если спротсмену ежедневно скидывать по 250 грамм, то 7 кг он скинет за " + result2 + " дней.");
        System.out.println("Если же он будет терять в день по полкило, то результата он достигнет за " + result1 + " дней.");
        System.out.println("Что бы скинуть 7 кг веса, спортсмену в среднем понадобится " + averageResult + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int revenue = (salaryKristina + salaryDenis + salaryMasha) * 12;
        float newSalaryMasha = salaryMasha + salaryMasha * 0.1f;
        float newSalaryDenis = salaryDenis + salaryDenis * 0.1f;
        float newSalaryKristina = salaryKristina + salaryKristina * 0.1f;
        float newRevenue = (newSalaryKristina + newSalaryDenis + newSalaryMasha) * 12;
        float differenceRevenue = newRevenue % revenue;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей");
        System.out.println("Годовой доход вырос на " + differenceRevenue + " рублей");

    }
}