package blockshifter.view;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/13 08:56 GMT
 *
 */

public interface BlockDisplay{
    public static final int SIZE = 100;
    public void paintBlock(int x, int y);
    public void on(Moved moved);
    
    public interface Moved{
        void to(int x, int y);
        
    }
}
