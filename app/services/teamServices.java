package services;
import metaData.newTeamData;
import metaData.NotificationData;
import models.teams;
import models.city;
import models.team_members;
import models.player;
import models.sessions;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLIntegrityConstraintViolationException;
import io.ebean.DataIntegrityException ;
import io.ebean.*;

public class teamServices{
  public static teams newTeam(newTeamData nData){
    try{
      sessions PS=sessions.find.byId(nData.SID);
      city loc=city.find.byId(nData.CID);
      if(PS==null||loc == null) return null;
      teams nTeam=new teams();
      Random rand=new Random();
      nTeam.TID=Math.abs(rand.nextInt());
      nTeam.team_name=nData.teamName;
      nTeam.inCity=loc;
      nTeam.traveling=nData.traveling;
      team_members captin=TeamMembersService.addCaptin(PS.p,nTeam);
      if (captin!= null){
      nTeam.save();
      return nTeam;}

  }
  catch(DataIntegrityException e){
    return null;
  }
    return null;
  }
  public static List<NotificationData> PlayerTeamNotificaiton(int SID){
    List<NotificationData> notification= new ArrayList<>();
    sessions PS=sessions.find.byId(SID);
    player p= PS.p;
    team_members tm=Ebean.find(team_members.class)
                    .where()
                    .eq("PID",p.PID)
                    .eq("role","c").findList().get(0);
    NotificationData teamNot=new NotificationData();
    if (tm != null){
    teams playerTeam=tm.getTeam();
      teamNot.name="my Challnges Requests";
      teamNot.count=playerTeam.getchByMe().size();
      notification.add(teamNot);
      teamNot.name="other Challnges Requests";
      teamNot.count=playerTeam.getchByO().size();
      notification.add(teamNot);
      int countRequest = 0 ;
      int countInvite = 0 ;
      for (team_members tx:playerTeam.getTeammembers()){
         if (tm.c_acceptance==0)
         countRequest++;
         if(tm.p_acceptence==0)
         countInvite++;
      }
      teamNot.name="join to Team Requests";
      teamNot.count = countRequest ;
      notification.add(teamNot);
      teamNot.name="invite to Team Requests";
      teamNot.count = countInvite ;
      notification.add(teamNot);

  }
    else {
      teamNot.name="no team stats";
       teamNot.count=0;
       notification.add(teamNot);
    }

    return notification;

  }
}
