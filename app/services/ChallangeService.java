package services;
import metaData.ChallangeMetaData;
import metaData.ReserveData;
import models.challenges;
import models.reserved_slots;
import models.sessions;
import models.player;
import models.team_members;
import models.teams;
import java.util.Random;
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
        c.teamAcceptance=false;
        c.save();
        return c;
    }
  }
    return null;

  }
}
