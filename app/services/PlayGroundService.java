package services;
import models.playground;
import models.sessions;
import metaData.PlayGroundInfo;
import java.util.List;
import java.util.ArrayList;

public class PlayGroundService{
  public static List<PlayGroundInfo> retrivePlayGround(int SID){
     sessions s= sessions.find.byId(SID);
     if (s!=null){
       List<playground> pg=playground.find.all();
       List<PlayGroundInfo> pfI=new ArrayList<>(pg.size());
       for (playground p:pg){
         PlayGroundInfo pf=new PlayGroundInfo();
         pf.name=p.name;
         pf.address=p.address;
         pf.phone_num=p.phone_num;
         pf.price=p.price;
         pf.city=p.c.name;
         pfI.add(pf);
       }
       return pfI;
     }
     return null;
  }
}
