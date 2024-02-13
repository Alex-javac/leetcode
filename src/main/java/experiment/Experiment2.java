package experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Experiment2 {

  public static void main(String[] args) {
    ImmutableClass victor = new ImmutableClass("Victor", 36, null);
    ImmutableClass vladimir = new ImmutableClass("Vladimir", 36,
        new ArrayList<>(Collections.singleton(victor)));
    ImmutableClass nikola = new ImmutableClass("Nikola", 36, Arrays.asList(victor, vladimir));
    ImmutableClass alex = new ImmutableClass("Alex", 36, Arrays.asList(victor, vladimir, nikola));
    List<ImmutableClass> list = alex.getImmutableClassList();
    List<ImmutableClass> list2 = alex.getImmutableClassList();
    System.out.println(list == list2);
    System.out.println(list2.equals(list));
  }
}
