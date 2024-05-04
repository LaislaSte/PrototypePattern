package prototype.siteexample;


/*
 * O Circle herda m�todos e atributos de Shape e implementa o m�todo clone que apenas retorna o objeto atual
 * A classe abaixo tem um m�todo construtor que assim que for instanciada o parametro passado, 
 * que � um objeto do tipo Circle, tem seu atributo atribuido a classe,
 * o equals aqui apenas recebe um Object e verifica se esse objeto n�o � um Circle ou um Shape
 * se tudo der certo, ele transforma o objt em Circle e verifica se o atributo dele � igual ao atributo 
 * da classe atual
 * 
 * */

public class Circle extends Shape {
	public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
