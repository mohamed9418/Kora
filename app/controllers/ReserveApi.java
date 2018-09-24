package controllers;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import java.util.*;
import metaData.*;
import services.reserveService;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ReserveApi extends Controller {
  public Result Reserve(){
    JsonNode json = request().body().asJson();
    ReserveData reg= Json.fromJson(json, ReserveData.class);
    reserveService rs=new reserveService();
  reserved_slots t=  rs. reserveslot(reg);
    ObjectNode result = Json.newObject();
    if (t!= null)
    result.put("statue", "success");
    else
    result.put("statue", "failed there is another reserve in this time");
    return ok(result);
  }
}
