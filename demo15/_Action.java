package demo15;

public abstract class _Action {
  private String name;

  public _Action(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void say();
}
