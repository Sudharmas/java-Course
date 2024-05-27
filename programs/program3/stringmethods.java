public class stringmethods {

    public static void main(String[] args) {
        String mystr = "sudharma";
        //.charAt();
        char result = mystr.charAt(0);
        System.out.println(result);


        String str2 = "hello";
        int r1 = str2.codePointAt(0);
        System.out.println(r1);


        String str3 = "hello";
//       fruits =  hello orange banana chickoo
        String fruits = str3.join("123","orange","banana","chickoo");
        System.out.println(fruits);




//        string1 = "sudharma"
//        string2 = "java"
//        sudharmajava
//        string1.concat(string2);
//        javasudharma
//        string2.concat(string1);


        String str5 = "john";
        String str6 = "doe";
        System.out.println(str5.concat(str6));


        String str7 = "hello";
//        str7.endsWith("ol") = true
        System.out.println(str7.endsWith("llo"));
        System.out.println(str7.endsWith("H"));


        String str8 = "hello";
        String str9 = "hello";
//        str8.equals(str9);
//        str9.equals(str8);
        System.out.println(str8.equals(str9));


        String str10 = "hello";
        System.out.println(str10.isEmpty());


        String mystr1 = "hello world";
        System.out.println("string length is: "+mystr1.length());


        String mystr2 = "HELLO";
        System.out.println(mystr2.toLowerCase());//hello = mystr2
        System.out.println(mystr2.toUpperCase());//HELLO


        String mystr3 = "     Hello world    ";
        System.out.println(mystr3);//without trim()
        System.out.println(mystr3.trim());
//        "    Hello world" = "hello world"
//        "Hello world     " = "hello world"
//        "hello      world" = "hello      world"
    }
}
