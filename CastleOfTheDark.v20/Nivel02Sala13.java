import greenfoot.*;
public class Nivel02Sala13 extends Nivel02{
    
    public Nivel02Sala13(int posX, int posY){     
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY); // norte
       //addObject (new porta_n02_s12(),520,456); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       //addObject (new porta_n02_s07(),27,230) ; // oeste
       addObject (new alavanca(),300,300) ; // oeste 
       addObject(new enemy_bat(), 800,400);
       addObject(new enemy_bat(), 400,400);
       addObject(new enemy_bat(), 700,400);
    }
}
