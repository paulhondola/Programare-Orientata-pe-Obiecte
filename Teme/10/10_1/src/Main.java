public class Main {
    public static void main(String argv[]) {
        try {
            int i;
            for(i = 0; i < 4; i++) {
                if(i == 2) throw new L1();
                else if(i == 3) throw new L2();
            }
        } catch(L1 e) {
            System.out.println(e);
        } catch(L2 e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}