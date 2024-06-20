package Lab11;

import java.util.Arrays;

class Lab11 {
    public static void main(String[] args) {

        q1_let_s_count();
        q2_transpose();
        q3_scenario_2();

    }

    static void q1_let_s_count() {
        int[][] map = { { 0, 1, 9, 1, 0, 0, 2, 9, 4, 2, 1, 0, 0 },
                { 1, 3, 3, 3, 1, 1, 2, 9, 9, 9, 1, 0, 0 },
                { 2, 9, 9, 3, 9, 3, 2, 3, 4, 4, 2, 1, 0 },
                { 3, 9, 4, 4, 9, 9, 2, 2, 9, 5, 9, 2, 0 },
                { 2, 9, 2, 2, 9, 9, 2, 2, 9, 9, 9, 3, 0 },
                { 1, 1, 1, 1, 2, 2, 2, 3, 5, 6, 9, 2, 0 },
                { 0, 0, 0, 0, 0, 0, 2, 9, 9, 9, 2, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 2, 9, 9, 3, 1, 0, 0 } };
        int fiaanal = let_s_count(map);
        System.out.println(fiaanal);
    }

    static int let_s_count(int[][] map) {
        int count = 0;
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++)
                if (map[row][col] == 9) {
                    count++;
                }
        }
        return count;

    }

    static void q2_transpose() {
        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] data_t = transpose(data);
        for (int[] row : data_t)
            System.out.println(Arrays.toString(row));
    }

    static int[][] transpose(int[][] input) {
        int[][] ans = new int[input[0].length][input.length];
        for (int row = 0; row < input.length; row++)
            for (int col = 0; col < input[0].length; col++)
                ans[col][row] = input[row][col];
        return ans;

    }

    static void q3_scenario_2() {
        int[] team_id = { 22, 11, 33 };
        int[] points = { 88, 99, 77 };
        by_points(team_id, points);
        for (int i = 0; i < points.length; i++)
            System.out.println("team_id " + team_id[i] + " points " + points[i]);

    }

    static void by_points(int[] team, int[] points) {
        int maxpoint;
        for (int i = 0; i < team.length; i++) {
            maxpoint = i;
            for (int j = i + 1; j < points.length; j++) {
                if (points[j] > points[maxpoint]) {
                    maxpoint = j;
                }
            }
            int tmp = points[i];
            points[i] = points[maxpoint];
            points[maxpoint] = tmp;

            tmp = team[i];
            team[i] = team[maxpoint];
            team[maxpoint] = tmp;

        }
    }
}
