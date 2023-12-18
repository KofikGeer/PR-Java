package PR_22;
import java.util.Objects;

// Интерфейс стула
interface Chair {
    String sit();
}

// Викторианский стул
class VictorianChair implements Chair {
    @Override
    public String sit() {
        return "Sitting on a Victorian chair";
    }
}

// Мультифункциональный стул
class MultifunctionalChair implements Chair {
    @Override
    public String sit() {
        return "Sitting on a multifunctional chair";
    }
}

// Магический стул
class MagicChair implements Chair {
    @Override
    public String sit() {
        return "Sitting on a magic chair";
    }
}

// Фабрика стульев
interface ChairFactory {
    Chair createChair();
}

// Фабрика викторианских стульев
class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Фабрика мультифункциональных стульев
class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

// Фабрика магических стульев
class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

// Клиент
class Client {
    private final ChairFactory chairFactory;

    public Client(ChairFactory chairFactory) {
        this.chairFactory = Objects.requireNonNull(chairFactory);
    }

    public void sit() {
        Chair chair = chairFactory.createChair();
        System.out.println(chair.sit());
    }
}

public class Main {
    public static void main(String[] args) {
        VictorianChairFactory victorianChairFactory = new VictorianChairFactory();
        Client client1 = new Client(victorianChairFactory);
        client1.sit();

        MultifunctionalChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        Client client2 = new Client(multifunctionalChairFactory);
        client2.sit();

        MagicChairFactory magicChairFactory = new MagicChairFactory();
        Client client3 = new Client(magicChairFactory);
        client3.sit();
    }
}



