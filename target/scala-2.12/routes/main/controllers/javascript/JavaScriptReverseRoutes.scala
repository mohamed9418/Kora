// @GENERATOR:play-routes-compiler
// @SOURCE:F:/pla/app1/kora/conf/routes
// @DATE:Sun Sep 30 19:55:10 EET 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReversePlayGroundController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def retrivePlayGroundByCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayGroundController.retrivePlayGroundByCity",
      """
        function(cityName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/PlayGroundInfo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("cityName", cityName0))})
        }
      """
    )
  
    // @LINE:12
    def retrivePlayGround: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayGroundController.retrivePlayGround",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/PlayGroundInfo"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseCityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getcitiesName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CityController.getcitiesName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/citiesName"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseChallangeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def newChallange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallangeController.newChallange",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/newChallange"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseteamsApi(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def joinTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.teamsApi.joinTeam",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/nMember"})
        }
      """
    )
  
    // @LINE:14
    def invteToJoinTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.teamsApi.invteToJoinTeam",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/invite"})
        }
      """
    )
  
    // @LINE:11
    def newTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.teamsApi.newTeam",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/newTeam"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseReserveApi(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def Reserve: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReserveApi.Reserve",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/reserve"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseactivationApi(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def activePlayer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.activationApi.activePlayer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/active"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseplayerApi(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def searchPlayerByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.playerApi.searchPlayerByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/playername/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:8
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.playerApi.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/signIn"})
        }
      """
    )
  
    // @LINE:7
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.playerApi.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/register"})
        }
      """
    )
  
  }


}
