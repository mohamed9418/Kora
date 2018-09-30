package controllers;
import assest.Mail;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import metaData.RegisterData;
import metaData.SignInData;
import metaData.RetrivedPlayerData;
import java.util.*;
import models.challenges;
import metaData.ChallangeMetaData;
import services.ChallangeService;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ChallangeController extends Controller {
  public Result newChallange(){
    JsonNode json = request().body().asJson();
    ChallangeMetaData chData= Json.fromJson(json, ChallangeMetaData.class);
    challenges ch=ChallangeService.challangeRequest(chData);
    ObjectNode result = Json.newObject();
    if (ch!= null)
    result.put("statue", "success: waiting for response from the another team");
    else
    result.put("statue", "failed :you don't have the permission/ there is another reserve in this time");
    return ok(result);

  }
}
