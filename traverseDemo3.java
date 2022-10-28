package array.create;

public class traverseDemo3 {
    public static void main(String[] args) {
        //求最大值
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
        int max = faceScores[0];
        for (int i = 0; i < faceScores.length; i++) {
                if(faceScores[i] > max) {
                    max = faceScores[i];
                }
        }System.out.println(max);

        }
    }

