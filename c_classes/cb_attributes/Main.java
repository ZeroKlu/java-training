package c_classes.cb_attributes;

public class Main {
    // Attributes (also called "fields")
    int x = 5;
    int y = 3;
    // The "final" modifier on an attribute sets it as a constant (cannot be changed)
    final int z = 10;
    
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x *= 10;
        myObj.y *= 5;
        System.out.println(myObj.x + myObj.y + myObj.z);
    }
}
