package taxation;

import java.util.ArrayList;
import java.util.List;

public class MyCPA {
    // NOT THE SAME AS List<Object>
//    public static void showAll(List<? extends Object> l) {
    public static void showAll(List<?> l) {
        for (Object obj : l) {
            System.out.println("> " + obj);
        }
    }

    public static void calculateTaxes(Taxable t) { }

    // Covariant
    public static void calculateBulkTaxes(List<? extends Taxable> lt) {
        for(Taxable t : lt) {
            calculateTaxes(t);
        }
//        lt.add(new Taxable());
//        lt.add(new Corporation());
//        lt.add(new Individual());
    }

    // Contravariant
    public static void addIndividualClients(List<? super Individual> li) {
        li.add(new Individual());
        li.add(new Individual());
//        Individual i = li.get(0);
    }

    public static void main(String[] args) {
        List<Taxable> clients = new ArrayList<>();
        clients.add(new Corporation());
        clients.add(new Corporation());
        clients.add(new Individual());
        calculateBulkTaxes(clients);

        addIndividualClients(clients);

        List<Individual> bobsClients = new ArrayList<>();
        bobsClients.add(new Individual());
        bobsClients.add(new Individual());
        bobsClients.add(new Individual());
        addIndividualClients(bobsClients);
        calculateBulkTaxes(bobsClients);
        calculateTaxes(new Individual());

//        List<String> ls = null;
//        calculateTaxes(ls);

        List<Object> lobj = null;
        addIndividualClients(lobj);
    }
}
