package Duck.l02;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

    }

    void simulate(){
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable mallardDuck1 = new QuackEcho(new QuackCounter(new MallardDuck()));

        System.out.println("\nDuck Simulator: With Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(mallardDuck1);

        System.out.println("The duck quacks " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
