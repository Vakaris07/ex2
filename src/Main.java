public class Main {
    public static void main(String[] args) {
        String str1="apple";
        String str2="APPLE";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(str1.indexOf("e"));
        System.out.println(str1.replace("a","o"));

    }
}