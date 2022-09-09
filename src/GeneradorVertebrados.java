public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("pollo", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("perro", "perro"); 
        
        return miVertebrados;
    }
}
