public class Lampe extends ComposantElectrique{
    private String nomLampe;

    public Lampe(String nomLampe){
        this.nomLampe = nomLampe;
    }

    @Override
    public void brancheSur(PriseMultiple femmeComp) {
        if(this.isInTension ^ femmeComp.isInTension){
            if(femmeComp.isInTension){
                System.out.println(this.nomLampe+" allume");
            }else{
                System.out.println(this.nomLampe+" eteinte");
            }
        }
        super.brancheSur(femmeComp);


    }


    @Override
    public void debranche() {
        super.debranche();
        System.out.println(this.nomLampe+" eteinte");


    }

    @Override
    public void brancheSurPriseMurale() {
        super.brancheSurPriseMurale();
        System.out.println(this.nomLampe+" allume");

    }
}
