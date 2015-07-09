
public class ReadyLamp implements Lamp{

	Context readyLamp=new Context();

	@Override
	public Boolean On() {
		// TODO Auto-generated method stub
		State on=new LampOn();
		readyLamp.setState(on);
		return true;
	}

	@Override
	public Boolean Off() {
		// TODO Auto-generated method stub
		State off=new LampOff();
		readyLamp.setState(off);
		return false;
	}

}
