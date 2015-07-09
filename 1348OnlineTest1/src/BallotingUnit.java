
public class BallotingUnit {

	ReadyLamp readylamp=new ReadyLamp();
	boolean status;
	CandidateLamp candidatelamp=new CandidateLamp();
	CandidatesButton candidatesbutton=new CandidatesButton();
	ControlUnit controlunit=new ControlUnit();
	
	private Boolean newvote(){
		if(controlunit.busyLamp.On()){
			status=true;
		}
		return status;
	}
	
	public Boolean candidatesbutton(){
		candidatelamp.On();
		controlunit.busyLamp.Off();
		return true;
	}
	
	
}
