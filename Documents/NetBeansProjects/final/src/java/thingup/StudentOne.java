package thingup;

import javax.faces.bean.ManagedBean;

import java.io.Serializable; 
import javax.faces.application.FacesMessage; 
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped; 
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class StudentOne {

private String username;
private String lastname;
private String email;

public StudentOne()
{
}
public String getUserName(){
    return username;
}
public void setUsername(String username)
{
this.username=username;    
}
public String getLastName(){
    return lastname;
    }
public void setLastName(String lastname){
    this.lastname=lastname;
}
public String getEmail(){
    return email;
}
public void setEmail(String email)
{
    this.email=email;
}
}