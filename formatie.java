import java.util.Scanner;

// clasa formatie unde vom executa main si vom instantia, apela metodele
 class formatie
{

public static void main(String[] args)
{
    String nume;
    String nume1,nume2,nume3;
    int n=25;
 

echipe echipa=new echipe("Barca","La liga",2);
echipe echipa1=new echipe("Real Madrid","La liga",1);
echipe echipa2=new echipe("Bayern ","Bundesliga",1);
echipe echipa3=new echipe("PSG","Ligue",1);
echipe echipa4=new echipe("Juventus","SeriaA",5);

System.out.println("apasa tasta 1 pentru a modifca numele echipelor");
System.out.println("apasa tasta 2 pentru a afla echipele aflate pe o anumita pozitie");
System.out.println("apasa tasta 3 pentru a afla numarul de echipe dintr o liga");
System.out.println("apasa tasta 4 pentru stop program");
int stop=1;
while (stop==1)
{
Scanner sc=new Scanner(System.in);
int optiune=sc.nextInt();
switch(optiune)
{
case 1:
{
     Scanner echipe = new Scanner(System.in) ;
        System.out.println("citeste numele echipei 1");
        nume=echipe.nextLine();
        echipa.numeptechipa(nume);
        System.out.println("citeste numele echipei 2");
        nume1=echipe.nextLine();
        echipa1.numeptechipa(nume1);
        System.out.println("citeste numele echipei 3");
        nume2=echipe.nextLine();
        echipa2.numeptechipa(nume2);
        System.out.println("citeste numele echipei 4");
        nume3=echipe.nextLine();
        echipa3.numeptechipa(nume3);
        System.out.println("citeste numele echipei 5");
        nume=echipe.nextLine();
    

break;
}
case 2:
{
    System.out.println("introdu pozitia in campionat pentru cautare");
    int cautare=sc.nextInt();

if (echipa.searchplace(cautare)==1)
System.out.println(echipa.nume);

if (echipa1.searchplace(cautare)==1)
System.out.println(echipa1.nume);

if(echipa2.searchplace(cautare)==1)
System.out.println(echipa2.nume);

if(echipa3.searchplace(cautare)==1)
System.out.println(echipa3.nume);
if (echipa4.searchplace(cautare)==1)
System.out.println(echipa4.nume);


}
break;
case 3:
{
   int suma=0;
    System.out.print("introdu liga pentru cautare:");
    Scanner text=new Scanner(System.in);
     String cautare=text.nextLine();
     
     System.out.println(echipa3.liga);

if(echipa.searchliga(cautare)==1)
suma=suma+1;
if(echipa1.searchliga(cautare)==1)
suma=suma+1;
if(echipa2.searchliga(cautare)==1)
suma=suma+1;
if(echipa3.searchliga(cautare)==1)
suma=suma+1;
if(echipa4.searchliga(cautare)==1)
suma=suma+1;

System.out.print("numar de echipe in campionatul "+cautare+":");
if (suma==0)
{
System.out.println("0");
}
else
{
System.out.println(suma);
}

break;

}
case 4:
{
stop=0;
break;
}
}





}
}
}


    



    

































