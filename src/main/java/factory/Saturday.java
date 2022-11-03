package factory;

/**
 *
 * @author Bohdan Basistyi
 */
public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createClosingMessage() {
        return "Pierwszy dzień weekendu minął";
    }

}