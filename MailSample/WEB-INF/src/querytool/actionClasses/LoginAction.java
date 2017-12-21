package querytool.actionClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.HibernateException;

import querytool.modelClasses.LoginCheck;

import com.opensymphony.xwork2.ActionSupport;

import flexjson.JSONSerializer;


public class LoginAction extends ActionSupport implements ServletRequestAware,SessionAware{

private static final long serialVersionUID = 1L;

private String userid=null;
private String password=null;
private String mailbody=null;
private HttpServletRequest request = null;
private HttpSession session = null;
private String resultString = "success";

HashMap<String, String> map = new HashMap<String, String>();
public String LoginUser(){
	String result = null;
	
try{
	if (LoginCheck.Register(userid, password,mailbody)) {

		result = "success";
    }else{
    	result = "error";
    	}
	
	}catch(HibernateException e) {
		e.printStackTrace();
		result =e.getMessage();
	}catch(Exception e){
			e.printStackTrace();
			result =e.getMessage();
			}
		JSONSerializer serializer = new JSONSerializer();
		String jsonData = serializer.serialize(result);
		request.setAttribute("jsonData", jsonData);
		return "jsonData";
}

public String Update(){
	String user = "gh";
	Map<String,Object> map= new HashMap<String,Object>();
	String result ="null";
		try {
			@SuppressWarnings("unused")
			LoginCheck logincheck= new LoginCheck();
			ArrayList<String>  body = LoginCheck.UpdateValidate(user);
			System.out.println(body);
			map.put("body", body.get(0));
			map.put("resultString", resultString);
			/*if (LoginCheck.UpdateValidate(user)){
				result = "success";
			}else{
				result = "error";
				}*/
			}catch (HibernateException e){
				map.put("resultString", "error");
				map.put("errorString", e.getMessage());
				e.printStackTrace();
			}catch (Exception e){
				map.put("resultString", "error");
				map.put("errorString", e.getMessage());
				e.printStackTrace();
				}	
		/*map.put("test", body);
		return map;*/
		JSONSerializer jss = new JSONSerializer();
		result = jss.serialize(map);
		request.setAttribute("jsonData", result);
		return "jsonData";
} 
@Override
public void setServletRequest(HttpServletRequest request) {
	this.request=request;
	}
	public String logout() {
	session = request.getSession();
	session.invalidate();
	return "success";
	}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMailbody() {
	return mailbody;
}
public void setMailbody(String mailbody) {
	this.mailbody = mailbody;
}

@Override
public void setSession(Map<String, Object> arg0) {
	// TODO Auto-generated method stub
	
}


}
