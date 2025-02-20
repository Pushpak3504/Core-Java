public class Patterns {

    public static void trinangle1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTrinagle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydsTringle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }

    public static void alphabetPattern(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'a';
            for(int j=1; j<=i; j++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
    public static void alphabetPattern2(int n) {
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
                if((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    
    public static void floydsTringle22(int n) {
        int num = 2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num +" ");
                num+=2;
            }
            System.out.println();
        }
    }

    public static void floydsTringle23(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num +" ");
                num+=2;
            }
            System.out.println();
        }
    }

    public static void alphaCharPattern254(int n) {
        char ch = 'a';
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2 != 0) {
                    System.out.print(ch++ +" ");
                }
                else {
                    System.out.print(num++ +" ");
                }
            }
            System.out.println();
        }
    }

    public static void patternTricks1() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTricks2() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTricks3() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTricks4() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void patternTricksTrinagle1() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTricksTrinagle2() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowTriangle2(int n ) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i == 5 || j == 1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void hollowTriangle1(int n ) {
        for(int i=1; i<=n; i++) {
            // for(int j=1; j<=n-i; j++) {
            //     System.out.print("  ");
            // }
            for(int j=1; j<=i; j++) {
                if(i == 5 || j == 1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } 

    public static void hollowTriangle3(int n ) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i == 5 || j == 1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowTriangle4(int n ) {
        for(int i=n; i>=1; i--) {
            // for(int j=1; j<=n-i; j++) {
            //     System.out.print("  ");
            // }
            for(int j=1; j<=i; j++) {
                if(i == 5 || j == 1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void combinationPyramid() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
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
    public static void combinationPyramid2() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void combinationPyramid3() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    public static void combinationPyramid4() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void combinationPyramid5() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
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
    
    public static void diamondPatternHollow() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1 || i==j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(i==5 || j == 1 || i==j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void combinationPyramidHollow() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1  || i == 5) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            for(int j=2; j<=i; j++) {
                if( i==j || i == 5) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void combinationPyramidHollow2() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1   || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1  || i == 5 || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    
    public static void combinationPyramidHollow3() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                if(j == 1   || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(j == 1  || i == 5 || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    
    public static void combinationPyramidHollow5() {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1  || i == 5 ) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            for(int j=2; j<=i; j++) {
                if( i == 5 || i == j) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        combinationPyramidHollow2();
        System.out.println("----------------------------------------");
        combinationPyramidHollow3();
        System.out.println("----------------------------------------");
        combinationPyramidHollow5();
        
    }
}
