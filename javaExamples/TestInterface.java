
public class TestInterface {
  public static void main(String[] args) {
     //Event ev = new Event();// error 
     /*
     College cg = new College();
     cg.gameName();
     cg.play();
     cg.speaking();
     cg.musicEvent("19-Aug-2022", 20);
    */

     Event et = new College();
     et.musicEvent("25-Aug-2022", 10);
     et.speaking();

     Match mt = (Match) et;
     mt.gameName();
     mt.play();
     String[] strArr = new String[] {"sachin","kapil","gavaskar"};
     mt.listPlayers(strArr);
     
     Match.playcountStatic();
     

  }
}