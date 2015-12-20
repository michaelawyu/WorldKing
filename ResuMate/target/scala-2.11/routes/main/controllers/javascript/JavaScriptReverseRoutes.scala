
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/conf/routes
// @DATE:Sun Dec 20 12:19:36 EST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def displayResumeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.displayResumeList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resumelist"})
        }
      """
    )
  
    // @LINE:17
    def viewResumex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewResumex",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewresumex"})
        }
      """
    )
  
    // @LINE:15
    def viewResume: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewResume",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewresume"})
        }
      """
    )
  
    // @LINE:19
    def handleForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.handleForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "handleForm"})
        }
      """
    )
  
    // @LINE:8
    def pdfViewer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.pdfViewer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "genRes"})
        }
      """
    )
  
    // @LINE:13
    def displayJobCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.displayJobCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobcategory"})
        }
      """
    )
  
    // @LINE:10
    def registration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
        }
      """
    )
  
    // @LINE:12
    def registrationx: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registrationx",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
        }
      """
    )
  
    // @LINE:7
    def genRes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.genRes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "genRes"})
        }
      """
    )
  
    // @LINE:18
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:11
    def loginx: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginx",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def logoff: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logoff",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "off"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}