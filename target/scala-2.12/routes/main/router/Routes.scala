// @GENERATOR:play-routes-compiler
// @SOURCE:F:/pla/app1/kora/conf/routes
// @DATE:Sun Sep 30 19:55:10 EET 2018

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
  playerApi_4: controllers.playerApi,
  // @LINE:9
  activationApi_8: controllers.activationApi,
  // @LINE:10
  ReserveApi_6: controllers.ReserveApi,
  // @LINE:11
  teamsApi_1: controllers.teamsApi,
  // @LINE:12
  PlayGroundController_2: controllers.PlayGroundController,
  // @LINE:15
  ChallangeController_3: controllers.ChallangeController,
  // @LINE:17
  CityController_5: controllers.CityController,
  // @LINE:20
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    playerApi_4: controllers.playerApi,
    // @LINE:9
    activationApi_8: controllers.activationApi,
    // @LINE:10
    ReserveApi_6: controllers.ReserveApi,
    // @LINE:11
    teamsApi_1: controllers.teamsApi,
    // @LINE:12
    PlayGroundController_2: controllers.PlayGroundController,
    // @LINE:15
    ChallangeController_3: controllers.ChallangeController,
    // @LINE:17
    CityController_5: controllers.CityController,
    // @LINE:20
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_0, playerApi_4, activationApi_8, ReserveApi_6, teamsApi_1, PlayGroundController_2, ChallangeController_3, CityController_5, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, playerApi_4, activationApi_8, ReserveApi_6, teamsApi_1, PlayGroundController_2, ChallangeController_3, CityController_5, Assets_7, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/PlayGroundInfo""", """controllers.PlayGroundController.retrivePlayGround"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/nMember""", """controllers.teamsApi.joinTeam"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/invite""", """controllers.teamsApi.invteToJoinTeam"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/newChallange""", """controllers.ChallangeController.newChallange"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/playername/""" + "$" + """name<[^/]+>""", """controllers.playerApi.searchPlayerByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/citiesName""", """controllers.CityController.getcitiesName"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/PlayGroundInfo/""" + "$" + """cityName<[^/]+>""", """controllers.PlayGroundController.retrivePlayGroundByCity(cityName:String)"""),
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
    playerApi_4.register,
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
    playerApi_4.signIn,
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
    activationApi_8.activePlayer,
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
    ReserveApi_6.Reserve,
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

  // @LINE:12
  private[this] lazy val controllers_PlayGroundController_retrivePlayGround6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/PlayGroundInfo")))
  )
  private[this] lazy val controllers_PlayGroundController_retrivePlayGround6_invoker = createInvoker(
    PlayGroundController_2.retrivePlayGround,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayGroundController",
      "retrivePlayGround",
      Nil,
      "GET",
      this.prefix + """api/PlayGroundInfo""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_teamsApi_joinTeam7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/nMember")))
  )
  private[this] lazy val controllers_teamsApi_joinTeam7_invoker = createInvoker(
    teamsApi_1.joinTeam,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.teamsApi",
      "joinTeam",
      Nil,
      "POST",
      this.prefix + """api/nMember""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_teamsApi_invteToJoinTeam8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/invite")))
  )
  private[this] lazy val controllers_teamsApi_invteToJoinTeam8_invoker = createInvoker(
    teamsApi_1.invteToJoinTeam,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.teamsApi",
      "invteToJoinTeam",
      Nil,
      "POST",
      this.prefix + """api/invite""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ChallangeController_newChallange9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/newChallange")))
  )
  private[this] lazy val controllers_ChallangeController_newChallange9_invoker = createInvoker(
    ChallangeController_3.newChallange,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallangeController",
      "newChallange",
      Nil,
      "POST",
      this.prefix + """api/newChallange""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_playerApi_searchPlayerByName10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/playername/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_playerApi_searchPlayerByName10_invoker = createInvoker(
    playerApi_4.searchPlayerByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.playerApi",
      "searchPlayerByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/playername/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CityController_getcitiesName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/citiesName")))
  )
  private[this] lazy val controllers_CityController_getcitiesName11_invoker = createInvoker(
    CityController_5.getcitiesName,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CityController",
      "getcitiesName",
      Nil,
      "GET",
      this.prefix + """api/citiesName""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PlayGroundController_retrivePlayGroundByCity12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/PlayGroundInfo/"), DynamicPart("cityName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlayGroundController_retrivePlayGroundByCity12_invoker = createInvoker(
    PlayGroundController_2.retrivePlayGroundByCity(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayGroundController",
      "retrivePlayGroundByCity",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/PlayGroundInfo/""" + "$" + """cityName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_playerApi_register1_invoker.call(playerApi_4.register)
      }
  
    // @LINE:8
    case controllers_playerApi_signIn2_route(params@_) =>
      call { 
        controllers_playerApi_signIn2_invoker.call(playerApi_4.signIn)
      }
  
    // @LINE:9
    case controllers_activationApi_activePlayer3_route(params@_) =>
      call { 
        controllers_activationApi_activePlayer3_invoker.call(activationApi_8.activePlayer)
      }
  
    // @LINE:10
    case controllers_ReserveApi_Reserve4_route(params@_) =>
      call { 
        controllers_ReserveApi_Reserve4_invoker.call(ReserveApi_6.Reserve)
      }
  
    // @LINE:11
    case controllers_teamsApi_newTeam5_route(params@_) =>
      call { 
        controllers_teamsApi_newTeam5_invoker.call(teamsApi_1.newTeam)
      }
  
    // @LINE:12
    case controllers_PlayGroundController_retrivePlayGround6_route(params@_) =>
      call { 
        controllers_PlayGroundController_retrivePlayGround6_invoker.call(PlayGroundController_2.retrivePlayGround)
      }
  
    // @LINE:13
    case controllers_teamsApi_joinTeam7_route(params@_) =>
      call { 
        controllers_teamsApi_joinTeam7_invoker.call(teamsApi_1.joinTeam)
      }
  
    // @LINE:14
    case controllers_teamsApi_invteToJoinTeam8_route(params@_) =>
      call { 
        controllers_teamsApi_invteToJoinTeam8_invoker.call(teamsApi_1.invteToJoinTeam)
      }
  
    // @LINE:15
    case controllers_ChallangeController_newChallange9_route(params@_) =>
      call { 
        controllers_ChallangeController_newChallange9_invoker.call(ChallangeController_3.newChallange)
      }
  
    // @LINE:16
    case controllers_playerApi_searchPlayerByName10_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_playerApi_searchPlayerByName10_invoker.call(playerApi_4.searchPlayerByName(name))
      }
  
    // @LINE:17
    case controllers_CityController_getcitiesName11_route(params@_) =>
      call { 
        controllers_CityController_getcitiesName11_invoker.call(CityController_5.getcitiesName)
      }
  
    // @LINE:18
    case controllers_PlayGroundController_retrivePlayGroundByCity12_route(params@_) =>
      call(params.fromPath[String]("cityName", None)) { (cityName) =>
        controllers_PlayGroundController_retrivePlayGroundByCity12_invoker.call(PlayGroundController_2.retrivePlayGroundByCity(cityName))
      }
  
    // @LINE:20
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
