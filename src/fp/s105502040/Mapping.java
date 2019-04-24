package fp.s105502040;

import javafx.util.Duration;

import java.io.IOException;
import java.io.PrintStream;

import fp.s105502040.item.Begining;
import fp.s105502040.item.Null;
import fp.s105502040.map.*;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Mapping {
	@FXML
	private ImageView mapImage;
	@FXML
	private ImageView mainCImage;
	@FXML
	public Pane mapPane;
	@FXML
	public Text text;
	@FXML
	public ImageView dialogImage;

	
	public static boolean lock=false;
	private MainCharacter mc;
	private double oldPositionX=0;
	private double oldPositionY=0;
	private double rectangleSpeedX = 0;
	private double rectangleSpeedY = 0;
	private AnimationTimer rectangleAnimation;
	static Map currentMap;
	static Map lastMap;
	public static Stage stage;
	public static Scene mapScene;
	private Inventory inventory;
	private Direction direction = Direction.DOWN;
	private int readTo=1;
	public static GameObject currentGo;
	private GameObject tempGo = null;
	MapUtility mapUtility = new MapUtility();
	public boolean judge = true;
	public static boolean comeFromInv = false;
	public EnterScene1 enterController1 = new EnterScene1("METAL");
	public Scene enterScene1;
	private FXMLLoader fxmlEnter1 = new FXMLLoader(getClass().getResource("enter1.fxml"));
	
	public StoneCode stoneCode = new StoneCode();
	public Scene stoneScene;
	private FXMLLoader fxmlStoneCode = new FXMLLoader(getClass().getResource("stoneCode.fxml"));
	
	public FinalScene finalController = new FinalScene();
	public Scene finalScene;
	public FXMLLoader fxmlFinalScene = new FXMLLoader(getClass().getResource("finalScene.fxml"));
	
	private boolean enterHomeOrNot = false;
	
	public void setStage(Stage stage){
		this.stage=stage;
	}
	
	@FXML
	private void initialize(){
		fxmlEnter1.setController(enterController1);
		try {
			enterScene1 = new Scene((Parent)fxmlEnter1.load(), 816, 624);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		enterController1.setScene(enterScene1);
		//-----------------------------------------
		fxmlStoneCode.setController(stoneCode);
		try {
			stoneScene = new Scene( (Parent)fxmlStoneCode.load(), 816, 624);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stoneCode.setScene(stoneScene);
		//-----------------------------------------
		fxmlFinalScene.setController(finalController);
		try {
			finalScene = new Scene( (Parent)fxmlFinalScene.load(), 816, 624);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finalController.setScene(finalScene);
		//-----------------------------------------
		currentMap=new Map00();
		currentGo = new Begining(0,0);
		lock=true;
		text.setText(currentGo.texts.get(0));
		dialogImage.toFront();
		text.toFront();
		mapImage.setImage(currentMap.mapImage.getImage());
		
		for(int i=0;i<currentMap.gameObjects.size();i++)
			mapPane.getChildren().add(currentMap.gameObjects.get(i));

		
		
		mc = new MainCharacter();
		mainCImage.setImage(mc.getImage());
		mainCImage.setTranslateX(mc.initialPositionX*48);
		mainCImage.setTranslateY(mc.initialPositionY*48);
		
	    rectangleAnimation = new AnimationTimer(){
	    	@Override
	      public void handle(long timestamp) {
	    		
	          final double deltaX =  rectangleSpeedX;
	          final double deltaY =  rectangleSpeedY;
	          final double oldX = mainCImage.getTranslateX(); 
	          final double oldY = mainCImage.getTranslateY();
	          

	          
	          if(oldX%48!=0){
	        	  if(rectangleSpeedX>0){
		        	  if(oldX%48==0){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxARight1.png") ); 
		        		  rectangleSpeedX=0;
			        		  
		        	  }
		        		  
		        	  else if(oldX%48<24){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxARight0.png") );
		        		  mainCImage.setTranslateX(oldX+3);
		        	  }
		        	  else{
		        		  mainCImage.setImage(new Image ("file:image/character/toravxARight2.png") );
		        		  mainCImage.setTranslateX(oldX+3);
		        	  }
		          }
		          else if(rectangleSpeedX<0){
		        	  if(oldX%48==0){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxALeft1.png") ); 
		        		  rectangleSpeedX=0;
		        		  
		        	  }
	        		  
		        	  else if(oldX%48<24){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxALeft0.png") );
		        		  mainCImage.setTranslateX(oldX-3);
		        	  }
		        	  else{
		        		  mainCImage.setImage(new Image ("file:image/character/toravxALeft2.png") );
		        		  mainCImage.setTranslateX(oldX-3);
		        	  }
		          }
	          }
	          if(oldY%48!=0){
	        	  if(rectangleSpeedY>0){
		        	  if(oldY%48==0){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxADown1.png") ); 
		        		  rectangleSpeedY=0;
			        		  
		        	  }
		        		  
		        	  else if(oldY%48<24){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxADown0.png") );
		        		  mainCImage.setTranslateY(oldY+3);
		        	  }
		        	  else{
		        		  mainCImage.setImage(new Image ("file:image/character/toravxADown2.png") );
		        		  mainCImage.setTranslateY(oldY+3);
		        	  }
		          }
		          else if(rectangleSpeedY<0){
		        	  if(oldY%48==0){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxAUp1.png") ); 
		        		  rectangleSpeedY=0;
		        		  
		        	  }
	        		  
		        	  else if(oldY%48<24){
		        		  mainCImage.setImage(new Image ("file:image/character/toravxAUp0.png") );
		        		  mainCImage.setTranslateY(oldY-3);
		        	  }
		        	  else{
		        		  mainCImage.setImage(new Image ("file:image/character/toravxAUp2.png") );
		        		  mainCImage.setTranslateY(oldY-3);
		        	  }
		          }
	          }
	          
	          for(int i=0;i<currentMap.portals.size();i++){
	        	  
	        	  if( Math.abs(mainCImage.getTranslateX()/48-currentMap.portals.get(i).X)<0.35 && Math.abs(mainCImage.getTranslateY()/48-currentMap.portals.get(i).Y) <0.35){
	        		  
	        		  mainCImage.setTranslateX(currentMap.portals.get(i).toX*48);
	        		  mainCImage.setTranslateY(currentMap.portals.get(i).toY*48);
	        		  switch(currentMap.portals.get(i).direction){
	        		  case 1:
	        			  mainCImage.setImage(new Image ("file:image/character/toravxAUp1.png") ); 
	        			  break;
	        		  case 2:
	        			  mainCImage.setImage(new Image ("file:image/character/toravxADown1.png") ); 
	        			  break;
	        		  case 3:
	        			  mainCImage.setImage(new Image ("file:image/character/toravxALeft1.png") );
	        			  break;
	        		  case 4:
	        			  mainCImage.setImage(new Image ("file:image/character/toravxARight1.png") ); 
	        			  break;
	        			  default:
	        				  System.out.println("ERROR");
	        		  }
	        		  lastMap=currentMap;
	        		  currentMap =mapUtility.getMap(currentMap.portals.get(i).toMap) ;
	        		  for(int j=0;j<currentMap.gameObjects.size();j++)
	        			  if(!currentMap.gameObjects.get(j).taken)
	        				mapPane.getChildren().add(currentMap.gameObjects.get(j));
	        			for(int j=0;j<lastMap.gameObjects.size();j++)
	        					mapPane.getChildren().remove(lastMap.gameObjects.get(j));
	        		  mapImage.setImage(currentMap.mapImage.getImage());
	        			if(currentMap.id.equals("WoodStart")){
	        				
	        				mapUtility.resetWoods();
	        			}
	        			if(lastMap.id.equals("t2")&&currentMap.id.equals("WoodStart")){
	        				Menu.caveSong.stop();
	        				Menu.woodSong.play();
	        			}
	        			else if(lastMap.id.equals("WoodStart")&&currentMap.id.equals("t2")){
	        				Menu.caveSong.play();
	        				Menu.woodSong.stop();
	        			}
	        			else if(lastMap.id.equals("Home")&&currentMap.id.equals("Home1F")){
	        				Menu.homeSong.play();
	        				Menu.woodSong.stop();
	        			}
	        			else if(lastMap.id.equals("Home1F")&&currentMap.id.equals("Home")){
	        				Menu.homeSong.stop();
	        				Menu.woodSong.play();
	        			}
	        			if(!enterHomeOrNot&&lastMap.id.equals("Home")&&currentMap.id.equals("Home1F")){
	        				lock=true;
	        				text.setText("「回樓上睡個覺結束今天吧」");
	        				dialogImage.toFront();
	        				text.toFront();
	        				enterHomeOrNot = true;
	        			}
	        		  break;
	        	  }
	          }
	          

	      }
	    };
	    
	    
	    
	    rectangleAnimation.start();
	}
	
	private boolean checkObstacle(double X,double Y){
		for(int i=0;i<currentMap.obstacles.size();i++)
			if(Math.abs( currentMap.obstacles.get(i).X-X/48 )<1.0&&Math.abs( currentMap.obstacles.get(i).Y-Y/48 )<1.0){
				return true;
			}
		return false;
	}
	
	private boolean checkObject(GameObject go){
		if( ( direction == Direction.UP &&Math.abs(  mainCImage.getTranslateX()/48-go.X )<1 && Math.abs( mainCImage.getTranslateY()/48-1-go.Y )  <1 )
			|| ( direction == Direction.DOWN && Math.abs(  mainCImage.getTranslateX()/48-go.X )<1 && Math.abs( mainCImage.getTranslateY()/48+1-go.Y )  <1 )
			|| ( direction == Direction.RIGHT && Math.abs(  mainCImage.getTranslateY()/48-go.Y )<1 && Math.abs( mainCImage.getTranslateX()/48+1-go.X )  <1)
			|| ( direction == Direction.RIGHT && Math.abs(  mainCImage.getTranslateY()/48-go.Y )<1 && Math.abs( mainCImage.getTranslateX()/48-1-go.X )  <1) )
			return true;
		else
			return false;
	}
	
	public void setScene(Scene scene) 
	  {
		
		this.mapScene = scene;
		try {
			inventory = new Inventory(stage,mapScene, text, dialogImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
	    	@Override
	      public void handle(KeyEvent event) {
	    		
	    		oldPositionX=mainCImage.getTranslateX();
	    		oldPositionY=mainCImage.getTranslateY();
	        if (event.getCode() == KeyCode.RIGHT&&!lock) {
	        	mainCImage.setImage(new Image ("file:image/character/toravxARight1.png") );
	        	direction=Direction.RIGHT;
	        	if(!checkObstacle(oldPositionX+3,oldPositionY)){
	        		rectangleSpeedX = 1;
	        		mainCImage.setTranslateX(oldPositionX+3);
	        	}
	        }
	        if (event.getCode() == KeyCode.LEFT&&!lock) {
	        	direction=Direction.LEFT;
	        	mainCImage.setImage(new Image ("file:image/character/toravxALeft1.png") ); 
	        	if(!checkObstacle(oldPositionX-3,oldPositionY)){
	        		rectangleSpeedX = -1;
	  	          	mainCImage.setTranslateX(oldPositionX-3);
	        	}
	          
	        }
	        if (event.getCode() == KeyCode.UP&&!lock) {
	        	direction=Direction.UP;
	        	mainCImage.setImage(new Image ("file:image/character/toravxAUp1.png") ); 
	        	if(!checkObstacle(oldPositionX,oldPositionY-3)){
	        		rectangleSpeedY = -1;
	        		mainCImage.setTranslateY(oldPositionY-3);
	        	}
	        }
	        if (event.getCode() == KeyCode.DOWN&&!lock) {
	        	direction=Direction.DOWN;
	        	mainCImage.setImage(new Image ("file:image/character/toravxADown1.png") ); 
	        	if(!checkObstacle(oldPositionX,oldPositionY+3)){
	        		rectangleSpeedY = 1;
	        		mainCImage.setTranslateY(oldPositionY+3);
	        	}
	        }
	        
	        if(event.getCode() == KeyCode.Z && lock){
	        	if(checkObject(currentGo.event) && currentGo.atMap.equals(currentMap.id) && currentGo.taken){
	        		text.setText(currentGo.event.texts.get(0));
	        		if(currentGo.id==0){
	        			lastMap=currentMap;
	        			currentMap=mapUtility.getMap("001");
	        			refreshMap();
	        			mapImage.setImage(currentMap.mapImage.getImage());;
	        			dialogImage.toFront();
	        			text.toFront();
		        		readTo+=100;
	        		}
	        	}
	        	if(readTo < currentGo.texts.size() && currentGo.taken)
	        		text.setText(currentGo.texts.get(readTo++));
	        	else{
	        		if(readTo>100)
	        			readTo=99;
	        		else{
	        			if(tempGo!=null){
	        				if(tempGo.id==6){
		        				stage.setScene(enterScene1);
		        			}
		        			if(tempGo.id==9999){
		        				stage.setScene(stoneScene);
		        			}
		        			if(tempGo.id==30){
		    					stage.setScene(finalScene);
		    				}
	        			}
	        			
	        			currentGo.taken = true;
		        		lock = false;
		        		readTo=1;
		        		dialogImage.toBack();
		        		text.toBack();
		        		judge = false;
		        		
	        		}
	        		
	        	}
	        	
	        }
	        
	        if(event.getCode() == KeyCode.Z && !lock){
	        	for(int i=0;i<currentMap.gameObjects.size();i++){
	        		if( checkObject(currentMap.gameObjects.get(i)) ){
	        			//currentGo = currentMap.gameObjects.get(i);
	        			if(!currentMap.gameObjects.get(i).taken){
		        			currentMap.gameObjects.get(i).toBack();
		        			currentMap.obstacles.remove(currentMap.gameObjects.get(i).obstacle);
		        			if(currentMap.gameObjects.get(i).pickable){
		        				text.setText("撿到了"+ currentMap.gameObjects.get(i).name);
		        				inventory.addItem(currentMap.gameObjects.get(i));
		        			}
		        				
		        			else
		        				text.setText(currentMap.gameObjects.get(i).texts.get(0));
		        			currentGo = currentMap.gameObjects.get(i);
		        			lock=true;
		        			dialogImage.toFront();
		        			text.toFront();
	        			}
	        			else if(tempGo != currentGo  && !currentMap.gameObjects.get(i).pickable && judge && !comeFromInv){
	        				if(currentMap.gameObjects.get(i).id==2&&InventoryController.buketA!=null){
	        					if(InventoryController.buketA.contain==0){
	        						InventoryController.buketA.contain = -InventoryController.buketA.id;
	        						text.setText("已將"+ -InventoryController.buketA.id + "L水桶裝滿");
	        					}
	        					else{
	        						InventoryController.buketA.contain=0;
	        						text.setText("已將"+ -InventoryController.buketA.id + "L水桶的水倒掉");
	        					}
	        					InventoryController.buketA=null;
	        					lock=true;
			        			dialogImage.toFront();
			        			text.toFront();
	        				}
	        				else if(currentMap.gameObjects.get(i).id==3&&InventoryController.buketA!=null){
	        					if(InventoryController.buketA.contain==4){
	        						InventoryController.buketA=null;
	        						Inventory.controller.getItemsText(--Inventory.inventoryCount).setText("");
	        						Inventory.controller.items.remove(Inventory.inventoryCount);
	        						Inventory.controller.getItemsText(--Inventory.inventoryCount).setText("");
	        						Inventory.controller.items.remove(Inventory.inventoryCount);
	        						text.setText("將水桶的水倒入，機關門產生了劇烈震動，旁邊告示牌文字變了");
	        						lastMap=currentMap;
	        						currentMap=mapUtility.getMap("Gate1Opened");
	        						mapUtility.getMap("t1").portals.get(1).toMap="Gate1Opened";
	        						mapUtility.getMap("t1").portals.get(2).toMap="Gate1Opened";
	        						mapUtility.getMap("t1").portals.get(3).toMap="Gate1Opened";
	        						refreshMap();
	        						readTo+=100;
	        					}
	        					else{
	        						InventoryController.buketA.contain=0;
	        						text.setText("將水桶的水倒入，但似乎沒有反應");
	        						InventoryController.buketA=null;
	        					}
	        					lock=true;
			        			dialogImage.toFront();
			        			text.toFront();
	        				}
	        				else{
		        				text.setText(currentMap.gameObjects.get(i).texts.get(0));
		        				lock=true;
			        			dialogImage.toFront();
			        			text.toFront();
			        			
			        			tempGo = currentMap.gameObjects.get(i);
			        			currentGo = new Null(-1,-1);
	        				}

		        			
	        			}
	        			else
	        				tempGo = null;
	        			break;
	        		}
	        		
	        	}
	        	judge = true;
	        	comeFromInv = false;
	        }
	        if (event.getCode() == KeyCode.X){
	        	Inventory.controller.itemDisplay();
        		stage.setScene(inventory.inventoryScene);
	        }
	        if(event.getCode() == KeyCode.K){
	        	stage.setScene(Main.scene00);
	        }

	      }
	    });
	    scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
	    	@Override
	      public void handle(KeyEvent event)
	      {
	        if ((event.getCode() == KeyCode.RIGHT) || (event.getCode() == KeyCode.LEFT)) {
	          rectangleSpeedX = 0;
	        }
	        if ((event.getCode() == KeyCode.UP) || (event.getCode() == KeyCode.DOWN)) {
	          rectangleSpeedY = 0;
	        }
	      }
	    });
	  }
	 
	public static void interact(){
		lock=true;
	}
	
	public void refreshMap(){
		for(int i=0;i<currentMap.gameObjects.size();i++)
			mapPane.getChildren().add(currentMap.gameObjects.get(i));
		for(int i=0;i<lastMap.gameObjects.size();i++)
			mapPane.getChildren().remove(lastMap.gameObjects.get(i));
		mapImage.setImage(currentMap.mapImage.getImage());
	}
	
}

enum Direction{
	RIGHT,LEFT,UP,DOWN
}
