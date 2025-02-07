//chukalay logic laav Date : 25-01-2025

class PassOrFail {
    public static void main(String[] args) {
        float marks = 250f;
        int totalMarks = 600;

        float percent = (marks/totalMarks)*100;
        

        String str = (percent >= 75)?
        ("The Student got "+percent+" and student is passed with A grade"):
        ((percent < 75 && percent >= 55)?
        ("The Student got "+percent+" and student is passed with B grade"):
        ((percent < 55 && percent >= 35)?
        ("The Student got "+percent+" and student is passed with C grade"):
        ("The Student got "+percent+" and Student is Failed")));
        System.out.println(str);
    }
}
