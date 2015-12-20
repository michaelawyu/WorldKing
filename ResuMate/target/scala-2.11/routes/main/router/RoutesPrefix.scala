
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/conf/routes
// @DATE:Sun Dec 20 12:19:36 EST 2015


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
