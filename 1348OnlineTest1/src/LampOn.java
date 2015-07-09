
public class LampOn extends State{
	
	public LampOn(){
		this.stateName="On";
	}

	@Override
	// TODO Auto-generated method stub
	String switchState(Context c) {
		State on=new LampOn();
		c.setState(on);
		return on.getStateName();
	}

}
