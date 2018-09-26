package services;
import models.activate;
import models.player;
public class ActiveService{
  public static void insertToactivate(int code,player np){
    activate ac = new activate();
    ac.AID= code;
    ac.p=np;
    ac.save();
  }
  public static void activePlayer(int code){
    activate ac =activate.find.byId(code);
    player p=ac.p;
    p.activate=true;
    p.save();
  }
}
