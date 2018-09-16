// @GENERATOR:play-routes-compiler
// @SOURCE:D:/pla/Kora/Kora/conf/routes
// @DATE:Sun Sep 16 13:09:41 EET 2018


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
