package services;

import metaData.*;
import models.*;
import java.util.ArrayList;
import java.util.Random;
import java.sql.Time;
import java.sql.Date;
public class reserveService{

  public void reserveslot(ReserveData data){
    sessions s= sessions.find.byId(data.SID);
    playground p=playground.find.byId(data.GID);
    reserved_slots r= new reserved_slots();
    Random rand=new Random();
    r.RID=Math.abs(rand.nextInt());
    r.pg=p;
    r.rPlayer=s.p;
    r.day=data.day;
    System.out.println(data.starting);
    r.starting=Time.valueOf(data.starting);
    System.out.println(r.starting);
    r.finishing=Time.valueOf(data.finishing);
    System.out.println(r.finishing);
    r.checked=false;
    r.save();
  }
}
