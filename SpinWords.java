public class SpinWords {
    public static void main(String[] args) {
        String sentence = "String sentence";
        System.out.println(spinWords(sentence));
    }

    public static String spinWords(String sentence) {

        String[] str = sentence.split(" ");
        String result = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 5) {
                for (int j = str[i].length() - 1; j >= 0; j--) {
                    result = result + str[i].charAt(j);
                }
                if (str.length == i + 1) {
                    result = result;
                } else {
                    result = result + " ";
                }
            } else {
                if (str.length == i + 1) {
                    result = result + str[i];
                } else {
                    result = result + str[i] + " ";
                }
            }
        }
        return result;
    }
}