public class StrBuff2 {
    public static void main(String[] args) {
        StrBuff2 t = new StrBuff2();
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("Before = " + sb);
        t.doTest(sb);
        System.out.println("After = " + sb);
    }
    void doTest(StringBuffer theSb){
        theSb.append("-bbb");
    }
}
