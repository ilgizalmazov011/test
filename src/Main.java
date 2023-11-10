public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task1");
    }

    public static void task2() {
        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog -= 3.5;
        System.out.println(dog);

    }

    public static void task3() {
        var cat = 3.6;
        System.out.println(cat);
        cat = cat = 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

    }

    public static void task4() {
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

    }

    public static void task5(){
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task6(){
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }


    public static void task7(){
        var boxer1weight = 78.2;
        System.out.println(boxer1weight);
        var boxer2weight = 82.7;
        System.out.println(boxer2weight);
        var totalweight = boxer1weight + boxer2weight;
        System.out.println("общий вес двух бойцов" + totalweight);
        var differenceBetweenWeights = boxer1weight - boxer2weight;
        System.out.println("разница между весами бойцов" + differenceBetweenWeights);
        var rasbox = boxer2weight % boxer1weight;
        System.out.println("разница весами между бойцов" + rasbox + "кг");
    }

    public static void task8(){
        var timeALL = 640;
        System.out.println(timeALL);
        var time1 = 8;
        System.out.println(time1);
        var ALLltime = timeALL / time1;
        System.out.println("всего работников"+ ALLltime);
        var ALLtime = 80;
        System.out.println(ALLtime);
        var moretime = 94;
        System.out.println(moretime);
        var timemore = ALLltime + moretime;
        System.out.println("всего работников" + timemore);
        var ALLtime2 = timeALL / timemore;
        System.out.println("всего часов"+ ALLtime2);
    }

}




