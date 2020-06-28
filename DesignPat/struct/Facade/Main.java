package DesignPat.struct.Facade;

public class Main {

	public static void main(String[] args) {
		ZooKeeper zp = new ZooKeeper();
		zp.feedDog();
		zp.feedLion();
		zp.feedRabbit();
		/**
		 * javax.faces.context.FacesContext, it internally uses among others the abstract/interface types 
		 * LifeCycle, ViewHandler, NavigationHandler and many more without that the 
		 * enduser has to worry about it (which are however overrideable by injection).
javax.faces.context.ExternalContext, which internally uses ServletContext, 
HttpSession, HttpServletRequest, HttpServletResponse, etc.
		 * 
		 * 
		 * 
		 */
	}

}
