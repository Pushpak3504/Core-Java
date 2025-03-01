class Practice1 {
    
    public static void rightAngleTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleWithNum(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleWithIncreasingNum(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }

    public static void triangleWithAlphabets(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'a';
            for(int j=1; j<=i; j++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }

    public static void tringleWithAlphabetsIncreasing(int n) {
        char ch = 'a';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }

    public static void zoPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void evenPattern(int n) {
        int num = 2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }

    public static void oddPattern(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
    public static void charNumberPattern(int n) {
        int num = 1;
        char ch = 'a';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2 == 0) {
                    System.out.print(num++ +" ");
                }
                else {
                    System.out.print(ch++ +" ");
                }
            }
            System.out.println();
        }
    }

    public static void spaceTriangle(int n) {
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

    public static void spaceTriangleInverted(int n) {
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

    public static void triangleInvertedWithoutSpace(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void properTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseProperTringle(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRightAngleTringle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j == 1 || i == 5 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRightAngleTringleInverted(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i==n || j==i|| j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRightAngleTringleInvertedReversed(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1 || i == n || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRightAngleTringleReversed(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(i == n || i == j || j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=2; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidRightRotated(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidLeftRotated(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reversePyramid(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=2; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if( i == j || j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if( i == j || j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i == n || j == 1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(int j=2; j<=i; j++) {
                if(i == n || j == 1 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowPyramidRightRotated(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j==1 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j==1 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowPyramidLeftRotated(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j == 1 || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(j == 1 || i == j) 
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hollowPyramidInverted(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i == n || j == 1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for(int j=2; j<=i; j++) {
                if(i == n || j == 1 || i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        rightAngleTriangle(n);
        System.out.println("-------------------------------------------------------------");
        rightAngleTriangleWithNum(n);
        System.out.println("-------------------------------------------------------------");
        rightAngleTriangleWithIncreasingNum(n);
        System.out.println("-------------------------------------------------------------");
        triangleWithAlphabets(n);
        System.out.println("-------------------------------------------------------------");
        tringleWithAlphabetsIncreasing(n);
        System.out.println("-------------------------------------------------------------");
        zoPattern(n);
        System.out.println("-------------------------------------------------------------");
        evenPattern(n);
        System.out.println("-------------------------------------------------------------");
        oddPattern(n);
        System.out.println("-------------------------------------------------------------");
        charNumberPattern(n);
        System.out.println("-------------------------------------------------------------");
        spaceTriangle(n);
        System.out.println("-------------------------------------------------------------");
        spaceTriangleInverted(n);
        System.out.println("-------------------------------------------------------------");
        triangleInvertedWithoutSpace(n);
        System.out.println("-------------------------------------------------------------");
        properTriangle(n);
        System.out.println("-------------------------------------------------------------");
        reverseProperTringle(n);
        System.out.println("-------------------------------------------------------------");
        hollowRightAngleTringle(n);
        System.out.println("-------------------------------------------------------------");
        hollowRightAngleTringleInverted(n);
        System.out.println("-------------------------------------------------------------");
        hollowRightAngleTringleInvertedReversed(n);
        System.out.println("-------------------------------------------------------------");
        hollowRightAngleTringleReversed(n);
        System.out.println("-------------------------------------------------------------");
        diamond(n);
        System.out.println("-------------------------------------------------------------");
        pyramid(n);
        System.out.println("-------------------------------------------------------------");
        pyramidRightRotated(n);
        System.out.println("-------------------------------------------------------------");
        pyramidLeftRotated(n);
        System.out.println("-------------------------------------------------------------");
        reversePyramid(n);
        System.out.println("-------------------------------------------------------------");
        hollowDiamond(n);
        System.out.println("-------------------------------------------------------------");
        hollowPyramid(n);
        System.out.println("-------------------------------------------------------------");
        hollowPyramidRightRotated(n);
        System.out.println("-------------------------------------------------------------");
        hollowPyramidLeftRotated(n);
        System.out.println("-------------------------------------------------------------");
        hollowPyramidInverted(n);
        System.out.println("-------------------------------------------------------------");
    }
}
