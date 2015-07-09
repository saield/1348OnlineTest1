
public class CandidateLamp implements Lamp{
	Context candidateLamp=new Context();

	@Override
	public Boolean On() {
		// TODO Auto-generated method stub
		State on=new LampOn();
		candidateLamp.setState(on);
		return true;
	}

	@Override
	public Boolean Off() {
		// TODO Auto-generated method stub
		State off=new LampOff();
		candidateLamp.setState(off);
		return false;
	}
}
