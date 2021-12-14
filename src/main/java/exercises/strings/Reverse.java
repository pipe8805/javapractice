package exercises.strings;

public class Reverse {

    public static void main(String[] args) {

        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);


        StringBuffer sb = new StringBuffer(blogName);
        System.out.println("Reverse of java2blog is:" + sb.reverse());

    }
}
