package loopDemo;

public class LoopMyname {
     /*
    Write your name and check if there is/are any vowels there. if found print them.
    My name =SADIA
    Vowel=A ,I
     */


    public void Mynamevowels(){
        char ai = 'i';
        if ((ai == 'a' || ai =='i'));{
            System.out.println(ai + "is vowel");
        }


    }

    public static void main(String[] args) {
        LoopMyname obj = new LoopMyname();
        obj.Mynamevowels();
    }
}
