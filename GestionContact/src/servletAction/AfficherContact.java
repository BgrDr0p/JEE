package servletAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import domain.DAOContact;
import domain.Contact;
import java.util.*;
public class AfficherContact extends Action {
	

	public ActionForward execute(final ActionMapping pMapping,ActionForm pForm, final HttpServletRequest pRequest,final HttpServletResponse pResponse) throws Exception  
	{
		final DAOContact lDAOContact = new DAOContact();
		List<Contact> listeContact = lDAOContact.AfficheContact();
		System.out.println("liste:"+listeContact);
		for(int i=0;i<listeContact.size();i++){
		    System.out.println(listeContact.get(i));
		} 
		// NE PAS OUBLIER GET SESSION
		pRequest.getSession().setAttribute("listeContact", listeContact);
		return pMapping.findForward("success");
	}
	

}
