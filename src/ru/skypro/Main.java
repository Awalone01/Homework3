package ru.skypro;

public class Main {

    public static void main(String[] args) {
	   //задача 1
        byte a = 100;
        short b = 1_000;
        int c = 10_000;
        long d = 100_000L;

        float e = 1.015f;
        double f = 15.4844614;

        char g = 33;
        boolean h = true;

        // задача 2
        double boxerOne = 78.2;
        double boxerTwo  = 82.7;

        double totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");

        double weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг.");

        //задача 3
        int bananaNumber = 5;
        int bananaWeight = 80;
        int totalBananaWeight =  bananaNumber * bananaWeight;

        int milkVolumeMl = 200;
        double milkWeightper100Ml = 1.05;
        double totalMilkWeight = milkVolumeMl * milkWeightper100Ml;

        int iceCreamNumber = 2;
        int iceCreamWeight = 100;
        int totalIceCreamWeight = iceCreamNumber * iceCreamWeight;

        int eggsNumber = 4;
        int eggsWeight = 70;
        int totalEggsWeight = eggsNumber * eggsWeight;

        double mealsWeight = (totalBananaWeight + totalEggsWeight + totalIceCreamWeight + totalMilkWeight) / 1_000f;
        System.out.println("Общий вес продуктов составялет " + mealsWeight + " кг.");

        //задача 4
        int weightToLoose = 7;
        double weightPerDayFirst = 0.25;
        double weightPerDaSecond = 0.5;
        double lostWeightOne = weightToLoose / weightPerDayFirst;
        double lostWeightTwo = weightToLoose / weightPerDaSecond;
        System.out.println("По схеме 250 г в день,Вы похудеете за " + lostWeightOne + " дней.");
        System.out.println("По схеме 500 г в день,Вы похудеете за " + lostWeightTwo + " дней.");
        double avarageValue = (lostWeightOne + lostWeightTwo) / 2;
        System.out.println("Для похудения Вам потребуется в среднем " + avarageValue + " дней");

        //задача 5
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int kristinaSalaryYear = kristinaSalary * 12;

        double mashaIncreasedSalary = mashaSalary * 1.1;
        double denisIncreasedSalary = denisSalary * 1.1;
        double kristinaIncreasedSalary = kristinaSalary * 1.1;

        double mashaIncreasedYear = mashaIncreasedSalary * 12;
        double denisIncreasedYear = denisIncreasedSalary * 12;
        double kristinaIncreasedYear = kristinaIncreasedSalary * 12;

        double mashaSalaryDifference = mashaIncreasedYear - mashaSalaryYear;
        double denisSalaryDifference = denisIncreasedYear - denisSalaryYear;
        double kristinaSalaryDifference = kristinaIncreasedYear - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaIncreasedSalary + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Маша теперь получает " + denisIncreasedSalary + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей.");
        System.out.println("Маша теперь получает " + kristinaIncreasedSalary + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей.");


    }
}
