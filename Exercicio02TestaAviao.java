package exerciciosJavaGeneration5;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Exercicio02TestaAviao {

	public static void main(String[] args) {
		
		Exercicio02Aviao aviao1 = new Exercicio02Aviao();
		
		aviao1.setMarca("Boeing");
		aviao1.setModelo("274");
		aviao1.setAnoFabricacao(2014);

		System.out.println("Marca: " + aviao1.getMarca());
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Abo de fabrica��o: " + aviao1.getAnoFabricacao());
		
		aviao1.acelerar(100);
		System.out.println("Velocidade: " + aviao1.getVelocidade());
		aviao1.decolar();
		aviao1.pousar();
		aviao1.frear(100);
		System.out.println("Velocidade: " + aviao1.getVelocidade());
		
	}

}