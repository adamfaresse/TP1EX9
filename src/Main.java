public class Main {

    public static void main(String[] args) {
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        Rallonge r = new Rallonge();
        PriseMultiple p = new PriseMultiple(2);
        l1.brancheSur(p);l2.brancheSur(p);p.brancheSur(r);
        r.brancheSurPriseMurale();// aff. "Lampe1 allumee" puis "Lampe2 allumee"
         l1.debranche();// affiche "Lampe1 eteinte"
         l1.brancheSur(p);// affiche "Lampe1 allumee"
         r.debranche();// affiche "Lampe1 eteinte" puis "Lampe2 eteinte"
    }
}
