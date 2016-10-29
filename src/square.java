/**
 * Created by dell on 2016/10/27.
 */
public class square extends shape {
    public int length;
    public square (int length){
        this.length=length;
    }

    @Override
    double getArea() {
        return length*length;
    }
}
