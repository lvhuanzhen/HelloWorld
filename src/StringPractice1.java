public class StringPractice1 {
    public static void main (String[] args){

        char c = 'a';//a=97 A=65
        int num =10;
        String str ="hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a
    }
}
