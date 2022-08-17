
public class College implements Event, Match{
  @Override
  public void speaking() {
    System.out.println(" In all my college day function oratory competition event will be conducted");

  }

  @Override
  public void musicEvent(String mydate, int participants) {
     System.out.println("mydate " + mydate + " members  " + participants);

  }
  @Override
  public void gameName() {
     System.out.println("Cricket");

  }
  @Override
  public void play() {
    System.out.println( " T20 Cricket is being played");

  }
/* // you can override the default method.
  public void listPlayers( String[] pls){
    for ( String s : pls )
    System.out.println( "in College class " + s );
  }
  */
}