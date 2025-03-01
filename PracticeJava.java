public class PracticeJava {
    public static void square(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowSquare(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reflectedHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseHalfPyramid(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseReflectedHalfPyramid(int n ) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i==n || j==1 || j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowHalfPyramidReversed(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(i==n || j==1 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowHalfPyramidReflected(int n) {
        for(int i=1)
    }
    public static void main(String[] args) {
        int n = 5;
        // square(n);
        // hollowSquare(n);
        // halfPyramid(n);
        // reflectedHalfPyramid(n);
        // reverseHalfPyramid(n);
        // reverseReflectedHalfPyramid(n);
        // hollowHalfPyramid(n);
        hollowHalfPyramidReversed(n);
    }
}
