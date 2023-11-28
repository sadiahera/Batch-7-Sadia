package loopDemo;

public class LoopAlphabet {
       /*
    Write a program to print all alphabets from a to z.
     */

    public void Alphabet(){
        int i =0;
        for (i='A' ; i<='Z'; i++);{

            System.out.println("The alphabet from A to Z" + i);
        }


    }

    public static void main(String[] args) {
        LoopAlphabet obj= new LoopAlphabet();
        obj.Alphabet();
    }
}
