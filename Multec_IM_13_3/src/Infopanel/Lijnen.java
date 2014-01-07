package Infopanel;

import org.mt4j.components.MTComponent;
import org.mt4j.components.visibleComponents.shapes.MTLine;
import org.mt4j.input.inputProcessors.IGestureEventListener;
import org.mt4j.input.inputProcessors.MTGestureEvent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragEvent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragProcessor;
import org.mt4j.util.math.Vector3D;

import processing.core.PApplet;

public class Lijnen extends MTComponent {
	
	int[] balls = new int[10];
	
	void drawComponent(){
		for(int i = 0; i <= balls.length; i++){
			//final Vector3D lokatie = balls[i].getCenterPointGlobal();
			//MTLine lijn = new MTLine(lokatie.x, lokatie.y, 960, 540);
		}
		
	}
	
//	final Vector3D lokatie = geelFilm.getCenterPointGlobal();
//	final MTLine lijn = new MTLine(mtApplication, lokatie.x, lokatie.y, 960, 540);
//	lijn.setStrokeWeight(5);
//	lijn.unregisterAllInputProcessors();
//	geelFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
//		public boolean processGestureEvent(MTGestureEvent ge) {
//			DragEvent te = (DragEvent)ge;
//			switch (te.getId()) {
//			case MTGestureEvent.GESTURE_DETECTED:
//				lijn.translate(new Vector3D(lokatie.x, lokatie.y, 960, 540));
//				//.getCanvas().addChild(lijn);
//				
//				break;
//			case MTGestureEvent.GESTURE_UPDATED:
//				
//				break;
//			case MTGestureEvent.GESTURE_ENDED:
//				
//				break;
//			}
//			return false;
//		}
//	});
//	this.getCanvas().addChild(lijn);

	public Lijnen(PApplet pApplet) {
		super(pApplet);
		
	}

	public int[] getBalls() {
		return balls;
	}

	public void setBalls(int[] balls) {
		this.balls = balls;
	}

}
