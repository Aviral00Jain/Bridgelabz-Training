class FootballTeamHeight {

    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    
    public static double findMean(int[] heights) {
	 int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) min = heights[i];
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) max = heights[i];
        }
        return max;
    }

    public static void main(String[] args) {

        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);

        System.out.println("Player Heights:");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nShortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}