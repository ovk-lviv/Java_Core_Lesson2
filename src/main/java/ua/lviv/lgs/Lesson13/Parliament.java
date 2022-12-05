package ua.lviv.lgs.Lesson13;

import java.util.ArrayList;
import java.util.List;

public class Parliament {
    private List<Fraction> fractionsList=new ArrayList<>();
    private static Parliament parliamentObject;



    public static Parliament getInstance() {
        if (parliamentObject == null) {
            parliamentObject = new Parliament();
        }
        return parliamentObject;
    }

    private Parliament() {

    }


    //add fraction
    public void addFraction(Fraction fraction) {
        this.fractionsList.add(fraction);

    }

    //show all fractions
    public void showFractions() {
        for (Fraction f : this.fractionsList) {
            System.out.println(f.getFractionName());
        }

    }

    //show particular fraction
    public Fraction getFraction(String name) {
        Fraction f1 = this.fractionsList.iterator().next();

        while (this.fractionsList.iterator().hasNext()) {
            String fractionName = this.fractionsList.iterator().next().getFractionName();
            if (fractionName.equals(name)) {
                f1 = this.fractionsList.iterator().next();
            }

        }
        return f1;

    }

    //remove fractions
    public void removeFraction(String name) {
        while (this.fractionsList.iterator().hasNext()) {
            String fractionName = this.fractionsList.iterator().next().getFractionName();
            if (fractionName.equals(name)) {
                this.fractionsList.remove(this.fractionsList.iterator().next());
                System.out.println("Fraction removed");
                System.out.println(this.fractionsList);
            }
            else {
                System.out.println("Something is wrong");
            }
        }
    }

    //show particular fraction deputies
    public void showFraction(String name) {
        while (this.fractionsList.iterator().hasNext()) {
            String fractionName = this.fractionsList.iterator().next().getFractionName();
            if (fractionName.equals(name)) {
                this.fractionsList.iterator().next().showFractionDeputies();
            }
        }
    }

    //add deputy to particular fraction
    public void addDeputyToFraction(String name) {
        while (this.fractionsList.iterator().hasNext()) {
            String fractionName = this.fractionsList.iterator().next().getFractionName();
            if (fractionName.equals(name)) {
                this.fractionsList.iterator().next().addDeputy(name);
            }
        }
    }

    // remove deputy
    public void removeDeputyFromFraction(String name) {
        while (this.fractionsList.iterator().hasNext()) {
            String fractionName = this.fractionsList.iterator().next().getFractionName();
            if (fractionName.equals(name)) {
                this.fractionsList.iterator().next().removeDeputy(name);
            }
        }
    }

    // show all deputies who can be bribed
    public void showAllBribers() {

        while (this.fractionsList.iterator().hasNext()) {
            this.fractionsList.iterator().next().showBribers();
        }
     }

    //show greatest briber
    public void showGreatestBriber() {
        while (this.fractionsList.iterator().hasNext()) {
            this.fractionsList.iterator().next().getGreatestBriber();
            }
        }

}
