package controllers;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.teams;
import models.team_members;
import metaData.newTeamData;
import metaData.JoinReqData;
import services.teamServices;
import services.TeamMembersService;
public class teamsApi extends Controller {
  public Result newTeam(){
    JsonNode json = request().body().asJson();
    newTeamData teamData= Json.fromJson(json, newTeamData.class);
    teams nTeam=teamServices.newTeam(teamData);
    ObjectNode result = Json.newObject();
      result.put("statue", "your team has been created");
    if(nTeam == null)
      result.put("statue", "failed to build team");
      return ok(result);
  }
  public Result joinTeam(){
    JsonNode json = request().body().asJson();
    JoinReqData joinData= Json.fromJson(json, JoinReqData.class);
    ObjectNode result = Json.newObject();
    team_members nMember=TeamMembersService.askTojoin(joinData);
    result.put("statue", "wait for captin response");
  if(nMember == null)
    result.put("statue", "you are already send request");
    return ok(result);
  }
}
