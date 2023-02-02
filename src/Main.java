public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperatureNow = 5;
        if (temperatureNow < 5) {
            System.out.println("На улице " + temperatureNow + " градуса, нужно надеть шапку");
        } else {
            System.out.println("Можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 25;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 12;
        if (age1 >= 2 && age1 < 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 > 7 && age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageA = 16;
        if (ageA < 5) {
            System.out.println("Если возраст ребенка равен " + ageA + ", то ему нельзя кататься на аттракционе");
        } else if (ageA > 5 && ageA < 14) {
            System.out.println("Если возраст ребенка равен " + ageA + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageA > 14) {
            System.out.println("Если возраст ребенка равен " + ageA + ", то он может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int manInTheWagonNow = 101;
        int capacityOfOneWagon = 102;
        int seatPlace = 60;
        int standingPlace = capacityOfOneWagon - seatPlace;
        if (manInTheWagonNow < standingPlace) {
            System.out.println("Остались сидячие и стоячие места");
        } else if (manInTheWagonNow >= seatPlace && manInTheWagonNow < capacityOfOneWagon) {
            System.out.println("Не осталось сидячих мест, только стоячие");
        } else if (manInTheWagonNow >= capacityOfOneWagon) {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1255;
        int two = 215;
        int three = 198;
        if (one >= two) {
            if (one > three) {
                System.out.println("Большее чисто " + one);
            } else if (three > one) {
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равны");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Большее число " + two);
            } else if (three > two) {
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Числа " + two + " и " + three + " равны");
            }
        } else {
            if (one > three) {
                System.out.println("Большее чисто " + one);
            } else if (three > one) {
                System.out.println("Большее число " + three);
            } else {
                System.out.println("Все числа равны");}
        }
    }
}

