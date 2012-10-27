package japidviews;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import play.mvc.Http.Context.Implicit;
import models.*;
import play.i18n.Lang;
import play.data.Form;
import play.data.Form.Field;
import play.mvc.Http.Request;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import play.mvc.Http.Flash;
import play.data.validation.Validation;
import java.util.*;
import static cn.bran.japid.util.WebUtils.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/onError.html
// Change to this file will be lost next time the template file is compiled.
//
public class onError extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/onError.html";
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


	public onError() {
		super(null);
	}
	public onError(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"rh", "t",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"play.mvc.Http.RequestHeader", "Throwable",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.onError.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private play.mvc.Http.RequestHeader rh; // line 1
	private Throwable t; // line 1
	public cn.bran.japid.template.RenderResult render(play.mvc.Http.RequestHeader rh,Throwable t) {
		this.rh = rh;
		this.t = t;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 1
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
		p("\n" + 
"\n");// line 1
		p("\n" + 
"<h2>\n" + 
"bad bad bad\n" + 
"</h2>\n" + 
"\n" + 
"<h3>\n" + 
"request: ");// line 3
		p(rh.uri());// line 10
		p("</h3>\n" + 
"\n" + 
"<h3>\n" + 
"error: ");// line 10
		p(t.getMessage());// line 14
		p("</h3>");// line 14
		
		endDoLayout(sourceTemplate);
	}

}