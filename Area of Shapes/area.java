import javax.swing.*;
public class area{
    public static void main(String [] args){
        JFrame r;
        r = new JFrame();
        String popup = (JOptionPane.showInputDialog(r, "Do you want to find the area of a square or a triangle? please type which one you are looking for", JOptionPane.PLAIN_MESSAGE));

        if(popup.equalsIgnoreCase("square")){
            r = new JFrame();
            double response = Double.parseDouble(JOptionPane.showInputDialog(r, "Enter the base", "Area of a square", JOptionPane.PLAIN_MESSAGE)); 
            double base = (response);
            if(base != 0){

           
                double heightresponse = Double.parseDouble(JOptionPane.showInputDialog(r, "Enter the height", "Area of a square", JOptionPane.PLAIN_MESSAGE)); 
                double height = (heightresponse);
     
                 if (height != 0){
     
                 double area = (base*height);
                 r = new JFrame();
                 JOptionPane.showMessageDialog(r,"The area of the rectangle is " + area);
     
                } else {
                 r = new JFrame();
                 JOptionPane.showMessageDialog(r,"Please use a valid height!");
                }
     
             } else {
                 r = new JFrame();
                 JOptionPane.showMessageDialog(r,"Please use a valid base!");
             }
             System.exit(1);

        } else if(popup.equalsIgnoreCase("triangle")){
        r = new JFrame();
        double response = Double.parseDouble(JOptionPane.showInputDialog(r, "Enter the base first ", "Area of a triangle", JOptionPane.PLAIN_MESSAGE)); 
        double base = (response);
        
        if(base != 0){

           
           double heightresponse = Double.parseDouble(JOptionPane.showInputDialog(r, "Enter the height", "Area of a triangle", JOptionPane.PLAIN_MESSAGE)); 
           double height = (heightresponse);

            if (height != 0){

            double area = (base*height)/2;
            r = new JFrame();
            JOptionPane.showMessageDialog(r,"The area of the triangle is " + area);

           } else {
            r = new JFrame();
            JOptionPane.showMessageDialog(r,"Please use a valid height!");
           }

        } else {
            r = new JFrame();
            JOptionPane.showMessageDialog(r,"Please use a valid base!");
        }
        System.exit(1);
    }
    
        
        
    }
}