package org.abc.CollectionApi;

import java.util.HashMap;

public class Test06 {
    public static void main(String[] args) {
        String[] word={"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
        String[] meaning= {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};

        HashMap<String, String> dic=new HashMap<>();
        for(int i=0; i<word.length; i++) {
            dic.put(word[i], meaning[i]);
        }

        System.out.println(dic);
        System.out.println(dic.size());

        System.out.println(dic.keySet());//key 값들만 반환
        System.out.println(dic.values());//value 값들만 반환

        System.out.println("HEAVEN : "+dic.get("HEAVEN"));
        dic.replace("HEAVEN", "아주 행복한 감정"); //첫번째 인자 , 키값을 두번째 인자 value로 바꿈
        System.out.println("HEAVEN : "+dic.get("HEAVEN"));
        dic.put("HEAVEN", "이상적인 세상");
        System.out.println("HEAVEN : "+dic.get("HEAVEN"));

        System.out.println(dic.containsKey("BUMBLEBEE"));
        System.out.println(dic.containsValue("자장가"));

        dic.remove("HEAVEN");
        System.out.println(dic.containsKey("BUMBLEBEE"));
        System.out.println(dic);

        dic.clear();;
        System.out.println(dic.isEmpty());
        System.out.println(dic.size());
    }
}
