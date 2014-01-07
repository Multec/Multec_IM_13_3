package Test;

import org.mt4j.MTApplication;
import org.mt4j.components.visibleComponents.shapes.MTEllipse;
import org.mt4j.components.visibleComponents.shapes.MTRectangle;
import org.mt4j.input.inputProcessors.IGestureEventListener;
import org.mt4j.input.inputProcessors.MTGestureEvent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragEvent;
import org.mt4j.input.inputProcessors.componentProcessors.tapProcessor.TapProcessor;
import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.MTColor;
import org.mt4j.util.math.Vector3D;

import Infopanel.Ballen;
import processing.core.PImage;

public class Hoofdklasse extends AbstractScene {

	public Hoofdklasse(MTApplication mtApplication, String name) {
		super(mtApplication, name);
		
		Ballen[] ballen = new Ballen[10];

		MTEllipse ellipse = new MTEllipse(mtApplication, new Vector3D(mtApplication.width/2, mtApplication.height/2), 150, 150);
		ellipse.setFillColor(new MTColor(255, 255, 255));
		ellipse.setNoStroke(true);
		ellipse.unregisterAllInputProcessors();
		this.getCanvas().addChild(ellipse);
		
		ellipse.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent te = (DragEvent)ge;
				switch (te.getId()) {
				case MTGestureEvent.GESTURE_DETECTED:
										
					break;
				case MTGestureEvent.GESTURE_UPDATED:
					
					break;
				case MTGestureEvent.GESTURE_ENDED:
					
					break;
				}
				return false;
			}
		});
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
