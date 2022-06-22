package it.accentur.javaFoundamentals.interfaces;

public class Program {
    public static void main(String[] args) {
        Person d1 = new Developer(); // per una questione di rimanere più generali possibile
        Person h1 = new Hero();

        listenTo(h1); //grazie al polimorfismo
        listenTo(d1); //grazie al polimorfismo
        Developer d2 = new Developer();
        Iterable<Developer> devs = d2.recruit();

        for (Developer d : devs) {
            System.out.println(devs);
        }
    }
    public static void listenTo (Person p) {
        p.speak();
    }
}
