package HelloApp.src;

public class Classes {
    public static void main(String[] args) {

        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();

//        tom.name = "Tom";
//        tom.age = 34;
//        tom.displayInfo();
    }
    static class Person{
        String name;
        int age;
        {
            name = "Udfedined";
            age = 18;
        }

        Person(){
        }
        Person(String name){
            this.name = name;
        }
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        void displayInfo(){
            System.out.printf("Name: %s \tAge: %d\n", name, age);
        }
    }
}
