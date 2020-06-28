package DesignPat.Behave.Strategy;

/**
 * java.util.Comparator#compare(), executed by among others Collections#sort().
javax.servlet.http.HttpServlet, the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them (and not to get hold of them as instance variables!).
javax.servlet.Filter#doFilter()
 * @author karsushm
 *
 */
public interface Strategy {

	public String build(String location);

}
