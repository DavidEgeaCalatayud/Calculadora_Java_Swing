/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_swing;

public class Modelo {
  float resultado =0; ;
 float primernumero;
 float segundonumero;
    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

   public float resultadoSuma(float resultado) {
            
        return primernumero + segundonumero;
}
     public float resultadoResta(float resta) {
          resultado = primernumero - segundonumero;
         return resultado;}
     public float resultadoMultiplicacion(float multiplicacion) {
        return primernumero * segundonumero;}
      public float resultadoDividir(float dividir) {
                
       resultado =  primernumero / segundonumero;
      return resultado;
}
      public String sinCero(float resultado){
     String retorno="";
     
     retorno = Float.toString(resultado);
     if(resultado%1==0){
         retorno = retorno.substring(0, retorno.length()-2);
     }
     return retorno;
    }
}

   
    