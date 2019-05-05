/**
 * 
 * @author Bassam Aldalati this class describe how string class work and will
 *         see the different between the stringBuilder and String
 */

public class UnderstandStringClass {

    public static void main(String[] args) {

        // once string object is create its not allow to change Example

        String name = "Bassam";
        name.concat("dalati");

        System.out.println(name);
        // did you say bassam yes good String class is immutable
        name = name.concat(" aldalati");
        // did you say bassam aldalati good now create new instance in heap
        // memory and name refer to new instance
        System.out.println(name);

        // method chaining create multiple method in the same string
        String start = "Animal   ";
        String trim = start.trim();
        String lowercase = trim.toLowerCase();
        String result = lowercase.replace('a', 'A');

        System.out.println(result);

        // this equivalent
        // its also create four String objects and output AnimAl

        String theSameResult = "Animal  ".trim().toLowerCase().replace('a', 'A');

        String understandWithOutStringbuilder = understandWithOutStringbuilder();

        System.out.println(understandWithOutStringbuilder);

        StringBuilder understandWithStringbuilder = understandWithStringbuilder();
        System.out.println(understandWithStringbuilder);
    }

    /*
     * each time we create String object her we create 27 objects this is very
     * inefficient
     */
    private static String understandWithOutStringbuilder() {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha = alpha + current;
        }
        return alpha;
    }

    /**
     * the same object her we append char to this object its efficient solution 
     * @return StringBuilder
     */
    private static StringBuilder understandWithStringbuilder() {
        StringBuilder alph = new StringBuilder();

        for (char current = 'a'; current <= 'z'; current++) {
            alph.append(current);
        }

        return alph;
    }
}
