public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("Jonh", 13);
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

    }
}