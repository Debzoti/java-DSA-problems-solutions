package arshGoyalSheet.DP;

import java.util.*;

public class CountPermutations {
    public static void main(String[] args) {
        int[] complexity = { 38, 223, 100, 123, 406, 234, 256, 93, 222, 259, 233, 69, 139, 245, 45, 98, 214 };
        System.out.println(countPermutations(complexity));

    }

    static int countPermutations(int[] complexity) {
        Map<Set<Integer>, Integer> dp = new HashMap<>();
        Set<Integer> unlockedSet = new HashSet<>();
        int MOD = 1_000_000_007;
        unlockedSet.add(0);

        return dfs(complexity, unlockedSet, dp, MOD);

    }

    static int dfs(int[] complexity, Set<Integer> unlockedSet, Map<Set<Integer>, Integer> dp, int MOD) {
        // base case
        // if all computers are unlocked
        if (unlockedSet.size() == complexity.length) {
            return 1;
        }

        // check if we visited the sate before or niot
        if (dp.containsKey(unlockedSet)) {
            return dp.get(unlockedSet);
        }

        int count = 0;

        for (int i = 0; i < complexity.length; i++) {
            // chcek if computer already unlocked or not
            if (unlockedSet.contains(i)) {
                continue;
            }

            // chcej if we can unlock it or not
            if (canUnlock(complexity, unlockedSet, i)) {
                // unock it
                unlockedSet.add(i);
                // go for other locked ones
                count = (count + dfs(complexity, unlockedSet, dp, MOD)) % MOD;

                // backtraxck for other valid sequences
                unlockedSet.remove(i);

            }

        }
        dp.put(new HashSet<>(unlockedSet), count);
        return count;
    }

    static boolean canUnlock(int[] complexity, Set<Integer> unlockedSet, int i) {
        // check upto 0 to i can be unlcolked or not
        for (int j = 0; j < i; j++) {
            if (unlockedSet.contains(j) && complexity[j] < complexity[i]) {
                return true;
            }
        }

        return false;
    }
}