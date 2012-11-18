package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import play.mvc.Http.Context.Implicit;
import models.*;
import play.i18n.Lang;
import play.data.Form;
import play.data.Form.Field;
import play.mvc.Http.Request;
import japidviews.*;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import play.mvc.Http.Flash;
import play.data.validation.Validation;
import java.util.*;
import static cn.bran.japid.util.WebUtils.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/main.html
// Change to this file will be lost next time the template file is compiled.
//
public abstract class main extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/main.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play
boolean hasHttpContext = play.mvc.Http.Context.current.get() != null ? true : false;

	final Request request = hasHttpContext? Implicit.request() : null;
	final Response response = hasHttpContext ? Implicit.response() : null;
	final Session session = hasHttpContext ? Implicit.session() : null;
	final Flash flash = hasHttpContext ? Implicit.flash() : null;
	final Lang lang = hasHttpContext ? Implicit.lang() : null;
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public main() {
		super(null);
	}
	public main(StringBuilder out) {
		super(out);
	}
	private String msg; // line 1
	 public void layout(String msg) {
		this.msg = msg;
		beginDoLayout(sourceTemplate);		;// line 1
		p("\n" + 
"<!DOCTYPE html>\n" + 
"<html>\n" + 
"    <head>\n" + 
"        <title>Computers database with Japid 0.7 - ");// line 1
		p(msg);// line 5
		p("</title>\n" + 
"        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");// line 5
		p(routes.Assets.at("stylesheets/bootstrap.min.css"));// line 6
		p("\"> \n" + 
"        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");// line 6
		p(routes.Assets.at("stylesheets/main.css"));// line 7
		p("\"> \n" + 
"    </head>\n" + 
"    <body>\n" + 
"        \n" + 
"        <header class=\"topbar\">\n" + 
"            <h1 class=\"fill\">\n" + 
"                <a href=\"");// line 7
		p(routes.Application.index());// line 13
		p("\">\n" + 
"                    Play 2.0/Japid sample application &mdash; Computer database\n" + 
"                </a>\n" + 
"            </h1>\n" + 
"        </header>\n" + 
"        \n" + 
"        <section id=\"main\">\n" + 
"            ");// line 13
		doLayout();// line 20
		p("        </section>\n" + 
"        \n" + 
"    </body>\n" + 
"</html>\n");// line 20
				endDoLayout(sourceTemplate);	}

	protected abstract void doLayout();
}