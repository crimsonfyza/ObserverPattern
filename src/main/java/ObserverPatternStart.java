public class ObserverPatternStart {

    public static void main(String[] args) {
        //create subject
        Newspaper topic = new Newspaper();

        //create observers
        Observer subscriber1 = new NewspaperSubscriber("Kevin");
        Observer subscriber2 = new NewspaperSubscriber("Mark");
        Observer subscriber3 = new NewspaperSubscriber("Aron");

        //register observers to the subject
        topic.register(subscriber1);
        topic.register(subscriber2);
        topic.register(subscriber3);

        //attach observer to subject
        subscriber1.setSubject(topic);
        subscriber2.setSubject(topic);
        subscriber3.setSubject(topic);

        //test subscriber1 los
        subscriber1.update();

        //Controleer alle subscribers iteratief en print degene met een update.
        topic.postMessage("Het dagblad is geupload!");

        // test subscriber1 los
        subscriber1.update();

    }

}