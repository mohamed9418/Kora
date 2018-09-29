package controllers;
import assest.Mail;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import metaData.PlayGroundInfo;
import services.PlayGroundService;
import java.util.List;
public class PlayGroundController extends Controller{
  public Result retrivePlayGround(){
  List<PlayGroundInfo> pf=PlayGroundService.retrivePlayGround();
    ObjectNode result = Json.newObject();
    String state ="failed";
    if (pf!= null){
       state ="success";
      result.put("Data", Json.toJson(pf));
    }
    result.put("statue", state);
    return ok(result);
}
public Result retrivePlayGroundByCity(String cityName){
  List<PlayGroundInfo> pf=PlayGroundService.retrivePlayGroundbyCity(cityName);
    ObjectNode result = Json.newObject();
    String state ="No playGround in this city";
    if (pf!= null){
       state ="success";
      result.put("Data", Json.toJson(pf));
    }
    result.put("statue", state);
    return ok(result);
}
}
