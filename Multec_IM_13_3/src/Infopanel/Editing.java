package Infopanel;

import org.mt4j.MTApplication;
import org.mt4j.components.visibleComponents.shapes.MTEllipse;
import org.mt4j.components.visibleComponents.shapes.MTLine;
import org.mt4j.components.visibleComponents.shapes.MTRectangle;
import org.mt4j.components.visibleComponents.widgets.MTBackgroundImage;
import org.mt4j.components.visibleComponents.widgets.MTSvg;
import org.mt4j.components.visibleComponents.widgets.MTTextArea;
import org.mt4j.components.visibleComponents.widgets.buttons.MTImageButton;
import org.mt4j.input.inputProcessors.IGestureEventListener;
import org.mt4j.input.inputProcessors.MTGestureEvent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragEvent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragProcessor;
import org.mt4j.input.inputProcessors.componentProcessors.tapProcessor.TapEvent;
import org.mt4j.input.inputProcessors.componentProcessors.tapProcessor.TapProcessor;
import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.MTColor;
import org.mt4j.util.math.ToolsGeometry;
import org.mt4j.util.math.Vector3D;

import processing.core.PImage;

public class Editing extends AbstractScene {
	
//	private String svgPath =  "assests" + MTApplication.separator;

	public Editing(MTApplication mtApplication, String name) {
		super(mtApplication, name);
		
		PImage loadedImage = mtApplication.loadImage("assests/zwartWitResized.png");
		//MTRectangle achtergrond = new MTRectangle(1920, 1080, 1920, 1080, mtApplication);
		MTRectangle achtergrond = new MTRectangle(loadedImage, mtApplication);
		
		achtergrond.setPositionGlobal(new Vector3D(mtApplication.width/2, mtApplication.height/2));
		achtergrond.setNoStroke(true);
		achtergrond.unregisterAllInputProcessors();
		this.getCanvas().addChild(achtergrond);
		
		
		//MTBackgroundImage iets = new MTBackgroundImage(mtApplication, "assests/BACKGROUND.jpeg", clearBeforeDraw)
		
		
//		MTSvg voorbeeld = new MTSvg(mtApplication, svgPath + "BACKGROUND.jpeg");
//		voorbeeld.setPositionGlobal(new Vector3D(mtApplication.width/2, mtApplication.height/2,0));
//		this.getCanvas().addChild(voorbeeld);
		
		
		//Center cirkel
		MTEllipse center = new MTEllipse(mtApplication, new Vector3D(mtApplication.width/2, mtApplication.height/2), 150, 150);
		final PImage imageCenter = mtApplication.loadImage("assests/EDITINGBOL.png");
		center.setTexture(imageCenter);
		//center.setFillColor(new MTColor(255, 255, 255));
		center.setNoStroke(true);
		center.unregisterAllInputProcessors();
		this.getCanvas().addChild(center);
		
		/*MTTextArea onderwerp = new MTTextArea(mtApplication);
		onderwerp.setText("Editing & \n Authoring");
		onderwerp.setPositionGlobal(new Vector3D(mtApplication.width/2, mtApplication.height/2));
		onderwerp.unregisterAllInputProcessors();
		onderwerp.setNoFill(true);
		onderwerp.setNoStroke(true);
		this.getCanvas().addChild(onderwerp);*/
		
		
		//Geel film knop
		final MTEllipse geelFilm = new MTEllipse(mtApplication, new Vector3D(600, 400), 125, 125);
		final PImage imageGeelFilm = mtApplication.loadImage("assests/FILMGEEL.png");
		geelFilm.setTexture(imageGeelFilm);
		
		//geelFilm.setStrokeColor(new MTColor(229, 176, 98));
		geelFilm.setNoStroke(true);
		geelFilm.unregisterAllInputProcessors();
		geelFilm.registerInputProcessor(new DragProcessor(mtApplication));
		
		//this.getCanvas().addChild(geelFilm);
		//----------------------------------------------------------------------------------------------------
		//Geel foto knop 1
		final MTEllipse geelFoto1 = new MTEllipse(mtApplication, new Vector3D(200, 200), 90, 90);
		PImage imageGeelFoto1 = mtApplication.loadImage("assests/FOTOGEEL1.png");
		geelFoto1.setTexture(imageGeelFoto1);
		
		//geelFoto1.setStrokeColor(new MTColor(229, 176, 98));
		geelFoto1.setNoStroke(true);
		geelFoto1.unregisterAllInputProcessors();
		geelFoto1.registerInputProcessor(new DragProcessor(mtApplication));
		
		//this.getCanvas().addChild(geelFoto1);
		
		//Geel foto knop 2
		final MTEllipse geelFoto2 = new MTEllipse(mtApplication, new Vector3D(300, 550), 90, 90);
		PImage imageGeelFoto2 = mtApplication.loadImage("assests/FOTOGEEL2.png");
		geelFoto2.setTexture(imageGeelFoto2);
		
		//geelFoto2.setStrokeColor(new MTColor(229, 176, 98));
		geelFoto2.setNoStroke(true);
		geelFoto2.unregisterAllInputProcessors();
		geelFoto2.registerInputProcessor(new DragProcessor(mtApplication));
		
		//this.getCanvas().addChild(geelFoto2);
		
		//Rood film knop
		final MTEllipse roodFilm = new MTEllipse(mtApplication, new Vector3D(1200, 300), 125, 125);
		PImage imageRoodFilm = mtApplication.loadImage("assests/roodfilm.png");
		roodFilm.setTexture(imageRoodFilm);
		
		//roodFilm.setStrokeColor(new MTColor(239, 121, 124));
		roodFilm.setNoStroke(true);
		roodFilm.unregisterAllInputProcessors();
		roodFilm.registerInputProcessor(new DragProcessor(mtApplication));
				
		//this.getCanvas().addChild(roodFilm);
		
		//Rood foto knop 1
		final MTEllipse roodFoto1 = new MTEllipse(mtApplication, new Vector3D(1400, 100), 90, 90);
		PImage imageRoodFoto1 = mtApplication.loadImage("assests/roodfoto1.png");
		roodFoto1.setTexture(imageRoodFoto1);
		
		//roodFoto1.setStrokeColor(new MTColor(239, 121, 124));
		roodFoto1.setNoStroke(true);
		roodFoto1.unregisterAllInputProcessors();
		roodFoto1.registerInputProcessor(new DragProcessor(mtApplication));
		
		//this.getCanvas().addChild(roodFoto1);
		
		//Rood foto knop 2
		final MTEllipse roodFoto2 = new MTEllipse(mtApplication, new Vector3D(1700, 250), 90, 90);
		PImage imageRoodFoto2 = mtApplication.loadImage("assests/roodfoto2.png");
		roodFoto2.setTexture(imageRoodFoto2);
		
		//roodFoto2.setStrokeColor(new MTColor(239, 121, 124));
		roodFoto2.setNoStroke(true);
		roodFoto2.unregisterAllInputProcessors();
		roodFoto2.registerInputProcessor(new DragProcessor(mtApplication));
		
		//this.getCanvas().addChild(roodFoto2);
		
		//Blauw film knop
		final MTEllipse blauwFilm = new MTEllipse(mtApplication, new Vector3D(1300, 850), 125, 125);
		PImage imageBlauwFilm = mtApplication.loadImage("assests/FOTOROBBIE1.png");
		blauwFilm.setTexture(imageBlauwFilm);
		
		//blauwFilm.setStrokeColor(new MTColor(93, 118, 174));
		blauwFilm.setNoStroke(true);
		blauwFilm.unregisterAllInputProcessors();
		blauwFilm.registerInputProcessor(new DragProcessor(mtApplication));
				
		//this.getCanvas().addChild(blauwFilm);
		
		//Blauw foto knop 1
		final MTEllipse blauwFoto1 = new MTEllipse(mtApplication, new Vector3D(1500, 650), 90, 90);
		PImage imageBlauwFoto1 = mtApplication.loadImage("assests/FOTOROBBIE2.png");
		blauwFoto1.setTexture(imageBlauwFoto1);
		
		//blauwFoto1.setStrokeColor(new MTColor(93, 118, 174));
		blauwFoto1.setNoStroke(true);
		blauwFoto1.unregisterAllInputProcessors();
		blauwFoto1.registerInputProcessor(new DragProcessor(mtApplication));
				
		//this.getCanvas().addChild(blauwFoto1);
		
		//Blauw foto knop 1
		final MTEllipse blauwFoto2 = new MTEllipse(mtApplication, new Vector3D(1800, 900), 90, 90);
		PImage imageBlauwFoto2 = mtApplication.loadImage("assests/FOTOROBBIE3.png");
		blauwFoto2.setTexture(imageBlauwFoto2);
		
		//blauwFoto2.setStrokeColor(new MTColor(93, 118, 174));
		blauwFoto2.setNoStroke(true);
		blauwFoto2.unregisterAllInputProcessors();
		blauwFoto2.registerInputProcessor(new DragProcessor(mtApplication));
				
		//this.getCanvas().addChild(blauwFoto2);
		//---------------------------------------------------------------------------------------------------------*/
		final MTEllipse backKnop = new MTEllipse(mtApplication, new Vector3D(150, 950), 90, 90);
		PImage imageBackKnop = mtApplication.loadImage("assests/HANDBACK.png");
		backKnop.setTexture(imageBackKnop);
		
		backKnop.setNoStroke(true);;
		backKnop.unregisterAllInputProcessors();
		
		//this.getCanvas().addChild(backKnop);
		
		//HANDBACK
		
		//----------TO DO
		// LIJNEN
		// TERUG KNOP
		// RECTANGLE MERGEN EN AL
		// OPTIMIZATION
		// NOG EEN KLASSE MAKEN
		
		
//		final Vector3D lokatie = geelFilm.getCenterPointGlobal();
//		final MTLine lijn = new MTLine(mtApplication, lokatie.x, lokatie.y, 960, 540);
//		lijn.setStrokeWeight(5);
//		lijn.unregisterAllInputProcessors();
//		geelFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
//			public boolean processGestureEvent(MTGestureEvent ge) {
//				DragEvent te = (DragEvent)ge;
//				switch (te.getId()) {
//				case MTGestureEvent.GESTURE_DETECTED:
//					lijn.translate(new Vector3D(lokatie.x, lokatie.y, 960, 540));
//					//.getCanvas().addChild(lijn);
//					
//					break;
//				case MTGestureEvent.GESTURE_UPDATED:
//					
//					break;
//				case MTGestureEvent.GESTURE_ENDED:
//					
//					break;
//				}
//				return false;
//			}
//		});
//		this.getCanvas().addChild(lijn);
		
		//-----------------------------------------------------rechthoeken
		final MTRectangle test = new MTRectangle(1920, 1080, 1920, 1080, mtApplication);
		test.setPositionGlobal(new Vector3D(mtApplication.width/2, mtApplication.height/2));
		
		final PImage imageRechthoek = mtApplication.loadImage("assests/imageRechthoek.png");
		final PImage sluitknopImg = mtApplication.loadImage("assests/sluitknop.png");
		
		final MTRectangle mediaContainer = new MTRectangle(160, 90, 1600, 900, mtApplication);
		
		//mediaContainer.setTexture(imageRechthoek);
		
		final MTRectangle sluitknop = new MTRectangle(160, 90, 50, 40, mtApplication);
		
		//sluitknop.setTexture(sluitknopImg);
		
		mediaContainer.addChild(sluitknop);
		
		this.getCanvas().addChild(mediaContainer);
		this.getCanvas().addChild(geelFilm);
		this.getCanvas().addChild(geelFoto1);
		this.getCanvas().addChild(geelFoto2);
		this.getCanvas().addChild(roodFilm);
		this.getCanvas().addChild(roodFoto1);
		this.getCanvas().addChild(roodFoto2);
		this.getCanvas().addChild(blauwFilm);
		this.getCanvas().addChild(blauwFoto1);
		this.getCanvas().addChild(blauwFoto2);
		this.getCanvas().addChild(backKnop);
		
		mediaContainer.unregisterAllInputProcessors();
		mediaContainer.removeAllGestureEventListeners();
		sluitknop.unregisterAllInputProcessors();
		sluitknop.removeAllGestureEventListeners();
		
		mediaContainer.setNoFill(true);
		mediaContainer.setNoStroke(true);
		sluitknop.setNoFill(true);
		sluitknop.setNoStroke(true);
				
		/*geelFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent te = (DragEvent)ge;
				
				switch (te.getId()) {
				case MTGestureEvent.GESTURE_DETECTED:
				System.out.println("dragbegin");
					break;
				case MTGestureEvent.GESTURE_UPDATED:
					System.out.println("dragcontinue");

					break;
				case MTGestureEvent.GESTURE_ENDED:
					System.out.println("dragend");
					break;
				}
				return false;
			}
		});*/
				
		geelFilm.removeAllGestureEventListeners(DragProcessor.class);
		geelFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				geelFilm.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = geelFilm.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					geelFilm.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
				
		geelFilm.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		geelFilm.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		geelFoto1.removeAllGestureEventListeners(DragProcessor.class);
		geelFoto1.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				geelFoto1.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = geelFoto1.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					geelFoto1.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		geelFoto1.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		geelFoto1.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		geelFoto2.removeAllGestureEventListeners(DragProcessor.class);
		geelFoto2.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				geelFoto2.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = geelFoto2.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					geelFoto2.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		geelFoto2.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		geelFoto2.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		roodFilm.removeAllGestureEventListeners(DragProcessor.class);
		roodFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				roodFilm.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = roodFilm.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					roodFilm.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		roodFilm.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		roodFilm.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		roodFoto1.removeAllGestureEventListeners(DragProcessor.class);
		roodFoto1.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				roodFoto1.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = roodFoto1.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					roodFoto1.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		roodFoto1.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		roodFoto1.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		roodFoto2.removeAllGestureEventListeners(DragProcessor.class);
		roodFoto2.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				roodFoto2.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = roodFoto2.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					roodFoto2.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		roodFoto2.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		roodFoto2.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		blauwFilm.removeAllGestureEventListeners(DragProcessor.class);
		blauwFilm.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				blauwFilm.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = blauwFilm.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					blauwFilm.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		blauwFilm.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		blauwFilm.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		blauwFoto1.removeAllGestureEventListeners(DragProcessor.class);
		blauwFoto1.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				blauwFoto1.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = blauwFoto1.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					blauwFoto1.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		blauwFoto1.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		blauwFoto1.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		blauwFoto2.removeAllGestureEventListeners(DragProcessor.class);
		blauwFoto2.addGestureListener(DragProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge) {
				DragEvent de = (DragEvent)ge;
 
				blauwFoto2.translateGlobal(de.getTranslationVect());
 
				Vector3D[] v1 = test.getVerticesGlobal();
				Vector3D[] v2 = blauwFoto2.getBounds().getVectorsGlobal();
				boolean inside = true;
				for (Vector3D vector3d : v2) {
					if (!ToolsGeometry.isPolygonContainsPoint(v1, vector3d)){
						inside = false;
					}
				}
 
				if (!inside){
					blauwFoto2.translateGlobal(de.getTranslationVect().getScaled(-1));
				}
				return false;
			}
		});
		
		blauwFoto2.registerInputProcessor(new TapProcessor(mtApplication, 25, true, 350));
		blauwFoto2.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge2) {
				TapEvent te2 = (TapEvent)ge2;
				if (te2.isDoubleTap()){					
					mediaContainer.setTexture(imageRechthoek);
					sluitknop.setTexture(sluitknopImg);
									
					geelFilm.setVisible(false);
					geelFoto1.setVisible(false);
					geelFoto2.setVisible(false);
					roodFilm.setVisible(false);
					roodFoto1.setVisible(false);
					roodFoto2.setVisible(false);
					blauwFilm.setVisible(false);
					blauwFoto1.setVisible(false);
					blauwFoto2.setVisible(false);
					backKnop.setVisible(false);
					/*
					setTexture(null);
					geelFilm.setNoFill(true);
					geelFilm.setNoStroke(true);
					*/
					mediaContainer.setNoFill(false);
					sluitknop.setNoFill(false);
					sluitknop.setTexture(sluitknopImg);
					mediaContainer.setTexture(imageRechthoek);
					
				}
				return false;
			}
		});
		
		// werking sluitknop
		sluitknop.registerInputProcessor(new TapProcessor(mtApplication));
		sluitknop.addGestureListener(TapProcessor.class, new IGestureEventListener() {
			public boolean processGestureEvent(MTGestureEvent ge3) {
				TapEvent te3 = (TapEvent)ge3;
				switch (te3.getId()) {
				case MTGestureEvent.GESTURE_DETECTED:
					mediaContainer.setTexture(null);
					sluitknop.setTexture(null);
					mediaContainer.setNoFill(true);
					sluitknop.setNoFill(true);
					
					geelFilm.setVisible(true);
					geelFoto1.setVisible(true);
					geelFoto2.setVisible(true);
					roodFilm.setVisible(true);
					roodFoto1.setVisible(true);
					roodFoto2.setVisible(true);
					blauwFilm.setVisible(true);
					blauwFoto1.setVisible(true);
					blauwFoto2.setVisible(true);
					backKnop.setVisible(true);
					/*
					geelFilm.setTexture(imageGeelFilm);
					geelFilm.setNoFill(false);
					geelFilm.setNoStroke(false);*/
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
