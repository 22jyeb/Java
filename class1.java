public class demo {
    public static void main(String[] args) {
        // 学生答案二维数组
        char[][] studentAnswers = {
                {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'},
                {'D', 'C', 'B', 'A', 'A', 'D', 'C', 'B', 'A', 'B'},
                {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'},
                {'A', 'A', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'},
                {'D', 'B', 'C', 'A', 'A', 'D', 'C', 'B', 'A', 'D'}
        };

        // 标准答案一维数组
        char[] correctAnswers = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};

        // 计算每位学生答对的题目数量
        for (int i = 0; i < studentAnswers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] == correctAnswers[j]) {
                    correctCount++;
                }
            }
            System.out.println("学生 " + (i + 1) + " 答对了 " + correctCount + " 题");
        }
    }
}
