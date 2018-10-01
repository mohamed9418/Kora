package services;
import metaData.RegisterData;
import metaData.SignInData;
import metaData.RetrivedPlayerData;
import metaData.NotificationData;
import models.player;
import models.sessions;
import models.team_members;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import io.ebean.DataIntegrityException ;
import io.ebean.Ebean;

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
    n.screenID=Math.abs(rand.nextInt());
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
    x.screenID=p.screenID;
    playerInfo.add(x);
  }
  return playerInfo;
}
public static List<NotificationData> getMyRequest(int SID){
    List<NotificationData> notification= new ArrayList<>();
  sessions s= sessions.find.byId(SID) ;
  player p = s.p ;
  List<team_members> myTeams= Ebean.find(team_members.class)
                  .where()
                  .eq("PID",p.PID)
                  .findList();
int invitCount = 0 ;
int joinRequestData = 0;
for (team_members tm:myTeams){
  if(tm.c_acceptance==1 && tm.p_acceptence==0)
  invitCount++;
  if(tm.c_acceptance==0 && tm.p_acceptence==1)
  joinRequestData++;
}
NotificationData teamNot=new NotificationData();
teamNot.name="waiting requests";
teamNot.count = invitCount ;
notification.add(teamNot);
teamNot.name="invition for me";
teamNot.count = joinRequestData ;
notification.add(teamNot);
return notification;

}
}
