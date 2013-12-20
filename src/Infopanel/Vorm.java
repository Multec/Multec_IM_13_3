package Infopanel;
import org.mt4j.MTApplication;
import org.mt4j.components.MTComponent;
import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.MTColor;

/**
 * 
 */

/**
 * @author Arthur
 *
 */
abstract public class Vorm extends MTComponent {
	
	int posX, posY, width, height;
	MTColor strokeColor;
	MTApplication mtApplication;
	public Vorm(MTApplication mtApplication, String name, int posX, int posY, int width, int height, MTColor strokeColor) {
		super(mtApplication, name);
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.strokeColor = strokeColor;
		this.mtApplication = mtApplication;
	}
	
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public MTColor getStrokeColor() {
		return strokeColor;
	}

	public void setStrokeColor(MTColor strokeColor) {
		this.strokeColor = strokeColor;
	}

	abstract public void draw();

}
