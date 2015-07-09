
public class Context {
	private State state;
	
	
	public Context(){
		this.state=new LampOn();
		
	}
	
	
	public void switchState(){
		
		state.switchState(this);
		
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
}
