package myrectangleproject;


public class Rectangle {

    // Class fields
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    // Default constructor
    public Rectangle()
    {
    }

    // Custom constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // ----------------------- Getters and Setters -----------------------------
    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }
    // ------------------ End of Getters and Setters ---------------------------
    
    // Method to return calculation of area
    public double GetArea() 
    {
        return this.area = length * width;
    } 
    
    // Method to return calculation of perimeter
    public double GetPerimeter() 
    {
        return this.perimeter = 2 * (length + width);
    }
    
 // ----------------------- 0oo0o0 End of File 0o0oo0 -------------------------- 
}
