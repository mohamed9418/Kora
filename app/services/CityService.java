package services;
import models.city;
import models.playground;
import java.util.List;
import java.util.ArrayList;
public class CityService{
public static List<String>  getCitesName(){
  List<city> cites= city.find.all();
  List<String> names=new ArrayList<>();
  for (city c:cites)
    names.add(c.name);
  return names;
}
public static List<playground> getcityPlayground(String cityName){
  List<city> City=city.find.query().where().eq("name",cityName).findList();
  if(City!= null && City.size()!=0)
  return City.get(0).getplaygrounds();
  return null;
}
}
