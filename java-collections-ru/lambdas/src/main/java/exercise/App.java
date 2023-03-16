package exercise;

import java.util.Arrays;

// BEGIN
class App {

    public static void main(String[] args) {

        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        System.out.println(Arrays.deepToString(image));

        String[][] enlargedImage = enlargeArrayImage(image);
        System.out.println(Arrays.deepToString(enlargedImage));
    }

    public static String[][] enlargeArrayImage(String[][] image) {
        return image;
    }
}
// END
