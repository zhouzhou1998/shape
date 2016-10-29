/**
 * Created by dell on 2016/10/27.
 */
public class circle extends shape {
    private int r;
    public circle (int r){
        this.r=r ;
    }

    @Override
    double getArea() {
        return r*r*3.14;
    }
}