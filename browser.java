import java.util.Stack;
class Browser {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = "Home";
    public void visit(String page) {
        backStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
        System.out.println("Visiting: " + currentPage);
    }
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Going Back to: " + currentPage);
        } else {
            System.out.println("No previous pages available!");
        }
    }
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Going Forward to: " + currentPage);
        } else {
            System.out.println("No next pages available!");
        }
    }
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.visit("Page 1");     
        browser.visit("Page 2");    
        browser.visit("Page 3");     
        browser.goBack();            
        browser.goBack();           
        browser.goForward();         
        browser.visit("Page 4");     
        browser.goBack();            
    }
}
