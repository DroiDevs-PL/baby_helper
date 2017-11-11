package pl.droidevs.babyhelper.main.mvp;

public class MainModel {

    private static final String TEST_TEXT = "Test ";
    private static int counter;

    public String getTestText(){
        counter++;
        return TEST_TEXT + counter;
    }

    public String getTestText(int i){
        counter = i;
        return TEST_TEXT + counter;
    }
}
