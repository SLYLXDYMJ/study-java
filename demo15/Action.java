package demo15;

public class Action extends _Action {
  public Action(String name) {
    super(name);
  }

  @Override
  public void say() {
    System.out.println(this.getName());
  }
}
