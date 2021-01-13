
package blockshifter.control;

import blockshifter.model.Block;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/13 08:57 GMT
 *
 */

public class UpCommand implements Command{
    private final Block block;

    public UpCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute(){
        block.up();
    }
}
