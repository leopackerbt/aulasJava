
package com.mycompany.clubefutebol;

public class Clube {
    private Integer vitoria = 0;
    private Integer Derrota = 0;
    private Integer Empate = 0;
    private Integer pontuacao = 0;
    private Integer vitoria_corinthians = 0;    
    private Integer derrota_corinthians =0;
    private Integer empate_corinthians =0;
    private Integer pontuacao_corinthians = 0;
    private String club ="";
    private String msgderrota = "";
    private String msgvitoria ="";
    private String msgempate="";   
    private Integer victory = 0;
    private Integer perda =0;
    private Integer draw =0;
    private Integer total =0;
    
    
    public void statusTimeVitoria(){  
                      
        System.out.println(  club + msgvitoria + " nessa rodada");
        System.out.println(club  + " pontos:" + pontuacao_corinthians );
        System.out.println("----------------");

        
    }
    
    public void finalTemporada(){
       System.out.println("Final de temporada:");
        System.out.println(club + ":" + victory + " vitórias, " + draw + " empates, " + perda + " derrotas." );
        System.out.println("Total de pontos: " + total);
        System.out.println("----------------");   
    }
    
    public void empate (String e){
        msgempate = "empatou";
    }
    public void derrota (String d){
        msgderrota = "perdeu";
    }
    public void vitoria (String v){
        msgvitoria = "vitoria";
    }    
   
    public void vitoriaTimao(){
        vitoria_corinthians ++;
        pontuacao_corinthians+=3;
    }
    public void derrotaTimao (){
        
        derrota_corinthians ++;
    }
    public void empateTimao(){
        empate_corinthians ++;
        pontuacao_corinthians ++;
    }
    public void vitoria(){
        pontuacao +=3;
        vitoria ++;
    }
    public void empate (){
        pontuacao ++;
        Empate ++;
    }
    public void derrota (){
        Derrota++;
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    public Integer getPerda() {
        return perda;
    }

    public void setPerda(Integer perda) {
        this.perda = perda;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    
    public String getMsgvitoria() {
        return msgvitoria;
    }

    public void setMsgvitoria(String msgvitoria) {
        this.msgvitoria = msgvitoria;
    }

    public String getMsgderrota() {
        return msgderrota;
    }

    public void setMsgderrota(String msgderrota) {
        this.msgderrota = msgderrota;
    }

    public String getMsgEmpate() {
        return msgempate;
    }

    public void setMsgEmpate(String msgempate) {
        this.msgempate = msgempate;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }     
    

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    

    public Integer getVitoria() {
        return vitoria;
    }

    public void setVitoria(Integer vitoria) {
        this.vitoria = vitoria;
    }

    public Integer getDerrota() {
        return Derrota;
    }

    public void setDerrota(Integer Derrota) {
        this.Derrota = Derrota;
    }

    public Integer getEmpate() {
        return Empate;
    }

    public void setEmpate(Integer Empate) {
        this.Empate = Empate;
    }

    

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Integer getVitoriaCorinthians() {
        return vitoria_corinthians;
    }

    public void setVitoriaCorinthians(Integer vitoria_corinthians) {
        this.vitoria_corinthians = vitoria_corinthians;
    }

    public Integer getDerrotaCorinthians() {
        return derrota_corinthians;
    }

    public void setDerrotaCorinthians(Integer derrota_corinthians) {
        this.derrota_corinthians = derrota_corinthians;
    }

    public Integer getEmpateCorinthians() {
        return empate_corinthians;
    }

    public void setEmpateCorinthians(Integer empate_corinthians) {
        this.empate_corinthians = empate_corinthians;
    }

    public Integer getPontuacaoCorinthians() {
        return pontuacao_corinthians;
    }

    public void setPontuacaoCorinthians(Integer pontuacao_corinthians) {
        this.pontuacao_corinthians = pontuacao_corinthians;
    }

    
    
    
}
