/**
 * 
 */
package Test;
import Infopanel.*;

import org.mt4j.MTApplication;

/**
 * @author Arthur
 *
 */
public class TekenTest extends MTApplication {
	
	public static void main(String[] args) {
		initialize();
	}

	@Override
	public void startUp() {
		addScene(new Editing(this, "begin"));
	}
	
}
