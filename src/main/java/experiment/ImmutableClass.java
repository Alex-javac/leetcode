package experiment;

import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

  private final String name;
  private final Integer age;
  private final List<ImmutableClass> immutableClassList;

  public ImmutableClass(String name, Integer age, List<ImmutableClass> immutableClassList) {
    this.name = name;
    this.age = age;
    this.immutableClassList = immutableClassList;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public List<ImmutableClass> getImmutableClassList() {
    return nonNull(immutableClassList) ? new ArrayList<>(immutableClassList) : new ArrayList<>();
  }
}
