package java0717_1;


public class GenericStudy1 {

	public static void main(String[] args) {
		// Apple Ŭ���� ��ü
		FruitBox<Apple> appleBox = new FruitBox();		
		appleBox.setFruit(new Apple() );
		
		// Banana Ŭ���� ��ü
		FruitBox<Banana> bananaBox = new FruitBox();	
		bananaBox.setFruit(new Banana() );
		
		// grape Ŭ���� ��ü
		FruitBox<Grape> grapeBox = new FruitBox();		
		grapeBox.setFruit(new Grape() );
		
		// ���׸��� ����ϱ� ������ ����ȯ�� �ʿ����.
		Apple apple = (Apple)appleBox.getFruit();
		
//		FruitBox<Toy> toyBox = new FruitBox<>();
//		toyBox.setFruit(new Toy() );
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple() );
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
//		Fruit a = new Apple();
//			  a = new Banana();
//			  a = new Grape();
		
	}

}

/*
	generic
	
	- Ŭ���� ������ Ÿ���� �����ϴ� ���
	- ���׸� Ÿ�� ǥ��(��ҹ��� ���о���)
	  T - Type
	  E - element
	  K - Key
	  V - value
	  N - number
	  
	- Ŭ������ ���׸� ǥ�� ���
	  class A<T>
	- ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�.
	  A<Tea> a = new A<Tea>();
	- ���� ���� Ŭ���� ��� ��� �����ϴ�.
	
	- ���׸� Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
	  class A<T extends Parent>
	  �� Parent Ŭ������ �ڽ� Ŭ������ Parent Ŭ������
	  	���׸����� Ÿ�� ������ �����ϴ�. �̿� �ٸ� Ŭ�������� �Ұ�
	  �� ���� Ÿ������ ������ ������ �� �ִ�.
	    �������̽��� ���� Ÿ�� ���� ����, Ŭ������ �ȵ�
	    
	- ���׸� ���ϵ� ī��<?>
	- ���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
	- �޼��� �Ű����� Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ� Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ �ٽ��ѹ� ���׸� �����ؾ� �Ѵ�.
	- �̋� ���Ǵ� ���� ���� ����Ѵ� ��� �ؼ� ? ǥ��
	
	- ���ϵ� ī���� ����
	  <? extends T> : T Ŭ������ �� �ڽı��� ����
	  <? super T> : T Ŭ������ �� ������� ����(�ڽľȵ�)
*/