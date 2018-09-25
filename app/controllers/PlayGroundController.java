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
  public Result retrivePlayGround(int SID){

    List<PlayGroundInfo> pf=PlayGroundService.retrivePlayGround(SID);
    ObjectNode result = Json.newObject();
   String state ="failed";
    if (pf!= null){
       state ="success";
      result.put("Data", Json.toJson(pf));
    }
    result.put("statue", state);
    return ok(result);

  }
}
