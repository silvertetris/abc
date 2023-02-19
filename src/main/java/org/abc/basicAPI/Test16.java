package org.abc.basicAPI;

import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {
        int score[] = {85, 90, 95, 100, 75};
        int score2[] = Arrays.copyOf(score, score.length);//score 배열에서부터 score.length 인덱스까지 복사
        int score3[] = Arrays.copyOfRange(score, 3, 5);//score 배열에서 3인덱스부터 5인덱스까지 복사

        int score4[] = new int[score.length]; //그냥 score.length 길이의 배열 선언
        System.arraycopy(score, 0, score4, 0, score.length);//score를 score4에 score.length 길이를 복사 (0에서부터)
        //인자 첫번째 부터 순서대로 ->복사할 원본, 복사할 원본의 시작 위치, 복사될 대상, 복사될 곳의 시작 위치, 복사할 배열의 길이
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(score2));
        System.out.println(Arrays.toString(score3));
        System.out.println(Arrays.toString(score4));

        System.out.println(Arrays.equals(score, score2));

        Arrays.sort(score);//오름차순
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.equals(score, score2));
        int index = Arrays.binarySearch(score, 100);//search for the key(100) in "score" array
        System.out.println(index);
    }
}
