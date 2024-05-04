package prototype.siteexample;


/*
 * O Retangle herda m�todos e atributos de Shape e implementa o m�todo clone que apenas retorna o objeto atual
 * A classe abaixo tem um m�todo construtor que assim que for instanciada o parametro passado, 
 * que � um objeto do tipo Retangle, tem seus atributos atribuido a classe
 * o equals aqui apenas recebe um Object e verifica se esse objeto n�o � um Retangle ou um Shape
 * se tudo der certo, ele transforma o objt em Retangle e verifica se os atributos dele � igual aos atributos 
 * da classe atual
 * 
 * */

public class Rectangle extends Shape {
	public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
