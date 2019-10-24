import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VehicleStatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hourRate=2;
		System.out.println("Parking Vehicle status Check ");
		System.out.println("------------------------------");
		HashMap<String,HashMap<Integer,String>> parkType= new HashMap<String,HashMap<Integer,String>>();
	
		HashMap<Integer,String> standVehicle= new HashMap<Integer,String>();
		standVehicle.put(101,"N");
		standVehicle.put(102,"N");
		standVehicle.put(103,"N");
		standVehicle.put(104,"Y");
		standVehicle.put(105,"N");
		standVehicle.put(106,"Y");
		standVehicle.put(107,"N");
		standVehicle.put(108,"Y");
		standVehicle.put(109,"Y");
		standVehicle.put(110,"Y");
		
		HashMap<Integer,String> handCapVehicle= new HashMap<Integer,String>();
		handCapVehicle.put(201,"N");
		handCapVehicle.put(202,"N");
		handCapVehicle.put(203,"N");
		handCapVehicle.put(204,"N");
		handCapVehicle.put(205,"N");
		handCapVehicle.put(206,"Y");
		handCapVehicle.put(207,"Y");
		handCapVehicle.put(208,"Y");
		handCapVehicle.put(209,"Y");
		handCapVehicle.put(210,"Y");
		
		StringBuffer standardParkId= new StringBuffer();;
		StringBuffer handiCapParkId= new StringBuffer();;
		
		for(Entry<Integer, String> entry : standVehicle.entrySet()) { 
			standardParkId.append(" "+ entry.getKey()+"");
		}
		
		for (Entry<Integer, String> entry : handCapVehicle.entrySet()) { 
			handiCapParkId.append(entry.getKey()+",");
		}
		System.out.println("Standar  Vehicle ::: "+" Parking Ids "+"=["+standardParkId+"]");
		System.out.println("HandiCap Vehicle ::: "+" Parking Ids "+"=["+handiCapParkId+"]");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("Parking Vehicle Type  status Check :::: ");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		
		parkType.put("STANDARD", standVehicle);
		parkType.put("HANDICAP", handCapVehicle);
		boolean flag=false;
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter your vechicle parking slot type STANDARD/HANDICAP:");    
        String name = in.next(); 
        if(!parkType.containsKey(name)){
        	System.out.println("  Invalid Vechicle parking Type ");
        	flag=true;
        }
        System.out.print("Enter your slot Id: ");  
        int parkId = in.nextInt();  
        in.close();      
        
        if(!flag){
	             HashMap<Integer, String> vehciCleTye= parkType.get(name);
	        	 if(vehciCleTye.get(parkId).equals("N")){
		            System.out.println(name+" Parking  Slot Not available ");
		         }
		         else
		         {
		            System.out.println(name+" Parking  Slot  available");
		            vehciCleTye.put(parkId, "Y");
		            parkType.put(name, vehciCleTye);
		         }
	    }else{
	    	System.out.println("Invalid Parking Id");
	    }
        
        System.out.println(" Use Case: View Current Potential Revenue of All Occupied Parking Places");
       
	}

}
