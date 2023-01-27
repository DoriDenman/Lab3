public interface StockMarketSubject {
  static Double dow = 4016.22;    // dow jones
  static Double snp = 33743.84;   // S&P 500
  static Double mmm = 112.93;     // 3M stock price
  static Double msft = 240.61;    // Microsoft stock price


  void registerObserver(StockObserver o);
  void removeObserver(StockObserver o);
  void notifyObservers();

  public default void getDOW(){
    //dow += Double.format(dow);
   // news.redraw(temp); //updates graphic window // news.getTemp.redraw(temp);

  }

  public default void getSandP(){
    
  }

  public default void get3M(){
    
  }

  public default void getMicrosoft(){
    
  }
}