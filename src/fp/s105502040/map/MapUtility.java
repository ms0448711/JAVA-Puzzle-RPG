package fp.s105502040.map;
import java.util.ArrayList;

import fp.s105502040.Map;

public class MapUtility {
	ArrayList<Map> maps = new ArrayList<Map>();
	public Woods woods1 = new Woods("Woods1", 1, "往下走是錯的");
	public Woods woods2 = new Woods("Woods2", 2, "回頭才是出路");
	public Woods woods3 = new Woods("Woods3", 3, "走右邊是對的");
	public Woods woods4 = new Woods("Woods4", 4, "「木」=謊言數");
	
	public ArrayList<Integer> order;
	public int lastSetTo;
	public static boolean homeClosedORnot = true;
	
	public MapUtility(){
		maps.add(new Map001());
		maps.add(new Tunnel1());
		maps.add(new Gate1());
		maps.add(new Gate1Opened());
		maps.add(new Gate2());
		maps.add(new Gate2Opened());
		maps.add(new Tunnel2());
		maps.add(new WoodStart());
		maps.add(woods1);
		maps.add(woods2);
		maps.add(woods3);
		maps.add(woods4);
		maps.add(new HomeClosed());
		maps.add(new Home());
		maps.add(new Home1F());
		maps.add(new Home2F());
	}
	
	
	public Map getMap(String mapID){
		for(int i=0;i<maps.size();i++){
			if(maps.get(i).id.equals(mapID))
				return maps.get(i);
		}
		return maps.get(0);
	}
	
	public void resetWoods(){
		getMap("WoodStart").portals.get(2).resetWood();
		getMap("WoodStart").portals.get(3).resetWood();
		for(int i=1;i<=3;i++){
			getMap("Woods1").portals.get(i).resetWood();
			getMap("Woods2").portals.get(i).resetWood();
			getMap("Woods3").portals.get(i).resetWood();
			getMap("Woods4").portals.get(i).resetWood();
		}
		int random;
		order = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			order.add(i);
		for(int times=5;times>0;times--){
			do{
				random = (int)( (Math.random()*times) );
			}while(order.get(random)==0&&order.size()!=1);
			setWoodMap(order.get(random));
			order.remove(random);
		}	
	}
	
	public void setWoodMap(int setTo){
		switch(order.size()){
		case 5:
			getMap("WoodStart").portals.get(1).toMap=new String("Woods"+(setTo));
			break;
		case 4:
			getMap("Woods"+lastSetTo).portals.get(0).toMap=new String("Woods"+(setTo));
			getMap("Woods"+lastSetTo).portals.get(0).resetWoods();
			break;
		case 3:
			getMap("Woods"+lastSetTo).portals.get(0).toMap=new String("Woods"+(setTo));
			getMap("Woods"+lastSetTo).portals.get(0).resetWoods();
			break;
		case 2:
			getMap("Woods"+lastSetTo).portals.get(0).toMap=new String("Woods"+(setTo));
			getMap("Woods"+lastSetTo).portals.get(0).resetWoods();
			break;
		case 1:
			getMap("Woods"+lastSetTo).portals.get(0).toMap=( homeClosedORnot?"HomeClosed":"Home" );
			getMap("Woods"+lastSetTo).portals.get(0).toX=8;
			getMap("Woods"+lastSetTo).portals.get(0).toY=-2;
		}
		if(setTo==2){
			getMap("Woods"+lastSetTo).portals.get(0).toX=8;
			getMap("Woods"+lastSetTo).portals.get(0).toY=-2;
		}
		
		lastSetTo =setTo;
	}
}
