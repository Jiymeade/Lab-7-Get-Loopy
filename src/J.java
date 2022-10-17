public class J {
    public static void main(String[] args) {
        int col, row;
        for (col = 0; col <= 11; col++) {
            for (row = 0; row <= 6; row++) {
                if (col >= 0 && col < 2 || col >= 2 && col <= 9 && row == 3 || col >= 7 && col <= 9 && row == 0 || col > 9 && col<= 11 && row <= 3) {
                    System.out.printf("***");
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.printf("\n");
        }
    }
}
