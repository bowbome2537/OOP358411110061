package lab6;

import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String myMsg = "I am rung";
        StringBuffer strBuf = new StringBuffer(myMsg);

        System.out.println(strBuf);//พิมพ์คำที่โค้ดไว้
        System.out.println(strBuf.reverse());//สลับคำจากหลังไปหน้า

        strBuf.append("Hello");
        System.out.println(strBuf);//ใช้ในการสลับตัวอักษร

        //
        StringTokenizer token = new StringTokenizer(strBuf.toString());

        System.out.println(token);
        System.out.println(token.countTokens());//นับจำนวนคำโดยดูจากการเคาะ

        while (token.hasMoreElements()){
            System.out.println(token.nextToken());//แยกคำแต่ละบรรทัด
        }
    }//main
}//class
