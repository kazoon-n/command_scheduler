/*
 * 2017Dec ~ future!
 *
 * Created by @Zukky Software enginner.
 * This is first step for me to create good Application.
 * Purpose of this app is easy to record your task for Developer who loves commond line.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pre_command_scheduler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import pre_command_scheduler.writeAsTimestamp;

/**
 *
 * @author kazuki
 */
public class Pre_command_scheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("scheduler_core_ver1");
        
        String input_command = "a"; // for initialize
        int useflag = 0; //for initialize
        
        while(!input_command.equals("q")){ 
            //Applicaton is wating you for a long time untill you terminate me...
            
            System.out.println("Plz input Command...");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input_command = br.readLine();

            
                Date input_time = new Date();
                String inputed_time = input_time.toString();


                /*
                * Rollback method
                * You can delete latest record in case of Mistake.
                */
                if(input_command.equals("-rb")){
                    useflag = 1;
                    System.out.println("YOU CAN DELTE LATEST RECOED");
                    System.out.println("LATEST DATA IS HERE.");
                }
                

                /*
                * Timestamp method
                *Trriger to stamp is -w
                */
                //like timestamp
                if(input_command.contains("w")){
                    useflag = 1;
                    System.out.println("Plz write your finished task");                   
                    boolean recordRlz = new writeAsTimestamp().onTImeStamp();
                    if(recordRlz == true){
                        System.out.println("Well done!!");
                    }else{
                        System.out.println("Something wrong.");
                    }
                }

                
                
                
                /*
                * Bang method
                * Bang is killer function of this application.
                * You can check your task records on your blowser.
                *
                */
                if(input_command.equals("bang")){
                    useflag = 1;                    
                    System.out.println("============================================================");
                    System.out.println("BANG!!! LET'S CHECK YOUR TASK HISTORY!!");
                    String bang_messege = "The ultimate fate of the universe is a topic in physical cosmology, \r\n"
                            + "whose theoretical restrictions allow possible scenarios for the evolution and ultimate \r\n"
                            + " fate of the universe to be described and evaluated. \r\n"
                            + "Based on available observational evidence, deciding the fate and evolution of the universe \r\n"
                            + " have now become valid cosmological questions, \r\n"
                            + "being beyond the mostly untestable constraints of mythological or theological beliefs. \r\n"
                            + "Many possible dark futures have been predicted by rival scientific hypotheses, \r\n"
                            + "including that the universe might have existed for a finite and infinite duration, \r\n"
                            + "or towards explaining the manner and circumstances of its beginning.\r\n";
                    System.out.println(bang_messege);
                }




                /*
                * help commnad
                * Show help, it could be useful for users.
                */
                if(input_command.equals("-help")){
                    useflag = 1;                    
                    System.out.println("=============SHOW HELP===========");
                    
                    System.out.println("Anyway, this programmer had witten this mean application with a lot of cake!!!");
                    System.out.println("*･゜ﾟ･*:.｡..｡.:*･'(*ﾟ▽ﾟ*)'･*:.｡. .｡.:*･゜ﾟ･*");
                }
                
                
                //are you sure to end application?
                if(input_command.equals(("q"))){
                    useflag = 1;                    
                    System.out.println("Are u sure end application?");
                    System.out.println("type [yes]or[no]");
                    input_command = br.readLine();
                    if(input_command.equals("yes") || input_command.equals("YES")){
                        input_command = "q";
                    }
                }
                
                //IF, your command is invald...
                if(useflag == 0){
                    System.out.println("YOUR COMMAND IS INVALID!!");
                    System.out.println("PLZ TYPE -help");
                }
                useflag = 0;
                
                System.out.println("");
        }
        System.out.println("Good bye world...");
        
    }
    
}
