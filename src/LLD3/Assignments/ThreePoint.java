package LLD3.Assignments;

public class ThreePoint extends Point {
    // write the code of Threedpoint class here
    private int z;

    public void display(){
        System.out.println("["+super.x+", "+super.y+", "+this.z+"]");
    }

    public static void main(String[] args) {
        ThreePoint tp = new ThreePoint();
        tp.x = 10;
        tp.y = 20;
        tp.z = 30;

        tp.display();
    }
}
