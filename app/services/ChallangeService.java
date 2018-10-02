package services;
import metaData.ChallangeMetaData;
import metaData.ReserveData;
import metaData.RequestResponse;
import models.challenges;
import models.reserved_slots;
import models.sessions;
import models.player;
import models.team_members;
import models.teams;
import java.util.Random;
import java.util.List;
import io.ebean.Ebean;
public class ChallangeService{
  public static challenges challangeRequest(ChallangeMetaData Data){
    player p= sessions.find.byId(Data.SID).p;
    teams t =null;
    for (team_members tm :p.getmyTeam()){
      if(tm.role.equals("c")){
        t=tm.getTeam();
        break;
      }
    }
    if(t!=null){
    ReserveData reserveData =(ReserveData) Data;
    reserved_slots rs= reserveService.reserveslot(reserveData);
    if (rs != null){
      challenges c=new challenges();
        Random rand=new Random();
        c.CID=Math.abs(rand.nextInt());
        c.slots=rs;
        c.invTeam=t;
        c.chTeam=teams.find.byId(Data.ChTeam);
        c.teamAcceptance=0;
        c.save();
        return c;
    }
  }
    return null;

  }
  public static String responseToChallange(RequestResponse reqData){
    player p=PlayerService.findPlayerBySID(reqData.SID);
    challenges targetChallange =challenges.find.byId(reqData.targetID);
    List<team_members> tm=Ebean.find(team_members.class)
                    .where()
                    .eq("PID",p.PID)
                    .eq("role","c")
                    .eq("TID",targetChallange.chTeam.TID).findList();
  if (tm != null ||tm.size()!=0 ){
    targetChallange.teamAcceptance=reqData.response;
    targetChallange.update();
    return "opreation complate";
  }
  return "opreation faild you don't have the permisson";
  }
}
