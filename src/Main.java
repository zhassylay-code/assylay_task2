import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Employee("Alibek", "Sultanbek", "Manager", 250000));
        list.add(new Employee("Akerke", "Bekbergen", "Investor", 1000000 ));
        list.add(new Student("Assylay", "Zhengisbekova", 3.65));
        list.add(new Student("Amina", "Zhilkaidar", 3.8));

        Collections.sort(list);
        printData(list);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}
