package controllers;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import services.CityService;
import java.util.List;
public class CityController extends Controller{
  public Result getcitiesName(){
    ObjectNode result = Json.newObject();
    String state ="Done";
    List<String> citesName=CityService.getCitesName();
    result.put("statue", state);
    result.put("Names", Json.toJson(citesName));
    return ok(result);
  }
}
