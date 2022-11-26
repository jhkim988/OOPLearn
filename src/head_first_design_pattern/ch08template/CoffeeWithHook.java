package head_first_design_pattern.ch08template;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");        
    }

    @Override
    void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");        
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.print("커피에 우유와 설탕을 넣을까요?(Y/N)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
