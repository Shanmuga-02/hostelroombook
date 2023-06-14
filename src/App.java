import java.beans.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.*;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        showhostel types=new showhostel();
        types.showhostels();
        int hostelNeed;
        System.out.print("Enter the hostel Id for the hostel you need:");
        hostelNeed=sc.nextInt();

        switch(hostelNeed){
            case 101:{
                int checkVacancy;
                System.out.println("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    // System.out.println("YES NEED CHECK VACANCY");
                    // types.showdiamond();
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);
                    types.showRoomDetails(hostelName);

                }
                System.out.println("Do you need room!!Enter 1 for need room and 0 for not need...");
                int needRoom;
                needRoom=sc.nextInt();
                if(needRoom==1){
                    types.pearlRoom();
                }
                else{
                        System.out.println("Thank you for contaction...");
                }
                break;
            

            }
            case 102:{
                int checkVacancy;
                System.out.println("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    // System.out.println("YES NEED CHECK VACANCY");
                    // types.showdiamond();
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);
                    types.showRoomDetails(hostelName);

                }
                System.out.println("Do you need room!!Enter 1 for need room and 0 for not need...");
                int needRoom;
                needRoom=sc.nextInt();
                if(needRoom==1){
                    types.rubyRoom();
                }
                else{
                        System.out.println("Thank you for contaction...");
                }
                break;
            

            }
            case 103:{
                int checkVacancy;
                System.out.println("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    // System.out.println("YES NEED CHECK VACANCY");
                    // types.showdiamond();
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);
                    types.showRoomDetails(hostelName);

                }
                System.out.println("Do you need room!!Enter 1 for need room and 0 for not need...");
                int needRoom;
                needRoom=sc.nextInt();
                if(needRoom==1){
                    types.saphireroom();
                }
                else{
                        System.out.println("Thank you for contaction...");
                }
                break;
            

            }
            case 104:{
                int checkVacancy;
                System.out.println("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    // System.out.println("YES NEED CHECK VACANCY");
                    // types.showdiamond();
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);
                    types.showRoomDetails(hostelName);

                }
                System.out.println("Do you need room!!Enter 1 for need room and 0 for not need...");
                int needRoom;
                needRoom=sc.nextInt();
                if(needRoom==1){
                    types.emeraldroom();
                }
                else{
                        System.out.println("Thank you for contaction...");
                }
                break;
            

            }
            case 105:{
                int checkVacancy;
                System.out.println("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    // System.out.println("YES NEED CHECK VACANCY");
                    // types.showdiamond();
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);
                    types.showRoomDetails(hostelName);

                }
                System.out.println("Do you need room!!Enter 1 for need room and 0 for not need...");
                int needRoom;
                needRoom=sc.nextInt();
                if(needRoom==1){
                    types.diamondroom();
                }
                else{
                        System.out.println("Thank you for contaction...");
                }
                break;            

            }
            case 106:{
                int checkVacancy;
                System.out.print("Do you want to check vacancy:");
                checkVacancy=sc.nextInt();
                if(checkVacancy==1){
                    String hostelName=types.getHostelName(hostelNeed);
                    System.out.print("Hostel name in switch:"+hostelName);

                }

                
            }
        }





    
    }

    
}
