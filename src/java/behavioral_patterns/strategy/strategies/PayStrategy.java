package behavioral_patterns.strategy.strategies;

/**
 * Common interface for all strategies.
 * 通用的支付方法接口
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}