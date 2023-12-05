package stringFunction;

public class StringFunctionDemo {
//TestNG is a testing fram work.

    public void String (String[] args) {
        String obj = new String("Sadia");

        char firstLetter = obj.charAt(0);
        System.out.println(firstLetter);

        int length = obj.length();
        System.out.println(length);

        String lower = obj.toLowerCase();
        System.out.println(lower);

        String upper = obj.toUpperCase();
        System.out.println(upper);

        String newSpelling = obj.replace('i', 'e');
        System.out.println(newSpelling);

        String fullName = obj.concat("Sadia");
        System.out.println(fullName);

        String[] twoNames = fullName.split("");
        System.out.println(twoNames[0]);
        System.out.println(twoNames[1]);

    }

    public static void StringFunction2() {
        String firstString = "We are learing Java as part of the Automation Course";
        firstString.toUpperCase(); // calling the method java created
        firstString.toLowerCase();
        firstString.length();
        char firstLetter = firstString.charAt(0);
        System.out.println(firstLetter);
       String oneWord= firstString.substring(3,5);// substring starts with 0,
        // and ends with index+1
        System.out.println(oneWord);

       boolean javaWord= firstString.contains("java");
        System.out.println(javaWord);

        String []words = firstString.split("");
        System.out.println(words.length);
    }




    public static void main(String[] args) {
        StringFunction2();// calling the method I created


    }

}
