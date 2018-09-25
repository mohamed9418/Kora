package services;
import metaData.JoinReqData;
import models.sessions;
import models.teams;
import models.player;
import models.team_members;
import io.ebean.DataIntegrityException ;
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
}
