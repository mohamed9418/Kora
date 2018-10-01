package services;
import metaData.JoinReqData;
import metaData.InviteData;
import models.sessions;
import models.teams;
import models.player;
import models.team_members;
import models.teams;
import io.ebean.DataIntegrityException ;
import java.util.List;
public class TeamMembersService{
  public static team_members askTojoin(JoinReqData requestData){
    try{
    player rPlayer=sessions.find.byId(requestData.SID).p;
    teams recTeam=teams.find.byId(requestData.TID);
    team_members tP=new team_members();
    tP.team=recTeam;
    tP.play=rPlayer;
    tP.role="p";
    tP.c_acceptance=0;
    tP.p_acceptence=1;
    tP.save();
    return tP;
  }
  catch(DataIntegrityException e){
    return null;
  }
  }
  public static team_members inviteReq(InviteData inviteData){
      try{
        player captin =sessions.find.byId(inviteData.SID).p;
        List<team_members> myteam=captin.getmyTeam();
        for (team_members ts :myteam){
          if (ts.team.TID==inviteData.TID){
            if (ts.role.equals("c")){
              team_members tP=new team_members();
              tP.team=ts.team;
              tP.play=player.find.query().where().eq("screenID",inviteData.screenID).findList().get(0);
              tP.role="p";
              tP.c_acceptance=1;
              tP.p_acceptence=0;
              tP.save();
              return tP;
            }
            return null;
          }
        }

      }
        catch(DataIntegrityException e){
          return null;
        }
        return null;
  }
  public static team_members addCaptin(player Captin,teams cTeam){
    team_members captin =new team_members();
    captin.team=cTeam;
    captin.play=Captin;
    captin.role="c";
    captin.c_acceptance=1;
    captin.p_acceptence=1;
    captin.save();
    return captin;

  }
}
