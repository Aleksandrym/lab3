class Human extends beast implements Greeting, money_owner{
    private Monitory_amount current_balance;

    void say_hello(){
        System.out.println("- Hello, my name is " + name + ", " + age);
    }
    @Override
    public void greet() {
        say_hello();
    }

    @Override
    public Monitory_amount get_balance() {
        return current_balance;
    }

    @Override
    public void withdraw(double amount) {
        current_balance.amount -= amount;
    }

    @Override
    public void replenish(double fs) {

    }

}
