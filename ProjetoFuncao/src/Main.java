public class Main {
    public static void main(String[] args) {
        
    }

    public static int contVogais(String s) {
        int counter = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

}
