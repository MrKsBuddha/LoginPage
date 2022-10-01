import java.util.HashMap;;
public class IDandPasswords
{
    HashMap<String,String> logininfo=new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("kshitiz","Mr.ksbuddha");
        logininfo.put("Brocode","abc123");

    }
   protected HashMap getLoginInfo(){
        return logininfo;
    }
}