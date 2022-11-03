package factory;

/**
 *
 * @author Bohdan Basistyi
 */
public class Friday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createClosingMessage() {
        return "Ostatni dzień pracy w tym tygodniu minął";
    }

}