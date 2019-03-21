class Dog extends beast implements Greeting{
    void say_sound(){
        System.out.println("- Gav");
    }
    @Override
    public void greet() {
        say_sound();
    }
}
