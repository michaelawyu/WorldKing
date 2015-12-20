
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/conf/routes
// @DATE:Sun Dec 20 12:19:36 EST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """genRes""", """controllers.Application.genRes()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """genRes""", """controllers.Application.pdfViewer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registration""", """controllers.Application.registration()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.loginx()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registration""", """controllers.Application.registrationx()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobcategory""", """controllers.Application.displayJobCategory()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resumelist""", """controllers.Application.displayResumeList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewresume""", """controllers.Application.viewResume()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """off""", """controllers.Application.logoff()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewresumex""", """controllers.Application.viewResumex()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.search()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """handleForm""", """controllers.Application.handleForm()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_genRes1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("genRes")))
  )
  private[this] lazy val controllers_Application_genRes1_invoker = createInvoker(
    Application_1.genRes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "genRes",
      Nil,
      "GET",
      """""",
      this.prefix + """genRes"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_pdfViewer2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("genRes")))
  )
  private[this] lazy val controllers_Application_pdfViewer2_invoker = createInvoker(
    Application_1.pdfViewer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "pdfViewer",
      Nil,
      "POST",
      """""",
      this.prefix + """genRes"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login3_invoker = createInvoker(
    Application_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_registration4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registration")))
  )
  private[this] lazy val controllers_Application_registration4_invoker = createInvoker(
    Application_1.registration(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registration",
      Nil,
      "POST",
      """""",
      this.prefix + """registration"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_loginx5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_loginx5_invoker = createInvoker(
    Application_1.loginx(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginx",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_registrationx6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registration")))
  )
  private[this] lazy val controllers_Application_registrationx6_invoker = createInvoker(
    Application_1.registrationx(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registrationx",
      Nil,
      "GET",
      """""",
      this.prefix + """registration"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_displayJobCategory7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobcategory")))
  )
  private[this] lazy val controllers_Application_displayJobCategory7_invoker = createInvoker(
    Application_1.displayJobCategory(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "displayJobCategory",
      Nil,
      "GET",
      """""",
      this.prefix + """jobcategory"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_displayResumeList8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resumelist")))
  )
  private[this] lazy val controllers_Application_displayResumeList8_invoker = createInvoker(
    Application_1.displayResumeList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "displayResumeList",
      Nil,
      "POST",
      """""",
      this.prefix + """resumelist"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_viewResume9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewresume")))
  )
  private[this] lazy val controllers_Application_viewResume9_invoker = createInvoker(
    Application_1.viewResume(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewResume",
      Nil,
      "POST",
      """""",
      this.prefix + """viewresume"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_logoff10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("off")))
  )
  private[this] lazy val controllers_Application_logoff10_invoker = createInvoker(
    Application_1.logoff(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logoff",
      Nil,
      "GET",
      """""",
      this.prefix + """off"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_viewResumex11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewresumex")))
  )
  private[this] lazy val controllers_Application_viewResumex11_invoker = createInvoker(
    Application_1.viewResumex(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewResumex",
      Nil,
      "POST",
      """""",
      this.prefix + """viewresumex"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_search12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_search12_invoker = createInvoker(
    Application_1.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "POST",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_handleForm13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("handleForm")))
  )
  private[this] lazy val controllers_Application_handleForm13_invoker = createInvoker(
    Application_1.handleForm(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "handleForm",
      Nil,
      "POST",
      """""",
      this.prefix + """handleForm"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:7
    case controllers_Application_genRes1_route(params) =>
      call { 
        controllers_Application_genRes1_invoker.call(Application_1.genRes())
      }
  
    // @LINE:8
    case controllers_Application_pdfViewer2_route(params) =>
      call { 
        controllers_Application_pdfViewer2_invoker.call(Application_1.pdfViewer())
      }
  
    // @LINE:9
    case controllers_Application_login3_route(params) =>
      call { 
        controllers_Application_login3_invoker.call(Application_1.login())
      }
  
    // @LINE:10
    case controllers_Application_registration4_route(params) =>
      call { 
        controllers_Application_registration4_invoker.call(Application_1.registration())
      }
  
    // @LINE:11
    case controllers_Application_loginx5_route(params) =>
      call { 
        controllers_Application_loginx5_invoker.call(Application_1.loginx())
      }
  
    // @LINE:12
    case controllers_Application_registrationx6_route(params) =>
      call { 
        controllers_Application_registrationx6_invoker.call(Application_1.registrationx())
      }
  
    // @LINE:13
    case controllers_Application_displayJobCategory7_route(params) =>
      call { 
        controllers_Application_displayJobCategory7_invoker.call(Application_1.displayJobCategory())
      }
  
    // @LINE:14
    case controllers_Application_displayResumeList8_route(params) =>
      call { 
        controllers_Application_displayResumeList8_invoker.call(Application_1.displayResumeList())
      }
  
    // @LINE:15
    case controllers_Application_viewResume9_route(params) =>
      call { 
        controllers_Application_viewResume9_invoker.call(Application_1.viewResume())
      }
  
    // @LINE:16
    case controllers_Application_logoff10_route(params) =>
      call { 
        controllers_Application_logoff10_invoker.call(Application_1.logoff())
      }
  
    // @LINE:17
    case controllers_Application_viewResumex11_route(params) =>
      call { 
        controllers_Application_viewResumex11_invoker.call(Application_1.viewResumex())
      }
  
    // @LINE:18
    case controllers_Application_search12_route(params) =>
      call { 
        controllers_Application_search12_invoker.call(Application_1.search())
      }
  
    // @LINE:19
    case controllers_Application_handleForm13_route(params) =>
      call { 
        controllers_Application_handleForm13_invoker.call(Application_1.handleForm())
      }
  
    // @LINE:22
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_0.versioned(path, file))
      }
  }
}