package homework.lessons.patterns.strategy.order;

import homework.lessons.patterns.strategy.strategies.PayStrategy;

/**
 * Класс заказа. Ничего не знает о том каким способом (стратегией) будет
 * расчитыватся клиент, а просто вызывает метод оплаты. Все остальное стратегия
 * делает сама.
 */
public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}