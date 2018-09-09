// @GENERATOR:play-routes-compiler
// @SOURCE:D:/pla/Kora/conf/routes
// @DATE:Mon Sep 03 10:38:55 EET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
