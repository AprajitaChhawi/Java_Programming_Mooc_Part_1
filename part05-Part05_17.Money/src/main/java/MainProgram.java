
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(-5, 0);
        // test your class here
        Money firstMoneyObject = new Money(1, 0);
        Money secondMoneyObject = new Money(2, 0);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        System.out.println(firstMinusSecond.euros());
    }
}
