// @GENERATOR:play-routes-compiler
// @SOURCE:F:/pla/app1/kora/conf/routes
// @DATE:Wed Aug 29 21:52:59 EET 2018


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
