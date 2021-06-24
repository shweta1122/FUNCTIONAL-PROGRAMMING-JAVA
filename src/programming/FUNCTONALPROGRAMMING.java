package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FUNCTONALPROGRAMMING {
    public static void main(String[] args) {

        printAllNumbers(List.of(1, 2, 6, 9, 5, 3, 4, 6, 7, 7, 8, 9));
        System.out.println(String.format("Sum is %s", printSum(List.of(1, 2, 3, 4, 6, 9, 8, 7))));
        printAllwhickContainswordSpringandSorting(List.of("spring0", "Microservices", "bootspring", "spring"));
        System.out.println(createNewListAfterPerformingOperations(List.of(2, 5, 1, 7, 2, 7, 9, 3, 7, 9)));

    }

    private static List createNewListAfterPerformingOperations(List<Integer> integers) {
        return integers.stream().map(x -> x * x).collect(Collectors.toList());
    }

    private static int sum(int aggregate, int nextNumber) {
        return aggregate + nextNumber;
    }

    private static int printSum(List<Integer> integers) {
//        return integers.stream().reduce(0, FUNCTONALPROGRAMMING::sum); or
//        return (integers.stream().reduce(0, (x, y) -> x + y)); or

//        return (integers.stream().reduce(0, (Integer::max)));
        return (integers.stream().reduce(0, (Integer::sum)));
        //reduction operation parallelize very gracefully.
        //used mostly when wan we want to reduce th value of a list and get it in an accumulated form like min max sum etc
    }

    private static void printAllwhickContainswordSpringandSorting(List<String> listOfString) {
        listOfString.stream().filter(x -> x.contains("spring")).filter(x -> x.length() <= 6).forEach(System.out::println);
        listOfString.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::print);//
    }

    private static void printAllNumbers(List<Integer> integers) {
//        traditional approach

//        for (Integer num : integers
//        ) {
//            System.out.println(num);
//        }

        // new approach

        integers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        integers.stream().distinct().sorted().forEach(System.out::println);
        integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //system.out contains a static method println.

        //if you want to create a new list using after performing operation on the list


    }
}
