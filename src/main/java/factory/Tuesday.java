package factory;

/**
 *
 * @author Bohdan Basistyi
 */
public class Tuesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Wtorek.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Wtorek.";
    }

    @Override
    public String createClosingMessage() {
        return "Drugi dzień pracy w tym tygodniu minął";
    }

}
