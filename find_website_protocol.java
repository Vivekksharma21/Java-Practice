// find type of website and the protocol used
import java.util.*;
public class find_website_protocol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter url : ");
        String url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hyper Text transfer protocaol ");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File transfer protocol");
        }
        else{
            System.out.println("HTTPS protocol");
        }

        String web = url.substring(url.lastIndexOf(".")+1);

        if(web.equals("com")){
            System.out.println("Commercial");
        }
        else if(web.equals("org")){
            System.out.println("Organization");
        }
        else if(web.equals("net")){
            System.out.println("Network");
        }
        sc.close();
    }
}