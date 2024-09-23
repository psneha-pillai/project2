import java.io*;
import javax.servlet*;
import javax.servlet.http*;
public class helloworldServlet extends httpservlet{
public void  doGet(httpServlet Request request, httpServlet Response response)
throws To exception, Servlet exception
{
response.Set Content Type ("text/html");
printwriter out=response.getweiter();
out.println("<html><head><title>helloworld servlet<title></head>
out.println("<body>");
out.println(<"h1>helloworl!</h1>");
out.println("</body></html/>");
out.close();
}
}