import java.util.Scanner;

public class TestTeamPlayer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		    System.out.println("1. Add a new Team\n2. delete the team\n3. search by tid\n4. search by playerid");
		    System.out.println("5. delete player from the team\n6. add a new player in the team\n7. display all\n8. exit\nchoice");
		    choice=sc.nextInt();
		    
		    switch(choice) {
		    case 1:
		    	TeamService.addNewTeam();
		    	break;
		    case 2: 
		    	break;
		    case 3:
		    	System.out.println("enter team id to search");
		    	int tid=sc.nextInt();
		    	Team t=TeamService.findTeamById(tid);
		    	if(t!=null) {
		    		System.out.println(t);
		    	}else {
		    		System.out.println("not found");
		    	}
		    	
		    	break;
		    case 4:
		    	System.out.println("enter playerid to search team");
		    	int pid=sc.nextInt();
		    	t=TeamService.serachByPlayerId(pid);
		    	if(t!=null) {
		    		System.out.println(t);
		    	}else {
		    		System.out.println("not found");
		    	}
		    	break;
		    case 5:
		    	
		    	break;
		    case 6: 
		    	System.out.println("enetr teamid");
		    	 tid=sc.nextInt();
		    	boolean status=TeamService.addNewPlayer(tid);
		    	if(status) {
		    		System.out.println("player added successfully");
		    	}else {
		    		System.out.println("team not found");
		    	}
		    	break;
		    case 7:
		    	Team[] tarr=TeamService.findAll();
		    	for(Team t1:tarr) {
		    		if(t1!=null) {
		    			System.out.println(t1);
		    		}else {
		    			break;
		    		}
		    	}
		    	
		    	break;
		    case 8: 
		    	System.out.println("Thank you for visiting....");
		    	sc.close();
		    	break;
		    default:
		    	break;
		    }
		}while(choice!=8);
		
		

	}

}
