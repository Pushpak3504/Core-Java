class Mock {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=5, k=1 ; j>=i && k<=5; j--, k++) {
                System.out.print(k+"*");
            }
            
            for(int j=5, k=1 ; j>=i && k<=5; j--, k++) {
                System.out.print(k+"*");
            }
            System.out.println();

        }
    }
}