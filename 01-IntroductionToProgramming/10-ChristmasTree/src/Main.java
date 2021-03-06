public class Main {
    public static final int SEGMENTS = 3;
    public static final int HEIGHT = 3;

    public static void main(String[] args) {
        int maxSize = 1 + 2 * (SEGMENTS - 1) + 2 * (HEIGHT - 1);
        // for each segment beyond zero, we need 2 more asterisks.
        for (int segmentContrib = 0; segmentContrib < 2 * SEGMENTS; segmentContrib += 2) {
            // for each segment slice beyond zero, we need 2 more asterisks.
            for (int sliceContrib = 0; sliceContrib < 2 * HEIGHT; sliceContrib += 2) {
                drawCentered(maxSize, 1 + segmentContrib + sliceContrib);
            }
        }
        // draw the trunk
        drawCentered(maxSize, 1);
        drawCentered(maxSize, 1);
        // draw the base
        drawCentered(maxSize, 7);
    }
    private static void drawCentered(int size, int asterisks) {
        int before = (size - asterisks) / 2;
        int after = size - before - asterisks;
        print(before, " ");
        print(asterisks, "*");
        print(after, " ");
        System.out.println();
    }

    private static void print(int count, final String character) {
        for (int i = 0; i < count; i++) {
            System.out.print(character);
        }
    }

}