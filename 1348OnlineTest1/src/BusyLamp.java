
public class BusyLamp implements Lamp{
	Context busyLamp=new Context();
	

	@Override
	public Boolean On() {
		// TODO Auto-generated method stub
		State on=new LampOn();
		busyLamp.setState(on);
		return true;
		
	}

	@Override
	public Boolean Off() {
		// TODO Auto-generated method stub
		State off=new LampOff();
		busyLamp.setState(off);
		return false;
	}
}
