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

        // задача 2
        double boxerOne = 78.2;
        double boxerTwo  = 82.7;

        double totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");

        double leftWeight = boxerTwo - boxerOne;
        System.out.println("Разница между весами бойцов " + leftWeight + " кг.");

        //задача 3
        int bananas = 5;
        int bananasWeight = 80;
        int totalBananas = bananas * bananasWeight;

        int milk = 2;
        int milkWeight = 105;
        int totalMilk = milk * milkWeight;

        int iceCream = 2;
        int iceCreamWeight = 100;
        int totalIceCream = iceCream * iceCreamWeight;

        int eggs = 4;
        int eggsWeight = 70;
        int totalEggs = eggs * eggsWeight;

        double mealsWeight = (totalBananas + totalEggs + totalIceCream + totalMilk) / 1000;
        System.out.println("Общий вес продуктов составялет " + mealsWeight + " кг.");

        //задача 4
        int weight = 7;
        double weightOne = 0.25;
        double weightTwo = 0.5;
        double lostWeightOne = weight / weightOne;
        double lostWeightTwo = weight / weightTwo;
        System.out.println("По схеме 250 г в день,Вы похудеете за " + lostWeightOne + " дней.");
        System.out.println("По схеме 500 г в день,Вы похудеете за " + lostWeightTwo + " дней.");
        double avarageValue = weight / ((weightOne + weightTwo) / 2); //к сожалению не могу найти решение через остаток
        System.out.println("Для похудения Вам потребуется в среднем " + avarageValue + " дней");

        //задача 5
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;

        int MashaYear = Masha * 12;
        int DenisYear = Denis * 12;
        int KristinaYear = Kristina * 12;

        double MashaUp = Masha * 1.1;
        double DenisUp = Denis * 1.1;
        double KristinaUp = Kristina * 1.1;

        double MashaUpYear = MashaUp * 12;
        double DenisUpYear = DenisUp * 12;
        double KristinaUpYear = KristinaUp * 12;

        double MashaDifferense = MashaUpYear - MashaYear;
        double DenisDifferense = DenisUpYear - DenisYear;
        double KristinaDifferense = KristinaUpYear - KristinaYear;
        System.out.println("Маша теперь получает " + MashaUp + " рублей. Годовой доход вырос на " + MashaDifferense + " рублей.");
        System.out.println("Маша теперь получает " + DenisUp + " рублей. Годовой доход вырос на " + DenisDifferense + " рублей.");
        System.out.println("Маша теперь получает " + KristinaUp + " рублей. Годовой доход вырос на " + KristinaDifferense + " рублей.");


    }
}
