class TokenGenerator {
    private int token = 1;

    // synchronized method to ensure thread safety
    public synchronized int getNextToken(String counterName) {
        int currentToken = token;
        System.out.println(counterName + " issued Token Number: " + currentToken);
        token++;
        try {
            Thread.sleep(100); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return currentToken;
    }
}

// Runnable class for counters
class Counter implements Runnable {
    private String counterName;
    private TokenGenerator tokenGenerator;
    private int maxTokens;

    public Counter(String counterName, TokenGenerator tokenGenerator, int maxTokens) {
        this.counterName = counterName;
        this.tokenGenerator = tokenGenerator;
        this.maxTokens = maxTokens;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxTokens; i++) {
            tokenGenerator.getNextToken(counterName);
        }
    }
}

public class FSTS {
    public static void main(String[] args) {
        TokenGenerator tokenGenerator = new TokenGenerator();
        int tokensPerCounter = 5; // Each counter issues 5 tokens

        // Creating threads for 3 counters
        Thread counter1 = new Thread(new Counter("Counter1", tokenGenerator, tokensPerCounter));
        Thread counter2 = new Thread(new Counter("Counter2", tokenGenerator, tokensPerCounter));
        Thread counter3 = new Thread(new Counter("Counter3", tokenGenerator, tokensPerCounter));

        // Starting all counter threads
        counter1.start();
        counter2.start();
        counter3.start();

        // Wait for all threads to finish
        try {
            counter1.join();
            counter2.join();
            counter3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tokens issued.");
    }
}
