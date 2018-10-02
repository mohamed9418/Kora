package controllers;
import assest.Mail;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import metaData.RequestResponse;
import services.HandlingResponseService;
public class ResponseController extends Controller{

public Result responedTo(){
  JsonNode json = request().body().asJson();
  RequestResponse req=Json.fromJson(json, RequestResponse.class);
  String statue =HandlingResponseService.handleResponse(req);
  ObjectNode result = Json.newObject();
  result.put("statue", statue);
  return ok(result);
}
}
