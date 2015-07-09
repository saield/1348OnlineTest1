import java.util.ArrayList;


public class ControlUnit {
	ControlUnitLamp on;
	BusyLamp busyLamp;
	BallotButton ballotbutton;
	ArrayList candidates=new ArrayList<Candidates>();
	
	private void setCandidates(Candidates c){
		candidates.add(c);
	}
	
	private void ballotbutton(){
		boolean status;
		status= ballotbutton.press();
		if(status==true){
			busyLamp.On();
		}
	}
	
}
