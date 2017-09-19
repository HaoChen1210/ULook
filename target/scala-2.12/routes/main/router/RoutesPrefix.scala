
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/frank/cs/SENG2021/ulook/conf/routes
// @DATE:Mon Sep 18 22:39:09 AEST 2017


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
