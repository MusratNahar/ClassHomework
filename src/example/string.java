package example;

public class string {
    public static void main(String[] args) {


        String a = " hellogoodmorning";
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("e"));
        System.out.println(a.substring(3,6));
        System.out.println(a.substring(5));
        System.out.println(a.concat("rahul teaches"));
        System.out.println((a.length()));
        System.out.println((a.trim()));
        System.out.println((a.toUpperCase()));
        System.out.println((a.toLowerCase()));
        String arr[]=a.split("d");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println((a.replace("g", "e")));
    }
}