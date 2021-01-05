package observer;

public class DisplayCurrentWeather implements Observer {
	private double temperature;
	private double humidity;
	private double pressure;
	private Subject weatherData;
	
	public DisplayCurrentWeather(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public String toString() {
		return "Temperature: " + temperature + 
				"\u2103\nHumidity: " + humidity + 
				"%\nPressure: " + pressure + "";
	}
}
