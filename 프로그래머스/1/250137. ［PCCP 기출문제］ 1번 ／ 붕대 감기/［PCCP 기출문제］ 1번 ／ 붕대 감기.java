class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;

        int t = 0;                      // 현재 시간
        int maxHealth = health;         // 최대 체력
        int consecutiveSuccessTime = 0; // 연속 성공 시간
        int idx = 0;

        while (t <= attacks[attacks.length - 1][0] && health > 0) {
            if (idx < attacks.length && attacks[idx][0] == t) {
                health -= attacks[idx][1];
                consecutiveSuccessTime = 0;
                idx++;
            } else {
                if (++consecutiveSuccessTime >= bandage[0]) {
                    // 연속 성공
                    health = Math.min(health + bandage[1] + bandage[2], maxHealth);
                    consecutiveSuccessTime = 0;
                } else {
                    health = Math.min(health + bandage[1], maxHealth);

                }
            }
            t++;
        }

        answer = health <= 0 ? -1 : health;
        return answer;
    }
}