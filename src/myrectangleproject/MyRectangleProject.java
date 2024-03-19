package myrectangleproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon Noah Slingerland ST10438897@vcconnect.edu.za St10438897
 */
public class MyRectangleProject
{
    // Global variables
    private static double length;
    private static double width;
    private static double areaResult;
    private static double perResult;
    private static Rectangle rectangleClass = new Rectangle();
    
    //--------------------------------------------------------------------------
    // Main method
    public static void main(String[] args)
    {
        // Start the program with getting the user's input method
        GetUserInput();
    }
    
    //--------------------------------------------------------------------------
    // Method to retrieve the width and length from the user's input
    private static void GetUserInput() 
    {
        // Using JOptionPane for GUI input (length)
        String inputLength = JOptionPane.showInputDialog("Enter the length of "
                                                            + "the rectangle:");
        length = Double.parseDouble(inputLength);

        // Using JOptionPane for GUI input (width)
        String inputWidth = JOptionPane.showInputDialog("Enter the width of the "
                                                                + "rectangle:");
        width = Double.parseDouble(inputWidth);
        
        // Call method to proceed with creating a rectangle object
        CreateRectangleInstance();
    }
    
    //--------------------------------------------------------------------------
    // Method to create the Rectangle Object and pass the length and width
    private static void CreateRectangleInstance() 
    {
        // Populating the custom constructor 
        rectangleClass = new Rectangle(length, width);
        
        // Once the attributes have been populated, call the next method to
        // make the calculations done in the Rectangle class 
        GetCalculations();
    }
    
    //--------------------------------------------------------------------------
    // Method to call the calculation methods from the Rectangle class
    private static void GetCalculations() 
    {
        areaResult = rectangleClass.GetArea();
        perResult = rectangleClass.GetPerimeter();
        
        // Proceed to call the method that display the results
        DisplayMessage();
    }
    
    //--------------------------------------------------------------------------
    // Method to display the results message
    private static void DisplayMessage() 
    {
        // Green output
        System.out.println("\u001B[32mThe area of the rectangle: " + areaResult);
        
        // Green output
        System.out.println("\u001B[32mThe perimeter of the rectangle: " + perResult);
        
        // Proceed to the next method 
        Restart();
    }
    
    //--------------------------------------------------------------------------
    // Method to ask user if they'd like to restart
    private static void Restart() 
    {
        // Creating a new scanner class
        Scanner scanner = new Scanner(System.in);
        
        // Ask user if they would like to make a new calculation
        System.out.print("Would you like to make " + "a new calculation (Y/N)? ");
        String answer = scanner.nextLine();
        
        // Using an if statement to check whether the user wants to restart
        if (answer.equals("y") || answer.equals("Y")) 
        {
            // User wants to restart so call the method to retrieve a new 
            // input for the width and length
            GetUserInput();
        } 
        else 
        {
            // Exit the program
            System.exit(0);
        }
    }   
 // ----------------------- 0oo0o0 End of File 0o0oo0 --------------------------    
}
