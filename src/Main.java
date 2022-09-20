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
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//задание 6
        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;
        var totalWeightTwoFighters = weightFirstFighter + weightSecondFighter;
        System.out.println("Общий вес двух бойцов " + totalWeightTwoFighters + " кг");
        var differenceWeightTwoFighters = weightSecondFighter % weightFirstFighter;
        System.out.println("Разница в весе двух бойцов " + differenceWeightTwoFighters + " кг");
//задание 7
        var differenceWeightTwoFighters2 = weightSecondFighter - weightFirstFighter;
        System.out.println("Разница в весе двух бойцов " + differenceWeightTwoFighters2 + " кг");
//задание 8
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var totalStaff = totalHours / oneEmployeeHours;
        System.out.println("Всего работников в компании – " + totalStaff + " человек");
        var totalStaff2 = totalStaff + 94;
        var totalHours2 = totalStaff2 * 8;
        System.out.println("Если в компании работает " + totalStaff2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");



    }
}