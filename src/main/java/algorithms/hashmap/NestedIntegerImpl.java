package algorithms.hashmap;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
  private Integer val;
  private NestedInteger nestedInteger;

  @Override
  public boolean isInteger() {
    return  false;
  }

  @Override
  public Integer getInteger() {
    return val;
  }

  @Override
  public void setInteger(int value) {
    this.val = value;
  }

  @Override
  public void add(NestedInteger ni) {

  }

  @Override
  public List<NestedInteger> getList() {
    return null;
  }
}
