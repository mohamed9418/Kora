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
import models.player;
import models.sessions;
import services.PlayerService;
import services.ActiveService;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class playerApi extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result register() {
        JsonNode json = request().body().asJson();
        RegisterData reg= Json.fromJson(json, RegisterData.class);
        player np= PlayerService.insertPlayeer(reg);
        ObjectNode result = Json.newObject();
          if (np !=null){
          result.put("statue", "success");
          Mail mail =new Mail();
          Random rand=new Random();
          int x=Math.abs(rand.nextInt());
          ActiveService.insertToactivate(x,np);
          mail.setRecip(reg.email,String.valueOf(x));
          mail.run();
          result.put("email", "check your email");
        }
        else
        {result.put("statue", "failed: E mail already exist");}
        return ok(result);
    }

    public Result signIn() {
       String State="failed";
        JsonNode json = request().body().asJson();
        SignInData reg= Json.fromJson(json, SignInData.class);

        sessions x = PlayerService.signedPlayer(reg);
          ObjectNode result = Json.newObject();
        if (x!=null){
          result.put("name", x.p.name);
          result.put("sid",x.SID);
          State="succed";
        }

        result.put("statue", State);
        return ok(result);
    }
    public Result searchPlayerByName(String name){
      List<RetrivedPlayerData> pf=PlayerService.playerByName( name);
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
