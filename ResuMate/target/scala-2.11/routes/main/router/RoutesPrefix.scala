
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/conf/routes
// @DATE:Wed Dec 16 01:27:01 EST 2015


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
