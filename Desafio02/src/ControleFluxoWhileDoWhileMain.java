public class ControleFluxoWhileDoWhileMain {
    public static void main(String[] args) {

        //exemplo com while
        int x = 10;
        while (x<10) {
            System.out.println("item "+x);
            x++;
        }
        System.out.println("----------");
        //exemplo com do while
        int y = 10;
        do {
            System.out.println("item "+y);
            y++;
        } while (y<10);
    }
}
