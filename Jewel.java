
public class Jewel {

    public static void main(String[] args) {
        String J = "SD";
        String S = "aaAASD";

        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();

        int jSize = jArray.length;
        int sSize = sArray.length;
        int totalJewels = 0;

        for (int i = 0; i < jSize; i++) {
            for (int j = 0; j < sSize; j++) {
                if (jArray[i] == sArray[j]) {
                    totalJewels++;
                }
            }
        }

        System.out.println("Total no of Jewels : " + totalJewels);

    }

}
