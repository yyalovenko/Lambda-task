import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTask01 {

    public static void main(String[] args) {
        LambdaTask01 task01 = new LambdaTask01();
        List<String> list = task01.getData();
        task01.printData(list);
    }

    public List<String> getData() {
        String[] names = new String[]{"Tom","Alice","Bob","Lucy"};
        return Arrays.asList(names);
    }

    public void printData(List<String> list) {
        Consumer<String> consumer = name -> System.out.println("Name is " + name);
        for(String name: list) {
            consumer.accept(name);
        }
    }

}
