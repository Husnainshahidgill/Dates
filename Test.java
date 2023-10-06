import java.awt.dnd.DropTarget;

public class Test {
    public static void main(String args []){

        Product p1 = new Product("Pen", "Ballpoint",40,new Date(24,9,2015));
        Product p2 = new Product("Pen", "Gelpen",70,new Date(3,7,2023));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.latestProd(p1,p2));
    }
}
