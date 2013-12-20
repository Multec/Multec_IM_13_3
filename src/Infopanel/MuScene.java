package Infopanel;

import org.mt4j.MTApplication;
import org.mt4j.components.visibleComponents.shapes.MTEllipse;
import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.MTColor;
import org.mt4j.util.math.Vector3D;

public class MuScene extends AbstractScene {

	public MuScene(MTApplication mtApplication, String name) {
		super(mtApplication, name);
		MTEllipse ellipse = new MTEllipse(mtApplication, new Vector3D(100f, 100f), 100f, 100f);
		ellipse.setFillColor(new MTColor(50, 100, 255));
		this.getCanvas().addChild(ellipse);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
