/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebulastart;

/**
 *
 * @author 85466
 */
public class Ping {
    
    public static String ping1(){
        // Yang Qianru 172.20.10.6:8080
        try {
            team.v1ctorl.nebula.Pong1_Service service = new team.v1ctorl.nebula.Pong1_Service();
            team.v1ctorl.nebula.Pong1 port = service.getPong1Port();

            long starttime = System.currentTimeMillis();
            long servertime = port.pong(starttime);
            long requestduration = servertime - starttime;

            return Long.toString(2 * requestduration);
        } catch (Exception ex) {
            return "Time-out";
        }
        
    }
    
    public static String ping2(){
        // Hao Yukun 172.20.10.5:8080
        try {
            team.v1ctorl.nebula.Pong2_Service service = new team.v1ctorl.nebula.Pong2_Service();
            team.v1ctorl.nebula.Pong2 port = service.getPong2Port();

            long starttime = System.currentTimeMillis();
            long servertime = port.pong(starttime);
            long requestduration = servertime - starttime;

            return Long.toString(2 * requestduration);
        } catch (Exception ex) {
            return "Time-out";
        }
        
    }
    
    public static String ping3(){
        // Lu Lizhe 172.20.10.3:8080
        try {
            team.v1ctorl.nebula.Pong3_Service service = new team.v1ctorl.nebula.Pong3_Service();
            team.v1ctorl.nebula.Pong3 port = service.getPong3Port();

            long starttime = System.currentTimeMillis();
            long servertime = port.pong(starttime);
            long requestduration = servertime - starttime;

            return Long.toString(2 * requestduration);
        } catch (Exception ex) {
            return "Time-out";
        }
        
    }
    
    public static String ping4(){
        // Qi Yifan 172.20.10.7:8080
        try {
            team.v1ctorl.nebula.Pong4_Service service = new team.v1ctorl.nebula.Pong4_Service();
            team.v1ctorl.nebula.Pong4 port = service.getPong4Port();

            long starttime = System.currentTimeMillis();
            long servertime = port.pong(starttime);
            long requestduration = servertime - starttime;

            return Long.toString(2 * requestduration);
        } catch (Exception ex) {
            return "Time-out";
        }
        
    }
    
    public static String ping5(){
        // Wang Sijue 172.20.10.8:8080
        try {
            team.v1ctorl.nebula.Pong5_Service service = new team.v1ctorl.nebula.Pong5_Service();
            team.v1ctorl.nebula.Pong5 port = service.getPong5Port();

            long starttime = System.currentTimeMillis();
            long servertime = port.pong(starttime);
            long requestduration = servertime - starttime;

            return Long.toString(2 * requestduration);
        } catch (Exception ex) {
            return "Time-out";
        }
        
    }
    
}
