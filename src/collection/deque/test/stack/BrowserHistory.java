package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String browser) {
        if (currentPage != null) {
            stack.push(currentPage);
        }
        currentPage = browser;
        System.out.println("방문 : " + browser);
    }

    public String goBack() {
        if (!stack.isEmpty()) {
            currentPage = stack.pop();
            System.out.println("뒤로 가기 : " + currentPage);
            return currentPage;
        }
       return null;
    }
}
