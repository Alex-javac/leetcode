package experiment;

import java.util.HashSet;
import java.util.Objects;

public class ExperimentOverrideEqualsAndHashCode {

  public static void main(String[] args) {
    User user = new User("Viktor", 41, 83.2);
    HashSet<User> users = new HashSet<>();
    users.add(user);
    System.out.println("size " + users.size());
    System.out.println("contains before changes :" + users.contains(user));
    user.setName("Alex");
//    users.add(user);
    System.out.println("size " + users.size());
    System.out.println("contains after changes :" + users.contains(user));
  }

  public static class User {

    private String name;
    private int age;
    private double weight;

    public User(String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      User user = (User) o;
      return age == user.age && Double.compare(weight, user.weight) == 0
          && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, age, weight);
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}