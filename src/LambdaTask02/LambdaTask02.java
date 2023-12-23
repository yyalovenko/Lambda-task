package LambdaTask02;
import java.util.function.Supplier;

public class LambdaTask02 {
    public static void main(String[] args) {
        printUser();
    }

    public static User getData() {
        return new User("Tom", "555 123-8596");
    }

    public static void printUser() {
        Supplier<User> supplier = LambdaTask02::getData;
        System.out.println("User name is " + supplier.get().getName() +
                ", phone " + supplier.get().getPhone());
    }
}
