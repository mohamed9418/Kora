package services;
import metaData.RegisterData;
import metaData.SignInData;
import metaData.RetrivedPlayerData;
import models.player;
import models.sessions;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import io.ebean.DataIntegrityException ;
public class PlayerService{
  public static player insertPlayeer(RegisterData rD){
    try{
    player n= new player();
    Random rand=new Random();
    n.PID=Math.abs(rand.nextInt());
    n.name=rD.name;
    n.pass=rD.pass;
    n.email=rD.email;
    n.b_date=rD.b_date;
    n.activate=true;
    n.save();
    return n;}
    catch(DataIntegrityException e){
      return null;
    }
  }
  public static sessions signedPlayer(SignInData si){
    List<player> p= player.find.query().where().eq("email",si.email).findList();
    player x =p.get(0);
    Random rand=new Random();
    if (x!=null){
      if (x.pass.equals(si.pass))
        {
          sessions s=new sessions();
          s.SID=Math.abs(rand.nextInt());
          s.p=x;
          s.statue=1;
          s.opendIN=new Date();
          s.save();
          return s;
        }
    }
    return null;
  }
public static List<RetrivedPlayerData> playerByName(String name){
  List<player> players= player.find.query().where().ilike("name","%"+name+"%").findList();
  List<RetrivedPlayerData> playerInfo=new ArrayList<RetrivedPlayerData>(players.size());
  RetrivedPlayerData x=new RetrivedPlayerData();
  for (player p :players){
    x.name=p.name;
    x.pic=p.pic;
    x.cityName=p.c.getName();
    playerInfo.add(x);
  }
  return playerInfo;
}
}
