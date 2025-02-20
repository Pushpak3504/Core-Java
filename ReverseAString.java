public class ReverseAString {
    public static void main(String[] args) {
        String str = "NITIN";
        String rev = "";
        for(int i=0; i<str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        
        if(rev.equals(str)) {
            System.out.println("String is Pallindrome");
        }
        else {
            System.out.println("String is Not Pallindrome");
        }
    }
}
