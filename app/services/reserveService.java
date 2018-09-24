package services;

import metaData.*;
import models.*;
import java.util.List;
import java.util.Random;
import java.sql.Time;
import java.sql.Date;
public class reserveService{
 public boolean checkvalid(playground p,Time start_at,Time finish_at,Date day){
   List<reserved_slots> pgSlotst= p.reserved_slot;
   Time start;
   Time finish;
  // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
   System.out.println(p.reserved_slot.size());
   for (reserved_slots c :pgSlotst){
  if (c.day.toString().equals(day.toString())){
    System.out.println("In");
    return false;
  }
   }
   return true;
 }
  public reserved_slots reserveslot(ReserveData data){
    sessions s= sessions.find.byId(data.SID);
    playground p=playground.find.byId(data.GID);
    reserved_slots r= new reserved_slots();
    if (checkvalid(p,data.starting,data.finishing,data.day)){
    Random rand=new Random();
    r.RID=Math.abs(rand.nextInt());
    r.pg=p;
    r.rPlayer=s.p;
    r.day=data.day;
    r.start_at=data.starting;
    r.finish_at=data.finishing;
    r.checked=0;
    r.save();}
    else {
      r=null;
    }
    return r;
  }
}
