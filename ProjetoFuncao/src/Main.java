public class Main {
    public static void main(String[] args) {

    }
  
    public static boolean isPar(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }

    public static String inverteString(String s) {

        s = new StringBuilder(s).reverse().toString();
        return s;
    }

    public static double media(int num1, int num2, int num3, int num4) {
        double result = (num1 + num2 + num3 + num4) / 4;
        return result;
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

    public static int fatorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}

