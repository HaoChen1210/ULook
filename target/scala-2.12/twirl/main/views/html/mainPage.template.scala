
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

object mainPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.4*/("""


 """),format.raw/*10.2*/("""<span class="bckg"></span>
<header>

<link rel="stylesheet" media="screen" href=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("stylesheets/mainPage.css")),format.raw/*13.97*/("""">

  <h1>ULook</h1>
  <nav>
    <ul>
      <li>
        <a href="javascript:void(0);" data-title="Projects">Get inspire</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Team">Recommended</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Diary">My items</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Timeline">My Outfits</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Settings">Search</a>
      </li>

    </ul>
  </nav>
</header>
<main>

  <div class="title">
    <h2>Welcome to ULook!</h2>
    <a href="javascript:void(0);">Sign in</a>
  </div>

  <article class="larg">
    <div>
      <h3>Image 1 <span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3>Image 2 <span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3>Image 3 <span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
  </article>
</main>
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
                  DATE: Mon Sep 18 21:39:37 AEST 2017
                  SOURCE: /home/frank/cs/SENG2021/ulook/app/views/mainPage.scala.html
                  HASH: 2760ea0ada075bd0d0f2f586d974706732515fad
                  MATRIX: 1198->260|1294->262|1325->266|1434->348|1449->354|1515->399
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13
                  -- GENERATED --
              */
          