package list;

import java.util.List;

public class Dog  implements Animal{

  @Override
  public void doSomething(List<String> list) {
    list.add("test4");
  }
}
