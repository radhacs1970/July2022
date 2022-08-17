
 interface Game{
  void gameName();
}
public interface Match extends Game {
  void play();

  // below is applicable for java 8 and above.
  default void listPlayers( String[] pls){
    for ( String s : pls )
    System.out.println( s );
  }
  public static void playcountStatic(){
    System.out.println("example for static method in interface");
  }
}