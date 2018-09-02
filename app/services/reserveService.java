package services;

import metaData.*;
import models.*;
import java.util.*;
public class reserveService{

  public void reserveslot(ReserveData data){
    sessions s= sessions.find.byId(data.SID);
    playground p=playground.find.byId(data.GID);
    reserved_slots r= new reserved_slots();
    Random rand=new Random();
    r.RID=Math.abs(rand.nextInt());
    r.pg=p;
    r.rPlayer=s.p;
    r.date=data.day;
    r.starting=data.starting;
    r.finishing=data.finishing;
    r.checked=false;
    r.save();
  }
}
