package services;
import metaData.newTeamData;
import models.teams;
import models.city;
import models.team_members;
import models.sessions;
import java.util.Random;
import java.sql.SQLIntegrityConstraintViolationException;
import io.ebean.DataIntegrityException ;

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
      team_members captin=new team_members();
      captin.team=nTeam;
      captin.play=PS.p;
      captin.role="c";
      captin.c_acceptance=true;
      captin.p_acceptence=true;
      nTeam.save();
      captin.save();
      return nTeam;
  }
  catch(DataIntegrityException e){
    return null;
  }
  }
}
