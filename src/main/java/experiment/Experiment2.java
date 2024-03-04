package experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Experiment2 {

  public static void main(String[] args) {
    ImmutableClass victor = new ImmutableClass("Victor", 36, new ArrayList<>());
    ImmutableClass vladimir = new ImmutableClass("Vladimir", 36,
        new ArrayList<>(Collections.singleton(victor)));
    ImmutableClass nikola = new ImmutableClass("Nikola", 36, Arrays.asList(victor, vladimir));
    ImmutableClass alex = new ImmutableClass("Alex", 36, Arrays.asList(victor, vladimir, nikola));
    List<ImmutableClass> list = nikola.getImmutableClassList();
    List<ImmutableClass> list2 = alex.getImmutableClassList();
//    System.out.println(list == list2);
//    System.out.println(list2.equals(list));
    List<String> names = list.stream()
        .map(ImmutableClass::getName)
        .collect(Collectors.toList());
    alex.getImmutableClassList()
        .stream()
        .peek(System.out::println)
        .filter(user-> names.contains(user.getName()))
        .map(ImmutableClass::getName)
        .forEach(System.out::println);
  }
}
