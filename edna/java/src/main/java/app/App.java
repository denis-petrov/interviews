package app;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;


public class App {

    public static void main(String[] args) {
        var users = Stream.of(
                new User(3L, "Kira"),
                new User(1L, "Denis"),
                new User(1L, "Denis"),
                new User(4L, "Masha"),
                new User(2L, "Ivan"),
                new User(2L, "Ivan2"),
                new User(2L, "Ivan"),
                new User(5L, "Vlad")
        ).collect(Collectors.toList());

        var mapCountingByName = users.stream()
                .sorted(User::compareById)
                .sorted(User::compareByName)
                .distinct()
                .collect(groupingBy(User::getName, Collectors.counting()));
        System.out.println(mapCountingByName);
    }
}
