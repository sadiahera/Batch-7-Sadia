package arrayPractic;

public class ArrayDemo {
   String[] studentName = {"Sadia , Fyza, Dharti, Lota, Jannat"}; // Array data
    //studentName is arrayVariable
    String location = "Texas";

    public void arr(){
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);

      //  System.out.println(location);
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
    }


}
