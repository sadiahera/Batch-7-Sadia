package arrayPractic;

public class ArrayDemo {

    //array can hold multiple elements.
    // Array length is fixed.

   String[] studentName = {"Sadia , Fyza, Dharti, Lota, Jannat"}; // Array data
    //studentName is arrayVariable
    // we can not add or remove any element later.
    String location = "Texas";

    public void arr(){
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
       //System.out.println(studentName[4]);
        System.out.println(studentName.length);
        //  System.out.println(location);


    }

    public static void main(String[] args) {

        ArrayDemo obj = new ArrayDemo();
        obj.arr();
    }


}
