
package blockshifter.control;

import blockshifter.model.Block;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/13 08:58 GMT
 *
 */

public class DownCommand implements Command{
    private final Block block;
    public DownCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute(){
        block.down();
    }
}
