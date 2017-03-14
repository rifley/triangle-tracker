import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){

    programRunning = true;
    while(programRunning){
      triangleChecker();
    }

  }

  public static String triangleChecker() {
    Console myConsole = System.console();

    System.out.println("We're gonna make a triangle! How long is your first side?");
    Integer userSideA = Integer.parseInt(myConsole.readLine());
    System.out.println("Next side length?");
    Integer userSideB = Integer.parseInt(myConsole.readLine());
    System.out.println("Last side length?");
    Integer userSideC = Integer.parseInt(myConsole.readLine());

    if(userSideA.equals(0)|| userSideB.equals(0) || userSideC.equals(0)){
      System.out.println("No geometrical shape can exist with a side length of 0. Please try again");
    }else {
      System.out.println("hey");
    }
  }
}
