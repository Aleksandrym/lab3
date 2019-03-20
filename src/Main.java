import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name("Honda");
        car.type("Car");
        car.sidet("Sparco");
        Human Lor = new Human();
        Lor.name("Lor");
        Lor.type("Human");
        System.out.println("Встав рано утром, " + Lor.p1 + " сел в прекрасный автомобиль марки " + car.p1 + " Изобретенный Винтиком и Шпутником");
        System.out.println("Это было поистине уникальное изобретение, ведь оно работало на газированой воде и сиропе");
        System.out.println("Марка газированной воды напрямую влияла на поведение автомобиля");
        System.out.println(Arrays.toString(Gaz_water_types.values()));
    }
}
