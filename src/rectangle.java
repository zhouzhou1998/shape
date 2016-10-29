/**
 * Created by dell on 2016/10/27.
 */
public class rectangle extends shape {
    int length,width;
    public rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    double getArea() {
        return length*width;
    }
}
