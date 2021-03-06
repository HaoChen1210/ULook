
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>

    </head>
    <body>
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(/*12.27*/routes/*12.33*/.HomeController.index()),format.raw/*12.56*/("""">
                    Play sample application &mdash; Computer database
                </a>
            </h1>
        </header>

        
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 17 20:56:26 AEST 2017
                  SOURCE: /home/frank/cs/SENG2021/ulook/app/views/index2.scala.html
                  HASH: d138bec9c8cb40727c05f4fa966b08814839dc6e
                  MATRIX: 942->1|1038->3|1066->5|1281->193|1296->199|1340->222
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12
                  -- GENERATED --
              */
          