public interface Event {
  public static final int MAX_EVENTS = 10;
  int EVENT_NUMBER = 1000; // constant values cannot be changed


  void speaking();
  public void musicEvent(String mydate, int participants);
}
