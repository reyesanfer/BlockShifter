
package blockshifter.control;

import blockshifter.model.Block;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/13 08:59 GMT
 *
 */

public class RightCommand implements Command{
    private final Block block;

    public RightCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute(){
        block.right();
    }
}
