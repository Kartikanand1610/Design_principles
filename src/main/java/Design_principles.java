import org.designPrinciple.dependencyInversionProblem.BankCard;
import org.designPrinciple.dependencyInversionProblem.CreditCard;
import org.designPrinciple.dependencyInversionProblem.DebitCard;
import org.designPrinciple.dependencyInversionProblem.ShoppingMall;
import org.designPrinciple.dontRepeatYourself.SwapNumber;
import org.designPrinciple.interfaceSegregationProblem.BasicPrinter;
import org.designPrinciple.interfaceSegregationProblem.Printer;
import org.designPrinciple.keepItSimpleAndStupid.FactorialCalculator;
import org.designPrinciple.liskovSubstitutionPrinciple.Bicycle;
import org.designPrinciple.liskovSubstitutionPrinciple.Car;
import org.designPrinciple.liskovSubstitutionPrinciple.EngineVehicle;
import org.designPrinciple.liskovSubstitutionPrinciple.NonEngineVehicle;
import org.designPrinciple.openClosedPrinciple.Shape;
import org.designPrinciple.openClosedPrinciple.Triangle;
import org.designPrinciple.singleResponsiblity.Baker;

public class Design_principles {
    public static void main(String[] args){
        //single responsiblity principle

        Baker baker=new Baker();
        baker.breakBread();

        //open closed principle

        Shape shape=new Triangle();
        System.out.println(shape.area());

        //liskov substitution principle

        EngineVehicle car=new Car();
        NonEngineVehicle bike=new Bicycle();
        car.startEngine();
        bike.move();

        //interface segregation principle
        Printer basicPrint=new BasicPrinter();
        basicPrint.print();

         //dependency inversion principle
         //DebitCard debitCard=new DebitCard();
         //CreditCard creditCard=new CreditCard();
         BankCard bankCard=new CreditCard();
         ShoppingMall shoppingMall=new ShoppingMall(bankCard);
         shoppingMall.doPurchaseSomething(5000);

         //Don't repeat yourself
         SwapNumber swaap=new SwapNumber();
         int[] number={10,5};
         swaap.swap(number);
         System.out.println("the number after swapping"+" "+number[0]+" ,"+number[1]);

         //Keep it simple and stupid
        FactorialCalculator factorialCalculator=new FactorialCalculator() ;
        int result=factorialCalculator.factorial(5);
        System.out.println("factorial:"+result);

        // You aren't gonna need it
         

         }}
