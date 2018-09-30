package services;

import metaData.*;
import models.*;
import java.util.List;
import java.util.Random;
import java.sql.Time;
import java.sql.Date;
import io.ebean.DataIntegrityException ;
public class reserveService{
 public static boolean checkvalid(playground p,Time start_at,int duration,Date day){
   List<reserved_slots> pgSlotst= p.reserved_slot;
   Time start;
   Time finish;
   long reserveStartMs=start_at.getTime();
   long reserveDuratinMs = reserveStartMs+(duration*3600000);
   long pgReserveStartMS;
   long pgReserveDuratinMS;
  // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
   System.out.println(p.reserved_slot.size());
   for (reserved_slots c :pgSlotst){
  if (c.day.toString().equals(day.toString())){
      pgReserveStartMS=c.start_at.getTime();
      pgReserveDuratinMS=pgReserveStartMS+(c.duration*3600000);
      if((reserveStartMs==pgReserveStartMS)||(reserveStartMs > pgReserveStartMS && reserveDuratinMs <=  pgReserveDuratinMS)
      ||(reserveStartMs < pgReserveStartMS && reserveDuratinMs <=  pgReserveDuratinMS)||(reserveStartMs > pgReserveStartMS && reserveStartMs <=  pgReserveDuratinMS))
        return false;  }
   }
   return true;
 }
  public static reserved_slots reserveslot(ReserveData data){
    sessions s= sessions.find.byId(data.SID);
    playground p=playground.find.byId(data.GID);
    reserved_slots r= new reserved_slots();
    try{
    if (checkvalid(p,data.starting,data.duration,data.day)){
    Random rand=new Random();
    r.RID=Math.abs(rand.nextInt());
    r.pg=p;
    r.rPlayer=s.p;
    r.day=data.day;
    r.start_at=data.starting;
    r.duration=data.duration;
    r.checked=0;
    r.save();}
    else {
      r=null;
    }
    return r;
  }
  catch(DataIntegrityException e){
    return null;
  }}

}
