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
        PlayerService serv=new PlayerService();
        player np=  serv.insertPlayeer(reg);
        ActiveService ac= new ActiveService();
        ObjectNode result = Json.newObject();
        result.put("statue", "success");
        Mail mail =new Mail();
        Random rand=new Random();
        int x=Math.abs(rand.nextInt());
        ac.insertToactivate(x,np);
        mail.setRecip(reg.email,String.valueOf(x));
        mail.run();
        result.put("email", "check your email");
        return ok(result);
    }

    public Result signIn() {
       String State="failed";
        JsonNode json = request().body().asJson();
        SignInData reg= Json.fromJson(json, SignInData.class);
        PlayerService serv=new PlayerService();
        sessions x = serv.signedPlayer(reg);
          ObjectNode result = Json.newObject();
        if (x!=null){
          result.put("name", x.p.name);
          result.put("sid",x.SID);
          State="succed";
        }

        result.put("statue", State);
        return ok(result);
    }

}
