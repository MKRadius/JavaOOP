public class Television {
	private int channelCount, currentChannel = 1;
	private boolean tvOn = false;

	public Television(int count) {
		this.channelCount = count;
	}

	public void setChannel(int channel) {
		if (channel > channelCount) {
			channel = 1;
		}
		currentChannel = channel;
	}

	public int getChannel() {
		return currentChannel;
	}

	public int getChannelCount() {
		return channelCount;
	}

	public boolean isOn() {
		return tvOn;
	}

	public void pressOnOff() {
		this.tvOn = !tvOn; 
	}
}