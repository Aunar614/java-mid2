package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();

        System.out.println("== 단어 입력 단계 ==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String englishWord = sc.nextLine();
            if (englishWord.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String koreanWord = sc.nextLine();

            dictionary.put(englishWord, koreanWord);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String searchWord = sc.nextLine();
            if (searchWord.equals("q")) {
                break;
            }
            if (dictionary.containsKey(searchWord)) {
                String koreanWord = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻 : " + koreanWord);
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }

        System.out.println("사전을 종료합니다.");
    }
}
