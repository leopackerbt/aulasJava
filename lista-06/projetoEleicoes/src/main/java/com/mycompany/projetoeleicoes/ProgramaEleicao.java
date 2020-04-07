
package com.mycompany.projetoeleicoes;

public class ProgramaEleicao {
    public static void main(String[] args) {
        UrnaEletronica candidato = new UrnaEletronica ();
        UrnaEletronica candidato1 = new UrnaEletronica (); 
        
        System.out.println("Começou a eleição");
        candidato.setPresidente("Bozo");
        candidato1.setPresidente("Luladrão");
        
       candidato1.contadoCadaCandidato1();
        candidato1.contandoTotalLula();
        candidato1.status1();
        
        candidato.contandoCadaCandidato();
        candidato.contandoTotal();
        candidato.status();        
                            
        
        
        candidato1.contadoCadaCandidato1();
        candidato1.contandoTotalLula();
        candidato1.status1();
        
        candidato.contandoCadaCandidato();
        candidato.contandoTotal();
        candidato.status();        
                            
         
        candidato1.contadoCadaCandidato1();
        candidato1.contandoTotalLula();
        candidato1.status1();
        
        candidato.contandoCadaCandidato();
        candidato.contandoTotal();
        candidato.status();        
                            
        
        candidato.contandoCadaCandidato();
        candidato.contandoTotal();
        candidato.status();        
         
        
        candidato.contandoCadaCandidato();
        candidato.contandoTotal();
        candidato.status();        
                            
        
        candidato1.setFim(8);
        candidato1.statusVotos();
        candidato1.encerrar1();
        
        
        
    }
}
