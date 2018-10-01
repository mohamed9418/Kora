package controllers;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;
import metaData.NotificationData;
import services.NotifictionService;
public class NotifictionController extends Controller{
  public Result getNotificiton(){
    JsonNode json = request().body().asJson();
    int SID = Integer.parseInt(json.findPath("SID").textValue());
    ObjectNode result = Json.newObject();
      result.put("Data", Json.toJson(NotifictionService.getNotificiton(SID)));
      result.put("statue", "success");
      return ok(result);
  }
}
