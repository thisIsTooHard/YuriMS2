/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;
import java.net.*; 
import constants.ServerConstants;
/**
 *
 * @author Administrator
 */
public class AutoIP {
    public static String IP="127.0.0.1";
    
    
    public static String getLocalIP(){
        if (ServerConstants.AUTOIP){
            try{
                InetAddress addr = InetAddress.getLocalHost(); 
                IP=addr.getHostAddress().toString();
                System.out.println("Auto set host IP Active");
                System.out.println("Host IP is "+IP);
            }catch(Exception e){}
        }
        return IP;
    }
    
}
