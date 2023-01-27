public interface StockMarketSubject {
  void registerObserver(StockObserver o);
  void removeObserver(StockObserver o);
  void notifyObservers();

 
}