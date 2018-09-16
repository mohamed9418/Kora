// @GENERATOR:play-routes-compiler
// @SOURCE:D:/pla/Kora/Kora/conf/routes
// @DATE:Sun Sep 16 13:09:41 EET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  playerApi_2: controllers.playerApi,
  // @LINE:9
  activationApi_5: controllers.activationApi,
  // @LINE:10
  ReserveApi_3: controllers.ReserveApi,
  // @LINE:11
  teamsApi_1: controllers.teamsApi,
  // @LINE:13
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    playerApi_2: controllers.playerApi,
    // @LINE:9
    activationApi_5: controllers.activationApi,
    // @LINE:10
    ReserveApi_3: controllers.ReserveApi,
    // @LINE:11
    teamsApi_1: controllers.teamsApi,
    // @LINE:13
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_0, playerApi_2, activationApi_5, ReserveApi_3, teamsApi_1, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, playerApi_2, activationApi_5, ReserveApi_3, teamsApi_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/register""", """controllers.playerApi.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/signIn""", """controllers.playerApi.signIn"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/active""", """controllers.activationApi.activePlayer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reserve""", """controllers.ReserveApi.Reserve"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/newTeam""", """controllers.teamsApi.newTeam"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_playerApi_register1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/register")))
  )
  private[this] lazy val controllers_playerApi_register1_invoker = createInvoker(
    playerApi_2.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.playerApi",
      "register",
      Nil,
      "POST",
      this.prefix + """api/register""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_playerApi_signIn2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/signIn")))
  )
  private[this] lazy val controllers_playerApi_signIn2_invoker = createInvoker(
    playerApi_2.signIn,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.playerApi",
      "signIn",
      Nil,
      "POST",
      this.prefix + """api/signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_activationApi_activePlayer3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/active")))
  )
  private[this] lazy val controllers_activationApi_activePlayer3_invoker = createInvoker(
    activationApi_5.activePlayer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.activationApi",
      "activePlayer",
      Nil,
      "POST",
      this.prefix + """api/active""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ReserveApi_Reserve4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reserve")))
  )
  private[this] lazy val controllers_ReserveApi_Reserve4_invoker = createInvoker(
    ReserveApi_3.Reserve,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReserveApi",
      "Reserve",
      Nil,
      "POST",
      this.prefix + """api/reserve""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_teamsApi_newTeam5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/newTeam")))
  )
  private[this] lazy val controllers_teamsApi_newTeam5_invoker = createInvoker(
    teamsApi_1.newTeam,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.teamsApi",
      "newTeam",
      Nil,
      "POST",
      this.prefix + """api/newTeam""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_playerApi_register1_route(params@_) =>
      call { 
        controllers_playerApi_register1_invoker.call(playerApi_2.register)
      }
  
    // @LINE:8
    case controllers_playerApi_signIn2_route(params@_) =>
      call { 
        controllers_playerApi_signIn2_invoker.call(playerApi_2.signIn)
      }
  
    // @LINE:9
    case controllers_activationApi_activePlayer3_route(params@_) =>
      call { 
        controllers_activationApi_activePlayer3_invoker.call(activationApi_5.activePlayer)
      }
  
    // @LINE:10
    case controllers_ReserveApi_Reserve4_route(params@_) =>
      call { 
        controllers_ReserveApi_Reserve4_invoker.call(ReserveApi_3.Reserve)
      }
  
    // @LINE:11
    case controllers_teamsApi_newTeam5_route(params@_) =>
      call { 
        controllers_teamsApi_newTeam5_invoker.call(teamsApi_1.newTeam)
      }
  
    // @LINE:13
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
