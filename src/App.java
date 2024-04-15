import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Stream API is used to process collection of objects.
        // Since Java 8.
        // Perform operations like : Filtering, Mapping, Reducing & Sorting.

        // STREAM CREATION
        // Stream<T> stream;

        // Two types of operations in stream:
        // 1. Intermediate operations - multiple operations are chained in a row -
        // returns a stream
        // Ex. map(), filter(), sorted(),
        // 2. Terminal operations - operations that return the result.
        // Ex. collect(), forEach(), reduce()

        List<Integer> integers = Arrays.asList(2, 1, 3, 4, 5);
        List<Integer> newIntegers = integers.stream().map(elements -> elements * 2).collect(Collectors.toList());
        // newIntegers.stream().forEach(value -> System.out.println(value));
        List<Integer> sortedIntegers = integers.stream().sorted().collect(Collectors.toList());
        sortedIntegers.forEach(i->System.out.println(i));
    }
}
