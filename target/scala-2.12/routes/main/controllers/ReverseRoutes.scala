// @GENERATOR:play-routes-compiler
// @SOURCE:D:/pla/Kora/Kora/conf/routes
// @DATE:Sun Sep 23 12:36:42 EET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseteamsApi(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def newTeam(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/newTeam")
    }
  
  }

  // @LINE:10
  class ReverseReserveApi(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def Reserve(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reserve")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseactivationApi(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def activePlayer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/active")
    }
  
  }

  // @LINE:7
  class ReverseplayerApi(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/signIn")
    }
  
    // @LINE:7
    def register(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/register")
    }
  
  }


}
