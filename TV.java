class Tv {
  String marca;
  int volume;
  int tamanho;
  int voltagem;
  int canal;
  int consumo;

  void canal() {
    
  }

  int volume_aumentar(){
   if (volume < 10){
     volume++;
       }
     return volume;
  }

  int volume_diminuir(){
     if (volume > 1){
     volume--;
       }
     return volume;
  }

  void ligar() {
    System.out.println("ligou");
    consumo=voltagem*tamanho
    System.out.println (consumo);
  }

  void desligar(){
    System.out.ptintln("desligou");
  }

  
