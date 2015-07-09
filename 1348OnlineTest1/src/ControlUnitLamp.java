
public class ControlUnitLamp implements Lamp{


	Context controlUnitLamp=new Context();

	@Override
	public Boolean On() {
		// TODO Auto-generated method stub
		State on=new LampOn();
		controlUnitLamp.setState(on);
		return true;
	}

	@Override
	public Boolean Off() {
		// TODO Auto-generated method stub
		State off=new LampOff();
		controlUnitLamp.setState(off);
		return false;
	}
}
