import java.util.Scanner;


// clasa in care sunt stocate echipele
// clasa 
 public class echipe {

    String nume;
    String liga;
    int pozitie;


    
    
    

   // contructor pentru echipa avand numele,liga in care participa si pozitie in liga
    echipe(String nume,String Liga,int pozitie)
    {
        this.nume=nume;
        this.liga=Liga;
        this.pozitie=pozitie;


    }


//metoda pentru a modifica numele pentru echipa citita
public void numeptechipa(String nume)
{

this.nume=nume;


}

//metoda pentru a afla care echipe sunt pe un anumit loc


public int searchplace(int pozitie)
{
if (this.pozitie==pozitie)
{
    
    return 1;
}
return 0;

}

//
//metoda pentru a afla cate echipe se afla intr-o liga

public int searchliga(String liganume)
{
    
    if (this.liga.equals(liganume))
    {
        return 1;
    }
    else
    {
    return 0;
    }


}
 }









































    










    

