package beakjoon_1309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());

      int[][] dp = new int[n + 1][3];

      dp[0][0] = 1;
      dp[0][1] = 1;
      dp[0][2] = 1;

      for (int i = 1; i <= n; i++) {
         dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
         dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
         dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
      }

      System.out.println(dp[n][0]);

   }
}