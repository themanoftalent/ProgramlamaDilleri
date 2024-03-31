public class car {
    public static void main(String[] args) {
        essentials car1 = new essentials();
        essentials car2 = new essentials();
        essentials car3 = new essentials();
    }

    static class essentials {
        static int chassis;
        int whichyear;

        public essentials() {
            whichyear = chassis;
            chassis++;

        }
    }
}
