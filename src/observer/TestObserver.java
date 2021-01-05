package observer;

public class TestObserver {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		Observer currentWeather = new DisplayCurrentWeather(wd);
		wd.setData(0, 0, 0);
		System.out.println(currentWeather.toString());
		wd.setData(10, 22, 1);
		System.out.println(currentWeather.toString());
	}
}
