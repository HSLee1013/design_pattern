package lotteria.material;

public class Sangchu implements Material{
    Material material;

    public Sangchu(Material material){
        this.material = material;
    }

    public Sangchu(){}

    @Override
    public void add() {
        System.out.println("상추 추가");
        if(material != null){
            material.add();
        }
    }
}
