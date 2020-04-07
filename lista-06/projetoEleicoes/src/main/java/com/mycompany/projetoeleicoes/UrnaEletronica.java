
package com.mycompany.projetoeleicoes;

public class UrnaEletronica {
    private Integer bolso =0;
    private Integer bolso_total=0;
    private Integer lula =0;
    private Integer lula_total=0;
    private Integer votos = 0;
    private String presidente = "";
    private Integer contagem = 0;
    private Integer count =0;
    private Integer voto = 0;
    private Integer votos_totais=0;
    private Integer votation =0;
    private Integer fim = 0;
    
    
    public void status1 (){
       System.out.println("O candidato "+presidente+" recebeu 1 voto, totalizando:" + contagem);  
    }
    public void status (){
        
        System.out.println("O candidato "+presidente+" recebeu 1 voto, totalizando:" + contagem);     
        System.out.println("--------------------------");
             
               
    }
    public void statusVotos(){
        System.out.println("Total de votos:" + fim); 
        
    }
    public void statusVotos1(){
         System.out.println("Total de votos:" + votos); 
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-");
    }
    public void encerrar(){
        System.out.println("Eleição encerrada!");
        System.out.println("----------------");
        
        System.out.println("Resultado: " + presidente +" venceu");
    }
    public void encerrar1(){
       System.out.println("Eleição encerrada!");
        System.out.println("----------------");
        
        System.out.println("Resultado: " + presidente +" venceu"); 
    }
    
    public void totalGeralVotacao (){
        System.out.println("Total de votos:" + votation);
    }
    public void contando(){
       voto++; 
    }
    public void contandoCadaCandidato(){
        contagem ++;        
        
    }
    public void contadoCadaCandidato1(){
        contagem++;
    }
    public void contandoTotal(){
        votos_totais = contagem + count;
    }

    public void contandoTotalLula(){
        votos = contagem+contagem;
    }
    
    public void somaGeral(){
        votation = votos+votos_totais;
    }
    
    public void decisao(){
        if (bolso > lula){
            System.out.println("Bolso");
        }else{
            System.out.println("Lula");
        }
        System.out.println("Resultado:" +"venceu");
    }
    public void votacao(){
        voto++;
    }
    public void votosBolso(){
        bolso +=1;
        bolso_total++;
        votos ++;
    }
    public void votosLula(){
        lula ++;
        lula_total++;
        votos ++;
    }

    public Integer getBolso() {
        return bolso;
    }

    public Integer getLula() {
        return lula;
    }

    public Integer getVotos() {
        return votos;
    }

    public Integer getBolsoTotal() {
        return bolso_total;
    }

    public void setBolsoTotal(Integer bolso_total) {
        this.bolso_total = bolso_total;
    }

    public Integer getLula_total() {
        return lula_total;
    }

    public void setLulaTotal(Integer lula_total) {
        this.lula_total = lula_total;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public Integer getContagem() {
        return contagem;
    }

    public void setContagem(Integer contagem) {
        this.contagem = contagem;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public Integer getVotos_totais() {
        return votos_totais;
    }

    public void setVotos_totais(Integer votos_totais) {
        this.votos_totais = votos_totais;
    }

    public Integer getFim() {
        return fim;
    }

    public void setFim(Integer fim) {
        this.fim = fim;
    }

    

    
    
}
