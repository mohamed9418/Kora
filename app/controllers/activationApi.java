package controllers;
import assest.Mail;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import java.util.*;
import metaData.*;
import services.ActiveService;
public class activationApi extends Controller{

public Result activePlayer(){
  ActiveService c=new ActiveService();
  JsonNode json = request().body().asJson();
  int code = Integer.parseInt(json.findPath("code").textValue());
  c.activePlayer(code);
  ObjectNode result = Json.newObject();
  result.put("statue", "success");
  return ok(result);
}
}
