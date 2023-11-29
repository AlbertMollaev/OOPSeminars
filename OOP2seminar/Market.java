package OOP2seminar;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Новый клиент, " + actor.getName() + " ,зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor item : actors) {
            System.out.println(item.getName() + " покинул магазин");
            queue.remove(item);
        }
    }


    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " совершил заказ");
            }
        }
    }


    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> relasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                relasedActors.add(actor);
                System.out.println(actor.getName() + " покинул очередь");
            }
        }
        releaseFromMarket(relasedActors);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
