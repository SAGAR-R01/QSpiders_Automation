public class Shape {
    public static void main(String[] args) {
        // Define the shape of the heart and the word "SAGAR" inside it
        String[] heartShape = {
                "   **    **     ",
                "****** ******  ",
                "***************",
                "***************",
                "***************",
                " ************* ",
                "  ***********  ",
                "    *******    ",
                "      ***      ",
                "       *       "
        };

        String[] sagarWord = {
                "   SSS  A   GGG  A  RRRR  ",
                "  S   S A A G   G A A R   R ",
                "  S     AAA G     A A RRRR  ",
                "   SSS A   A GGGG A   A R  R ",
                "       A   A  GG  A   A R   R"
        };

        // Print the heart shape with the word "SAGAR" inside it
        for (int i = 0; i < heartShape.length; i++) {
            System.out.print(heartShape[i]);
            if (i < sagarWord.length) {
                System.out.print(sagarWord[i]);
            }
            System.out.println();
        }
    }
}
