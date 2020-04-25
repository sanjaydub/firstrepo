package my.main.dev;

public class Rectangle {
    private int len;
    private  int bre;

    public Rectangle(int len, int bre) {
        this.len = len;
        this.bre = bre;
    }

    public int calculateArea(){
        return len*bre;
    }

    public int calculatePerimeter(){
        return 2*(len+bre);
    }
}
