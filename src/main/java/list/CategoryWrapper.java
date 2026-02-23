package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryWrapper {

  public ArrayList<String> list;


  public CategoryWrapper(ArrayList<String> list) {
    this.list = list;
  }


  public ArrayList<String> add() {
    list.add("d");
    return list;
  }

  public void remove(int i) {
    list.remove(i);
  }
}
