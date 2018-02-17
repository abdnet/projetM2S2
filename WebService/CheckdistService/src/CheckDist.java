import java.util.Random;


public class CheckDist {
	public String checkDist(String distName){
		if(!distName.equals("")){
			Random ran = new Random();
			int x = ran.nextInt(6) + 5;
			
			if(x%2==0){
	        	return "Ok";
	        }else{
	        	return "Non";
	        }
		}else{
			return "Non";
		}
	}	
}