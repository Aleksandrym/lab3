public class Car extends whats_moves {
    String p1;
    @Override
    void name(String name) {
        p1 = name;
    }

    @Override
    void type(String type) {
        if (type != "Car"){
            System.out.println("Выберите правильный тип");
        }
    }
}
