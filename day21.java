public class day21 {
    static class Person {
        void work() {
            System.out.println("人です。仕事します。");
        }
    }
    static class Student extends Person {
        void work() {
            System.out.println("学生です。勉強します。");
        }
    }
    static class Teacher extends Person {
        void work() {
            System.out.println("教員です。授業します。");
        }

        void makeTest() {
        }
    }
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Student();
        persons[2] = new Teacher();

        for (int i = 0; i < 3; i++) {
            persons[i].work();
        }
    }
}