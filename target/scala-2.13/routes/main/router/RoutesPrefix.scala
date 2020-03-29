// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/shola/Documents/git_projects/project29/conf/routes
// @DATE:Sun Mar 29 01:49:51 WAT 2020


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
