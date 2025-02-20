public class AnyDataTypeInArray {
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        arr[0] = "jkfghfg";
        arr[1] = 1L;
        arr[2] = 7.44;
        arr[3] = 'A';
        for(Object a :arr){
            System.out.println("ARRAY VALUE :."+a.toString());
        }

        int a = 0764;

        System.out.println("PRINTING INTEGER :"+a);

    }
}
