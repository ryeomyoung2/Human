package Exam_01;

public class Exam_013 {

	public static void main(String[] args) {
       byte var1 = -128;
       byte var2 = -30;
       byte var3 = 0;
       byte var4 = 30;
       byte var5 = 127;
       
       System.out.println(var1);
       System.out.println(var2);
       System.out.println(var3);
       System.out.println(var4);
       System.out.println(var5);
       
       byte var6 = 125;
       int var7 = 125;
       for(int i=0; i<5; i++) {
    	   var6++;
    	   var7++;
    	   System.out.println(  "var6: "+ var6 + "\t" + "var7: "+ var7);
       }
       
       
       char c1 = 'A';
       char c2 = 65;
       char c3 = '\u0041';
       
       char c4 = '가';
       char c5 = 44032;
       char c6 = '\uac00';
       
       int uniCode = c1;
       
       System.out.println("\n" + c1);
       System.out.println(c2);
       System.out.println(c3);
       System.out.println(c4);
       System.out.println(c5);
       System.out.println(c6);
       System.out.println(uniCode);
       
       int var8 = 10;
       int var9 = 012;
       int var10 = 0xA;
       
       System.out.println("\n" + var8);
       System.out.println(var9);
       System.out.println(var10);
       
       long var11 = 10;
       long var12 = 20L;
 //    long var13 = 10000000000;
       long var14 = 10000000000L;
       
       System.out.println("\n" + var11);
       System.out.println(var12);       
//     System.out.println(var13);
       System.out.println(var14);
       
       double var15 = 3.14;
//     float var16 = 3.14;
       float var17 = 3.14f;
     
       double var18 = 0.1234567890123456789;
       float var19 = 0.1234567890123456789f;
       
       System.out.println("var15 : "+var15);
       System.out.println("var17 : "+var17);
       System.out.println("var18 : "+var18);
       System.out.println("var19 : "+var19);
       
       int var20 = 3000000;
       double var21 = 3e6;
       float var22 = 3e6f;
       double var23 = 2e-3;
       
       System.out.println("var20 : "+var20);
       System.out.println("var21 : "+var21);
       System.out.println("var22 : "+var22);
       System.out.println("var23 : "+var23);
       
       
       boolean stop = true;
       if(stop) {
    	   System.out.println("중지합니다.");
       } else {
    	   System.out.println("시작합니다");
       }
        
       byte byteValue = 10;
       int intValue = byteValue;
       System.out.println("\n" + intValue);
       
       char charValue = '가';
       intValue = charValue;
       System.out.println("가의 유니코드 = " + intValue);
       
       intValue = 500;
       long longValue = intValue; 
       System.out.println(longValue);
       
       intValue = 200;
       double doubleValue = intValue;
       System.out.println(doubleValue);
       
      
	}

}
