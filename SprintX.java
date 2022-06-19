import java.util.Scanner;

public class SprintX {
     public static void main (String[] args){
          Scanner input = new Scanner(System.in);
          System.out.println(
          "\n"+
          "\n=================================================================="+
          "\n                      _______   __       __"+
          "\n                     |   ____| |_ |_   _| _|"+
          "\n                     |  |____    |_ |_| _| "+
          "\n                     |____   |    _| _ |_"+
          "\n                      ____|  |  _| _| |_ |_"+
          "\n                     |_______| |__|     |__|"+
          "\n"+
          "\n                       WELCOME TO SprintX!" + 
          "\n  AN OFFLINE JAVA-CUI-BASED SINGLE-LINE SPRINT TYPING SPEED TEST."+
          "\n"+
          "\n=================================================================="+
          "\n"+
          "\n"+
          "> START WRITING IMMIDIATELY AFTER PRESSING THE ENTER KEY."
          );
          String startTimer = input.nextLine();
          if (startTimer.equals("")){
               System.out.println("> YOU CAN START TYPING! \n\n");
               long startTime = System.currentTimeMillis();
               long elapsedTime = 0L;
          	String textWritten = input.nextLine();
               if (textWritten.equals("")){
                    System.out.println("\n> OOPS! YOU DID'T WRITE ANYTHING!.");
               } 
               else {
                    String[] wordArray = textWritten.trim().split("\\s+");
                    int totalWords = wordArray.length;
                    String userLevel;
                    double avgWordPerMinute = ((totalWords / ((elapsedTime = System.currentTimeMillis() - startTime) / 1000.0) * 60));
                    double avgWordPerSecond = ((totalWords / ((elapsedTime = System.currentTimeMillis() - startTime) / 1000.0)));
                    if (avgWordPerMinute < 20) {
                         userLevel = "Beginner";
                    } 
                    else if (avgWordPerMinute < 40 && avgWordPerMinute >= 20) {
                         userLevel = "Intermediate";
                    } 
                    else {
                         userLevel = "Expert";
                    }
                    System.out.println("\n\n> YOUR STATS:");
                    System.out.println("  - Total words written: " + totalWords);
                    System.out.println(
                         "  - Total time taken: " 
                         + (elapsedTime = System.currentTimeMillis() - startTime) / 60000 
                         + " minutes and " 
                         + (elapsedTime = System.currentTimeMillis() - startTime) / 1000 
                         + " seconds.");
                    System.out.println(
                         "  - Average words per minute: " 
                         + String.valueOf(avgWordPerMinute).substring(0, String.valueOf(avgWordPerMinute).indexOf(".") + 2));
                    System.out.println(
                         "  - Average words per second: " 
                         + String.valueOf(avgWordPerSecond).substring(0, String.valueOf(avgWordPerSecond).indexOf(".") + 2));
                    System.out.println(
                         "  - Your Level: " 
                         + userLevel +
                         "\n"+
          "\n==================================================================");
               }
          }
          else {
               System.out.println("> OOPS! IT SEEMS THAT YOU STARTED TYPING BEFORE PRESSING ENTER KEY! PLEASE RESTART." +
                         "\n"+
          "\n==================================================================");
          }
     }
}