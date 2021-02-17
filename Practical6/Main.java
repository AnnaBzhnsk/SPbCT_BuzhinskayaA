public class Main {
       public static void main(String[] args) {
        Person tom = new Person(); // создание объекта
        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();

        Person bob = new Person();      // вызов первого конструктора без параметров
           bob.displayInfo();
        Person anna = new Person("Anna"); // вызов второго конструктора с одним параметром
           anna.displayInfo();
        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
           sam.displayInfo();
    }
}
    class Person {
        String name;    // имя
        int age;        // возраст
        Person()
        {
            name = "Undefined";
            age = 18;
        }
        Person(String n)
        {
            name = n;
            age = 18;
        }
        Person(String n, int a)
        {
            name = n;
            age = a;
        }
        void displayInfo(){

            System.out.format("Name: %s\t Age: %d\n", name, age);
        }
}
