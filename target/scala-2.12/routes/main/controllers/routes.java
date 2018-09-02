// @GENERATOR:play-routes-compiler
// @SOURCE:F:/pla/app1/kora/conf/routes
// @DATE:Wed Aug 29 21:52:59 EET 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseReserveApi ReserveApi = new controllers.ReverseReserveApi(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseactivationApi activationApi = new controllers.ReverseactivationApi(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseplayerApi playerApi = new controllers.ReverseplayerApi(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseReserveApi ReserveApi = new controllers.javascript.ReverseReserveApi(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseactivationApi activationApi = new controllers.javascript.ReverseactivationApi(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseplayerApi playerApi = new controllers.javascript.ReverseplayerApi(RoutesPrefix.byNamePrefix());
  }

}
