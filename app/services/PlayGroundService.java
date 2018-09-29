package services;
import models.playground;
import models.sessions;
import metaData.PlayGroundInfo;
import java.util.List;
import java.util.ArrayList;

public class PlayGroundService{
  public static List<PlayGroundInfo> retrivePlayGround(){

       List<playground> pg=playground.find.all();
       List<PlayGroundInfo> pfI=new ArrayList<>(pg.size());
       for (playground p:pg){
         PlayGroundInfo pf=new PlayGroundInfo();
         pf.name=p.name;
         pf.address=p.address;
         pf.phone_num=p.phone_num;
         pf.price=p.price;
         pf.city=p.c.getName();
         pfI.add(pf);
       }
       return pfI;

  }
  public static List<PlayGroundInfo> retrivePlayGroundbyCity(String name){
    List<playground> pg=CityService.getcityPlayground(name);
    if(pg!= null){
    List<PlayGroundInfo> pfI=new ArrayList<>(pg.size());
    for (playground p:pg){
      PlayGroundInfo pf=new PlayGroundInfo();
      pf.name=p.name;
      pf.address=p.address;
      pf.phone_num=p.phone_num;
      pf.price=p.price;
      pf.city=p.c.getName();
      pfI.add(pf);
    }
    return pfI;}
    return null;
  }
}
