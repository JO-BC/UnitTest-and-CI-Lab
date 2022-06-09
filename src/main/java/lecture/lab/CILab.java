package lecture.lab;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    //test
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        return false;
    }

}

