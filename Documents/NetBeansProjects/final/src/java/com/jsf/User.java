package com.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
    private String name;
    private String lname;
    private String pname;
    private String pass;
    public String getName(){
        return name;
    }
    public void setName(String name1){
            this.name=name1;
    }
    public String getLname()
    {
        return lname;
    }
    public void setLname(String name2){
        this.lname=name2;
    }
    public String getPname(){
        return pname;
    }
    public void setPname(String name3){
        this.pname=name3;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String name4){
            this.pass=name4;
    }
    
}
