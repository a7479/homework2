public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 4");
        var friend=19;// Пишем код для задачи
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

    }

    public static void task3() {
        System.out.println("Задача 6");
     var firstWeight=78.2;
     var secondWeight=82.7;
     var fullWeight=firstWeight+secondWeight;
     var diffWeight=firstWeight-secondWeight;
        System.out.println("Общий вес боксеров: "+ fullWeight+ " кг");
        System.out.println("Разница в весе между боксерами: "+ diffWeight+ " кг");
        System.out.println("Задача 7");
        var differWeight=secondWeight-firstWeight;
        var differentWeight=secondWeight%firstWeight;
        System.out.println("Разница в весе между боксерами: "+ differWeight+ " кг");
        System.out.println("Разница в весе между боксерами: "+ differentWeight+ " кг");
        System.out.println("Задача 8");
        var fullTime=640;
        var onePers=8;
        var pers=fullTime/onePers;
        System.out.println("Всего работников в компании- "+ pers+ " человек");
        var people=pers+94;
        var time=people*onePers;
        System.out.println("Если в компании работает "+people+ " человек, то всего " + time+ " часов работы может быть поделено между сотрудниками");



    }
}


