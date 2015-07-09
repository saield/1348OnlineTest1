
public class BallotButton implements Button{
	Boolean status;
	@Override
	public Boolean press() {
		return status=true;
	}

}
