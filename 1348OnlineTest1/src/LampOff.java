
public class LampOff extends State{
	
	public LampOff(){
		this.stateName="Off";
	}

	@Override
	// TODO Auto-generated method stub
	String switchState(Context c) {
		State off=new LampOff();
		c.setState(off);
		return off.getStateName();
	}

}
