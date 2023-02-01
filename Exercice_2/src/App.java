public class App {
    public static void main(String[] args) throws Exception {
        String triangle = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                triangle += String.valueOf(i);
                
            }
            System.out.println(triangle);
            triangle=" ";
        }
    }
}
