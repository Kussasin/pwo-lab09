package factory;

/**
 *
 * @author Bohdan Basistyi
 */
public interface MessageFactory {
    String createIntroMessage();
    String createMainMessage();
    String createClosingMessage();
}
