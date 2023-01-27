public interface Subject {
  void registerObserver(StockObserver o);
  void removeObserver(StockObserver o);
  void notifyObservers();

}
