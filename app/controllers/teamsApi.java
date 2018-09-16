package controllers;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.teams;
import metaData.newTeamData;
import services.teamServices;
public class teamsApi extends Controller {
  public Result newTeam(){
    JsonNode json = request().body().asJson();
    newTeamData teamData= Json.fromJson(json, newTeamData.class);
    teams nTeam=teamServices.newTeam(teamData);
    ObjectNode result = Json.newObject();
      result.put("statue", "your tema has been created");
    if(nTeam == null)
      result.put("statue", "failed to build team");
      return ok(result);
  }
}
