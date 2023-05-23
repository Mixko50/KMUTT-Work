package lamda_1;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> strArr = new ArrayList<>();

        strArr.add("afcfvc");
        strArr.add("bd");
        strArr.add("ccc");
        strArr.add("fefg");
        strArr.add("ebthnyjm");

        strArr.sort(String::compareTo);

        System.out.println(strArr);

        System.out.println("----- Apple -----");
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("GREEN", 120));
        apples.add(new Apple("GREEN", 180));
        apples.add(new Apple("RED", 190));
        apples.add(new Apple("RED", 140));
        apples.add(new Apple("GREEN", 130));

        System.out.println(Apple.filterApples(apples, Apple::isHeavyApple));
        System.out.println(Apple.filterApples(apples, (Apple a) -> "GREEN".equals(a.getColor())));
        System.out.println(Apple.filterApples(apples, (Apple a) -> a.getWeight() > 150));
        System.out.println(Apple.filterApples(apples, (Apple a) -> a.getWeight() > 150 || "GREEN".equals(a.getColor())));
        System.out.println(Apple.filterApples(apples, new AppleHeavyWeightPredicate()));

        System.out.println(
                apples.stream()
                        .filter((a) -> a.getWeight() > 150)
                        .map(Apple::getColor)
                        .collect(Collectors.toList())
        );

        System.out.println("----- Apple Predicate -----");
        List<Apple> redAndHeavyApple = Apple.filterApples(apples, new AppleRedAndHeavyPredicate());

        System.out.println(redAndHeavyApple);

        System.out.println("----- Anonymous class -----");
        List<Apple> redApples = Apple.filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "RED".equals(apple.getColor());
            }
        });

        System.out.println(redApples.stream()
                .map(Apple::getColor)
                .collect(Collectors.toList())
        );

        System.out.println("----- Lamda calculus -----");
        Comparator<Apple> byWeight = Comparator.comparing(Apple::getWeight);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("1213");
                System.out.println("sdfsd");
            }
        };

        System.out.println("----- Runnable -----");
        r1.run();

        System.out.println("----- Consumer -----");
        forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));

        System.out.println("----- Function -----");
        List<Integer> l = map(Arrays.asList("lamdas", "in", "action"), (String s) -> s.length());
        System.out.println(l);

        System.out.println("----- Int Predicate -----");
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        System.out.println("----- Predicate Integer Object -----");
        Predicate<Integer> oddNumber = (Integer i) -> i % 2 != 0;
        System.out.println(oddNumber.test(1001));

        System.out.println("----- Supplier -----");
        Supplier<String> str = () -> "Hello";
        System.out.println(str.get());

        System.out.println("----- Supplier Apple -----");
        Supplier<Apple> apple = () -> new Apple("GREEN", 10);
        System.out.println(apple.get().getColor());

        System.out.println("----- Method ref -----");
        Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight();
        apples.sort(Comparator.comparing(Apple::getWeight));
        Iterator<Apple> it = apples.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getWeight());
        }

        System.out.println("----- Types of Method ref -----");
        lamda_1.Supplier<Apple> c1 = () -> new Apple("RED", 130);
        Apple a1 = c1.get();

        Function<Integer, Apple> c2 = (weight) -> new Apple("GREEN", weight);
        Apple a2 = c2.apply(120);

        apples.sort(Comparator.comparing(Apple::getWeight));


        Runnable run1 = () -> System.out.println("f");
        run1.run();

        System.out.println("----- PoC Stream -----");
        IntStream stream = IntStream.range(1, 5);
        stream = stream
                .peek(i -> log("starting", i))
                .filter(i -> { log("filtering", i);
                    return i % 2 == 0;})
                .peek(i -> log("post filtering", i));
        log("Invoking terminal method count.");
        log("The count is", stream.count());

        System.out.println("----- TakeWhile -----");

        for (Apple a: apples) {
            System.out.println(a.getWeight());
        }

        Optional<Apple> asf = apples.stream().findFirst();

        List<Apple> aps = apples.stream()
                .dropWhile((apple1) -> apple1.getWeight() < 150)
                .toList();
        System.out.println(aps.size());
    }

    public static void log (Object... objects) {
        String s = LocalTime.now().toString();
        for (Object object : objects) {
            s += " - " + object.toString();
        }
        System.out.println(s);
        // putting a little delay so that we can see a clear difference
        // with parallel stream.
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t: list) {
            result.add(f.apply(t));
        }

        return result;
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t: list) {
            c.accept(t);
        }
    }
}

