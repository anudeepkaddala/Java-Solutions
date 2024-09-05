class Box{
    static int length=10,breadth=10,height=10,vol;
    public static void findVolume(){
        vol=length*breadth*height;
        System.out.println("Volume is calculated");

    }
    public static void displayVolume(){
        System.out.println(vol);
    }
    public static void dimensionsDisplay(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }
}
public class BoxFinal{
    public static void main(String[] args) {
        Box.findVolume();
        Box.displayVolume();
        Box.dimensionsDisplay();
    }
}