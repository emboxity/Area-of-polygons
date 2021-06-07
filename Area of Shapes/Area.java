import javax.swing.*;

public class Area {
    public static void main(String[] args) {
        JFrame startup;
        try {
            startup = new JFrame();
            String popup = (JOptionPane.showInputDialog(startup,
                    "Do you want to find the area of a square or a triangle? please type which one you are looking for",
                    JOptionPane.PLAIN_MESSAGE));

            if (popup == null) {
                System.exit(0);
            }
            else if (popup.equalsIgnoreCase("square")) {
                squareArea();
                System.exit(0);
            }
            else if (popup.equalsIgnoreCase("rectangle")) {
                rectangleArea();
                System.exit(0);
            } 
            else if (popup.equalsIgnoreCase("triangle")) {
                triangleArea();
                System.exit(0);
            }
            else {
                throw (new Exception());
            }
    }
    catch (Exception x) {
        System.out.println("Input invalid, please try again.");
        System.exit(2);    
    }
}

    public static void squareArea() {
        JFrame squareAreaDialog;
        try {
            squareAreaDialog = new JFrame();
            double base = Double.parseDouble(JOptionPane.showInputDialog(squareAreaDialog, "Enter the base",
                    "Area of a square", JOptionPane.PLAIN_MESSAGE));
            if (base <= 0) {
                throw (new Exception());
            } else {
                JOptionPane.showMessageDialog(squareAreaDialog, "The area of the square is: " + base * base);
            }
        } catch (Exception x) {
            JFrame error = new JFrame();
            JOptionPane.showMessageDialog(error, "Please use a valid base!");
            System.exit(1);
        }
    }
    public static void rectangleArea() {
        JFrame rectangleAreaDialog;
        try {
            rectangleAreaDialog = new JFrame();
            double base = Double.parseDouble(JOptionPane.showInputDialog(rectangleAreaDialog, "Enter the base", "Area of a rectangle", JOptionPane.PLAIN_MESSAGE));
            if (base <= 0) {
                throw (new Exception());
            }
            else {
                double height = Double.parseDouble(JOptionPane.showInputDialog(rectangleAreaDialog, "Enter the height", "Area of a rectangle", JOptionPane.PLAIN_MESSAGE));
                if (height <= 0) {
                    throw (new Exception());
                }
                else {
                    JOptionPane.showMessageDialog(rectangleAreaDialog, "The area of the rectangle is: " + base * height);
                }
            }
        }
        catch (Exception x) {
            JFrame error = new JFrame();
            JOptionPane.showMessageDialog(error, "Please use a valid base and/or height!");
            System.exit(1);
        }
    }
    public static void triangleArea() {
        JFrame triangleAreaDialog;
        try {
            triangleAreaDialog = new JFrame();
            double base = Double.parseDouble(JOptionPane.showInputDialog(triangleAreaDialog, "Enter the base", "Area of a triangle", JOptionPane.PLAIN_MESSAGE));
            if (base <= 0) {
                throw (new Exception());
            }
            else {
                double height = Double.parseDouble(JOptionPane.showInputDialog(triangleAreaDialog, "Enter the height", "Area of a triangle", JOptionPane.PLAIN_MESSAGE));
                if (height <= 0) {
                    throw (new Exception());
                }
                else {
                    JOptionPane.showMessageDialog(triangleAreaDialog, "The area of the triangle is: " + base * height);
                }
            }
        }
        catch (Exception x) {
            JFrame error = new JFrame();
            JOptionPane.showMessageDialog(error, "Please use a valid base and/or height!");
            System.exit(1);
        }
    }
}