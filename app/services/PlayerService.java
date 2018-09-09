package services;
import metaData.*;
import models.*;
import java.util.*;
import java.sql.SQLIntegrityConstraintViolationException;
import io.ebean.DataIntegrityException ;
public class PlayerService{
  public player insertPlayeer(RegisterData rD){
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
  public sessions signedPlayer(SignInData si){
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
}
