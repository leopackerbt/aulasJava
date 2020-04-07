
package com.mycompany.clubefutebol;

public class ProgramaCampeonato {
    public static void main(String[] args) {
        Clube team = new Clube();
        Clube team1 = new Clube();
        System.out.println("Começa a temporada"); 
        team1.setClub("Palmeiras");
        team.setClub("Coritnhians");
        
        
        team1.setMsgvitoria(" ganhou");
        team1.vitoriaTimao();
        team1.statusTimeVitoria();   
        
        team.setMsgvitoria(" ganhou");
        team.vitoriaTimao();
        team.statusTimeVitoria();

        team1.setMsgvitoria(" empatou");
        team1.empateTimao();
        team1.statusTimeVitoria(); 
        
        team.setMsgvitoria(" ganhou");
        team.vitoriaTimao();
        team.statusTimeVitoria();

        team1.setMsgvitoria(" ganhou");
        team1.vitoriaTimao();
        team1.statusTimeVitoria();
        
        team.setMsgvitoria(" empatou");
        team.empateTimao();
        team.statusTimeVitoria();
        
        team1.setMsgvitoria(" perdeu");
        team1.statusTimeVitoria();
        
        
        team.setMsgvitoria(" perdeu");             
        team.statusTimeVitoria();
        
        team1.setMsgvitoria(" empatou");
        team1.empateTimao();
        team1.statusTimeVitoria();
        
        team.setMsgvitoria(" ganhou");
        team.vitoriaTimao();
        team.statusTimeVitoria();
        
        team1.setMsgvitoria(" perdeu");
        team1.statusTimeVitoria();
        
        team.setMsgvitoria(" ganhou");
        team.vitoriaTimao();
        team.statusTimeVitoria();
        
        team1.setMsgvitoria(" empatou");
        team1.empateTimao();
        team1.statusTimeVitoria();
        
        team.setMsgvitoria(" ganhou");
        team.vitoriaTimao();
        team.statusTimeVitoria();
        
        
        
         team.setVictory(5);
        team.setPerda(1);
        team.setDraw(1);
        team.setTotal(16);
        team.finalTemporada();
        
        team1.setVictory(2);
        team1.setPerda(2);
        team1.setDraw(3);
        team1.setTotal(9);
        team1.finalTemporada();
        
        
       
        
    }
}

