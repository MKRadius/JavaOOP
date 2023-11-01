public class Television {
	private int currentChannel = 1;
	private boolean tvOn = false;

	public void setChannel(int channel) {
		if (channel < 0 || channel > 10) {
			channel = 1;
		}
		currentChannel = channel;
	}

	public int getChannel() {
		return currentChannel;
	}

	public boolean isOn() {
		return tvOn;
	}

	public void pressOnOff() {
		this.tvOn = !tvOn; 
	}
}