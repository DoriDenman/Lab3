public interface WeatherSubject {
    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();

    static Integer temperature = 10;    //  minneapolis temp
    static Integer precipitation = 7;   //  chance of precip
    static Integer airQuality = 46;     //  air quality index

   

 public default void getTemp(){

    String temp = "";
    temp += String.format("TEMP %d PREC %d%% AIR %d %n", temperature, precipitation, airQuality);
   // news.redraw(temp);

    
 }

 public default void getPercip(){
    
 }

 public default void getAirQual(){

 }
    
}
