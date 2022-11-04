public class Main {
    public static void main(String[] args) {

        //Задача 1,2,3
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        var dog2 = dog - 3.5;
        System.out.println(dog2);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight);
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight);

        //Задача 7
        differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight);
        System.out.println("Разница в весе мужду двумя бойцами " + firstBoxer % secondBoxer);

        //Задача 8
        var totalWorkHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkHours % hoursPerDay;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalWorkHours + " часов работают сотрудники");
    }
}