package querytool.modelClasses;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import querytool.beanClasses.maildata;



public class LoginCheck {
	public static boolean Register(String userid, String password,String mailbody){

			Session session = Dao.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
				maildata md = new maildata();
				md.setUserid(userid);
				md.setPassword(password);
				md.setMailbody(mailbody);
				session.save(md);
				transaction.commit();
				session.close();
				return true;
				}
public static ArrayList<String> UpdateValidate( String user){
	Session session = Dao.getSessionFactory().openSession();
	
	Query query=session.createQuery("select mailbody from maildata  where userid=:usid");
	String useridDb = (String) query.setParameter("usid", user).uniqueResult();
	ArrayList<String> list=new ArrayList<String>();
	list.add(useridDb);
	session.close();
	return list;
	
}
	}

	
