
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/conf/routes
// @DATE:Mon Nov 16 17:13:24 EST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
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
  
    // @LINE:15
    def viewResume: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewResume",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewresume"})
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
  
    // @LINE:11
    def loginx: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginx",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
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