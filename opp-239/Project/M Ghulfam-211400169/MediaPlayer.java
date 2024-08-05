class MediaPlayer {
	private int volume;

	public MediaPlayer(){
		this.setVolume(10);

	}
	public MediaPlayer(int volume){
		this.setVolume(volume);
	}
	public void setVolume(int volume){
		this.volume = volume;
	}
	public int getVolume(){
		return volume;
	}
	public int volumeUp(){
		return  volume + 10;
		
	}
	public int volumeDown(){
		return  volume - 10;
		
	}
	public String toString(){
		return "volume: " +getVolume();
	}
	
}