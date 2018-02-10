/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pre_command_scheduler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kazuki
 */
public class writeAsTimestamp extends Pre_command_scheduler{
    
    /*
    * Just write on your application
    *
    *
    */
    
    String inputed_your_task = "asrgrhyfs";
    
    public boolean onTImeStamp() throws IOException{
        
        while(inputed_your_task.equals("asrgrhyfs")){
            
            System.out.println("What did you do??");
            BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
            inputed_your_task = tr.readLine();

            //if there type command with option "-f", you can record forcefuly.
            if(inputed_your_task.contains("-f")){
                System.out.println("Yes Sir! I wrote it down forcibly with your permission");

            }else{
                System.out.println("Is it your done task?? \n [yes]or[no]");
                BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
                String ans = ar.readLine();
                if(ans.equals("yes") || ans.equals("YES")){
                    
                    
                    System.out.println("OK Computer!!");
                }else{
                    System.out.println("Plz try again, master...");
                    inputed_your_task = "asrgrhyfs";
                }

        }
                
        }
        
        return true;
    }
    
}
