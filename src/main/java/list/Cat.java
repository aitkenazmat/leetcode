package list;

import java.util.List;

public class Cat implements Animal{
  @Override
  public void doSomething(List<String> list) {
    list.remove("test1");
    list.add("test3");
  }
}
