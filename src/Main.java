import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1");
        int firstVariable = 40000;
        System.out.println("Значение переменной firstVariable " +  "с типом int" + " равно " + firstVariable);
        byte secondVariable = 126;
        System.out.println("Значение переменной secondVariable "  + "с типом byte " + "равно " + secondVariable);
        short thirdVariable = 344;
        System.out.println("Значение переменной thirdVariable "  + "с типом short " + "равно " + thirdVariable);
        long forthVariable = 100000000;
        System.out.println("Значение переменной forthVariable " +  "с типом long " + "равно " + forthVariable);
        float fifthVariable = 1.001F;
        System.out.println("Значение переменной fifthVariable " +  "с типом float " + "равно " + fifthVariable);
        double sixthVariable = 1.000000001;
        System.out.println("Значение переменной sixthVariable " +  "с типом double " + "равно " + sixthVariable);

        System.out.println("Task 2");
        float variable1 = 27.12F;
        System.out.println(variable1);
        long variable2 = 98767896549L;
        System.out.println(variable2);
        float variable3 = 2.786F;
        System.out.println(variable3);
        short variable4 = 569;
        System.out.println(variable4);
        short variable5 = -159;
        System.out.println(variable5);
        short variable6 = 27897;
        System.out.println(variable6);
        byte variable7= 67;
        System.out.println(variable7);

        System.out.println("Task 3");
        //byte a = 23;
        //byte b = 27;
        //byte c = 30;
        //short i =(short)(a + b + c);
        //System.out.println(i);
        // можно отдельно обьявить каждый класс как byte и сложить в short,
        // но это наоброт больше памяти будет занимать
        short numStudents = 23+27+30;
        short numPaper = 480;
        short papersForOnePupil = (short) (numPaper/numStudents);
        System.out.println("На каждого ученика рассчитано " + papersForOnePupil + " листов бумаги");

        System.out.println("Task 4");
        byte productivityPerMinute = 16/2;
        byte bottlesAfter20Min = (byte) (20 * productivityPerMinute);
        short timeDay = 24 * 60;
        short bottlesAfter24hours = (short) (timeDay * productivityPerMinute);
        short time3Days = 3 * 24 * 60;
        int bottlesAfter3Days = (int) (time3Days * productivityPerMinute);
        int timeMonth = 30 * 24 * 60;
        int bottlesAfterMonth = timeMonth * productivityPerMinute;
        System.out.println("За 20 минут " + " машина произвела " + bottlesAfter20Min + " штук бутылок");
        System.out.println("За " + timeDay + " минут " + "машина произвела " + bottlesAfter24hours + " штук бутылок");
        System.out.println("За " + time3Days +  " минут " + " машина произвела " + bottlesAfter3Days + " штук бутылок");
        System.out.println("За " + timeMonth +  " минут " + " машина произвела " + bottlesAfterMonth + " штук бутылок");

        System.out.println("Task 5");
        byte annualAmountOfCans = 120;
        byte brown = 4;
        byte white = 2;
        byte cansForOneCassr =(byte) (white + brown);
        byte classValue = (byte) (annualAmountOfCans/cansForOneCassr);
        byte boughtBrown = (byte)(classValue * brown);
        byte boughtWhite = (byte)(classValue*white);
        System.out.println("В школе, где "+ classValue + " классов, нужно " + boughtWhite + " банок белой краски и " + boughtBrown + " банок коричневой краски.");

        System.out.println("Task 6");
        //указаний по переменным нет, тк использую оптимальный
        short banana = 5 * 80;
        short milk = 2 * 105;
        short icecream = 2 * 100;
        short egs = 4 * 70;
        float grams = banana + milk + icecream + egs;
        float kg =(float) (grams / 1000);
        System.out.println("Weight = " + grams + "g or " + kg + "kg");

        System.out.println("Task 7");
        short neededWeight = 7 * 1000;
        short badImpr = 250;
        short goodImpr = 500;
        short middleImpr = (250 + 500) + 2;
        byte daysGoodImpr= (byte) (neededWeight/goodImpr);
        byte daysBadImpr = (byte)(neededWeight/badImpr);
        byte daysMiddleImpr = (byte)(neededWeight/middleImpr);
        System.out.println("дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм- " + daysGoodImpr + ", если каждый день будет худеть на 500 грамм- " + daysBadImpr + ", дней в среднем, чтобы добиться результата похудения- " + daysMiddleImpr);

        System.out.println("Task 8");
        int mariaOldMonthlySalary = 67760;
        int dennisOldMonthlySalary = 83690;
        int kristinaOldMonthlySalary = 76230;
        double mariaNewMonthlySalary = 67760 * 1.1;
        double dennisNewMonthlySalary = 83690 * 1.1;
        double kristinaNewMonthlySalary =76230 * 1.1;
        int mariaOldAnnualSalary = mariaOldMonthlySalary * 12;
        int dennisOldAnnualSalary = dennisOldMonthlySalary * 12;
        int kristinaOldAnnualSalary = kristinaOldMonthlySalary * 12;
        double mariaNewAnnualSalary = mariaNewMonthlySalary * 12;
        double dennisNewAnnualSalary = dennisNewMonthlySalary * 12;
        double kristinaNewAnnualSalary = kristinaNewMonthlySalary * 12;
        double changesMAria = mariaNewAnnualSalary - mariaOldAnnualSalary;
        double changesDennis = dennisNewAnnualSalary - dennisOldAnnualSalary;
        double changesKristina = kristinaNewAnnualSalary - kristinaOldAnnualSalary;
        System.out.println("Маша теперь получает " + mariaNewMonthlySalary + " рублей. Годовой доход вырос на " + changesMAria + " рублей.");
        System.out.println("Денис теперь получает " + dennisNewMonthlySalary + " рублей. Годовой доход вырос на " + changesDennis + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewMonthlySalary + " рублей. Годовой доход вырос на " + changesKristina + " рублей.");
        byte time = 12;
        int workerTimeSpend = 0;
        InputStream in = System.in;
        double workerNewMonthlySalary = 0;
        System.in.read
                ();
        if (workerTimeSpend == 1)
            workerNewMonthlySalary = workerNewMonthlySalary * 1.1;
    System.out.println(workerNewMonthlySalaryfjf);
    }




    }