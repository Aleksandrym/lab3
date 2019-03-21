public class Main {
    public static void main(String[] args) {
        Human neznaika= new Human();
        neznaika.name = "Dadya Vania";
        neznaika.age = 25;
        neznaika.say_hello();
        Dog dog = new Dog();
        dog.name = "Wulf";
        dog.say_sound();
        Human gospoga_minoga = new Human();
        Human worker = new Human();
        gospoga_minoga.replenish(70);
        neznaika.withdraw(1);
        if (neznaika.get_balance().amount <= 0){
        }
    }
}
