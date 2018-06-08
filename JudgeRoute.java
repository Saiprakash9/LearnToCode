
public class JudgeRoute {

    public static void main(String[] args) {

        String moves = "LDRRLRUULRLD";
        boolean pos = checkPos(moves);
        System.out.println("Returned to the original pos: " + pos);

    }

    private static boolean checkPos(String moves) {
        int n = moves.length();
        int countL = 0;
        int countR = 0;
        int countU = 0;
        int countD = 0;
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'U') {
                countU++;
            }
            if (moves.charAt(i) == 'D') {
                countD++;
            }
            if (moves.charAt(i) == 'L') {
                countL++;
            }
            if (moves.charAt(i) == 'R') {
                countR++;
            }
        }
        if (countU == countD && countL == countR) {
            return true;
        }
        return false;
    }

}
