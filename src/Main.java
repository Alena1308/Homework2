public class Main {
    public static void main(String[] args) {
        //задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 2
        dog = dog + 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
//задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
//задание 6
        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;
        var totalWeightTwoFighters = weightFirstFighter + weightSecondFighter;
        System.out.println("Общий вес двух бойцов " + totalWeightTwoFighters + " кг");
        var differenceWeightTwoFighters = weightFirstFighter - weightSecondFighter;
        System.out.println("Разница в весе двух бойцов " + differenceWeightTwoFighters + " кг");
//задание 7
        var differenceWeightTwoFighters2 = weightSecondFighter % weightFirstFighter;
        System.out.println("Разница в весе двух бойцов " + differenceWeightTwoFighters2 + " кг");
        var differenceWeightTwoFighters3 = weightSecondFighter - weightFirstFighter;
        System.out.println("Разница в весе двух бойцов " + differenceWeightTwoFighters3 + " кг");
        //есть вариант с выведением модуля, но он не решит проблему выбора большего значения с помощью кода
//задание 8
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var totalStaff = totalHours / oneEmployeeHours;
        System.out.println("Всего работников в компании – " + totalStaff + " человек");
        var totalStaff2 = totalStaff + 94;
        var totalHours2 = totalStaff2 * 8;
        System.out.println("Если в компании работает " + totalStaff2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");

//ПЕРЕМЕННЫЕ ЧАСТЬ 2
// задача 1
        System.out.println("ПЕРЕМЕННЫЕ ЧАСТЬ2");
        System.out.println("Задача 1");
        int num1 = 123456789;
        byte num2 = 127;
        short num3 = 12345;
        long num4 = 12345678L;
        float num5 = 3.12345f;
        double num6 = 8.1234567;
        System.out.println("Значение переменной num1 с типом int равно " + num1);
        System.out.println("Значение переменной num2 с типом byte равно " + num2);
        System.out.println("Значение переменной num3 с типом short равно " + num3);
        System.out.println("Значение переменной num4 с типом long равно " + num4);
        System.out.println("Значение переменной num5 с типом float равно " + num5);
        System.out.println("Значение переменной num6 с типом double равно " + num6);
//задача 2
        System.out.println("Задача 2");
        double numb1 = 27.12;
        long numb2 = 987678965549L;
        float numb3 = 2.786f;
        boolean numb4 = false;
        short numb5 = 569;
        short numb6 = -159;
        int numb7 = 27897;
        byte numb8 = 67;
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);
        System.out.println(numb4);
        System.out.println(numb5);
        System.out.println(numb6);
        System.out.println(numb7);
        System.out.println(numb8);
//задача 3
        System.out.println("Задача 3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int allPapers = 480;
        int allStudents = studentsLP + studentsAS + studentsEA;
        int papersOnOneStudent = allPapers / allStudents;
        System.out.println("На каждого ученика рассчитано " + papersOnOneStudent + " листов бумаги");
//задача 4
        System.out.println("Задача 4");
        byte performanceIn2Min = 16;
        byte time = 2;
        int performance = performanceIn2Min / time;
        byte time1 = 20;
        int performance1 = performance * time1;
        System.out.println("За " + time1 + " минут, машина произвела бутылок " + performance1 + " штук");
        byte time2 = 24; //за сутки - 24 часа
        int time2InMin = time2 * 60; //перевожу в минуты
        int performance2 = performance * time2InMin;
        System.out.println("За сутки, машина произвела бутылок " + performance2 + " штук");
        int time3 = time2InMin * 3;
        int performance3 = performance * time3; //можно проще: "int performance3 = performance2 * 3"
        System.out.println("За 3 суток, машина произвела бутылок " + performance3 + " штук");
        int time4 = time3 * 10; //если в месяце 30 дней (а не 31 или 28\29)
        int performance4 = performance * time4;
        System.out.println("За месяц, машина произвела бутылок " + performance4 + " штук");
//задача 5
        System.out.println("Задача 5");
        byte allCans = 120;
        byte whitePaint1class = 2;
        byte brownPaint1class = 4;
        int allCansFor1Class = whitePaint1class + brownPaint1class;
        int allClasses = allCans / allCansFor1Class;
        int allWhiteCans = whitePaint1class * allClasses;
        int allBrownCans = brownPaint1class * allClasses;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans +" банок коричневой краски");
//задача 6
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfastWeight = bananas + milk + iceCream + eggs;
        float kgWeight = breakfastWeight / 1000f;
        System.out.println("Вес завтрака равен " + kgWeight + " кг");
//задача 7
        System.out.println("Задача 7");
        int needToLooseKg = 7;
        int needToLooseGr = needToLooseKg * 1000; //Перевожу в граммы
        int oneDayLooseGr1 = 250;
        int numberOfDays1 = needToLooseGr / oneDayLooseGr1;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то похудеет на 7кг через " + numberOfDays1 + " дней");
        int oneDayLooseGr2 = 500;
        int numberOfDays2 = needToLooseGr / oneDayLooseGr2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то похудеет на 7кг через " + numberOfDays2 + " дней");
        int averageNumberOfDays = (numberOfDays1 + numberOfDays2) / 2;
        System.out.println("Среднее количество дней похудания: " + averageNumberOfDays);
//задача 8
        System.out.println("Задача 8");
        byte salaryIncrease = 10;
        float salaryIncreaseCoefficient = salaryIncrease / 100f;
        int mashaSalary1 = 67760;
        int mashaSalaryYear1 = mashaSalary1 * 12;
        float mashaSalary2 = mashaSalary1 * salaryIncreaseCoefficient + mashaSalary1;
        float mashaSalaryYear2 = mashaSalary2 * 12;
        float mashaSalaryDifference = mashaSalaryYear2 - mashaSalaryYear1;
        System.out.println("Маша теперь получает " + (int) mashaSalary2 + " рублей. Годовой доход вырос на " + (int) mashaSalaryDifference + " рублей");

        int denisSalary1 = 83690;
        int denisSalaryYear1 = denisSalary1 * 12;
        float denisSalary2 = denisSalary1 * salaryIncreaseCoefficient + denisSalary1;
        float denisSalaryYear2 = denisSalary2 * 12;
        float denisSalaryDifference = denisSalaryYear2 - denisSalaryYear1;
        System.out.println("Денис теперь получает " + (int) denisSalary2 + " рублей. Годовой доход вырос на " + (int) denisSalaryDifference + " рублей");

        int kristinaSalary1 = 76230;
        int kristinaSalaryYear1 = kristinaSalary1 * 12;
        float kristinaSalary2 = kristinaSalary1 * salaryIncreaseCoefficient + kristinaSalary1;
        float kristinaSalaryYear2 = kristinaSalary2 * 12;
        float kristinaSalaryDifference = kristinaSalaryYear2 - kristinaSalaryYear1;
        System.out.println("Кристина теперь получает " + (int) kristinaSalary2 + " рублей. Годовой доход вырос на " + (int) kristinaSalaryDifference + " рублей");



    }
}