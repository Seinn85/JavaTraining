import java.util.Stack;

public class Stack37{

    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserHistory(){
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        //最初に訪問したページはありません
        currentPage = null;
    }

    //新しいページにアクセス
    public void visitPage(String page) {
        if (currentPage != null) {
            //現在のページをバックスタックに保存する
            backStack.push(currentPage);
        }
        //現在のページを更新
        currentPage = page;
        //新しいページにアクセスしたため forwardStack をクリアします
        forwardStack.clear();
        printStatus("visit(\"" + page + "\")");
    }

    //可能であれば前のページに戻る
    public void goBack() {
        if (!backStack.isEmpty()) {
            //現在のページを forwardStack に保存する
            forwardStack.push(currentPage);
            // 最後のページを backStack から currentPage にポップします
            currentPage = backStack.pop();
        } else {
            //backStackが空の場合は何もしない
        }
        printStatus("back()");
    }

    //可能であれば次のページへ進んでする
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            //現在のページをバックスタックに保存する
            backStack.push(currentPage);
            //forwardStack から最後のページを currentPage にポップします
            currentPage = forwardStack.pop();
        } else {
            //forwardStackが空の場合は何もしない
        }
        printStatus("forward()");
    }

    //確認のために現在の状態を表示する
    private void printStatus(String operation) {
        System.out.println("Operation: " + operation);
        System.out.println("Current page: " + currentPage);
        System.out.println("Back stack: " + backStack);
        System.out.println("Forward stack: " + forwardStack);
        System.out.println("----------------------------------");
    }

    //サンプルシーケンスでロジックをテストするメインメソッド
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("Page A");
        browser.visitPage("Page B");
        browser.visitPage("Page C");
        browser.goBack();
        browser.goBack();
        browser.goForward();
        browser.visitPage("Page D");
    }
}