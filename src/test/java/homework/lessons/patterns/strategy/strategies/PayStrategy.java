package homework.lessons.patterns.strategy.strategies;

/**
 * Общий интерфейс всех стратегий.
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
