
package generadordatos;

import java.io.*;
import java.io.IOException;

public class GeneradorDatos {
    
BufferedWriter buffer;
BufferedReader NombreH;
BufferedReader NombreM;
BufferedReader Apellido;
BufferedReader NombreHM;
String [] Abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","ñ","n","o","p","q","r","s"
               ,"t","u","v","w","x","y","z"};
    private int a;

public GeneradorDatos()throws IOException{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));

}
 /*public static void main(String[] args)throws IOException {
String cadena="NombreHM,Correo,Nip";
GeneradorDatos da=new GeneradorDatos();
da.Generar(cadena,1000,'|');
    
}*/
 
/*public void Crear(String ruta)throws IOException{
buffer=new BufferedWriter(new FileWriter(ruta));
}*/

public void Crear(FileWriter fw)throws IOException{
buffer=new BufferedWriter(fw);
}

public void Generar(String opciones,int cantidad,char Separador)throws IOException{
String [] Opciones =opciones.split(",");
String [] Datos= new String [Opciones.length];
String Dato="";
int contador=0;


while(contador != cantidad){


for(int i=0;i<Datos.length;i++){
if (Opciones[i].equals("NombreM")||Opciones[i].equals("NombreM,")){
Dato=NombresM();
Datos[i]=Dato;
}else if (Opciones[i].equals("NombreH")||Opciones[i].equals("NombreH,")){
Dato=NombresH();
Datos[i]=Dato;
}else if(Opciones[i].equals("NombreHM")||Opciones[i].equals("NombreHM,")){
Dato=NombreHM();
Datos[i]=Dato;
}else if(Opciones[i].equals("Apellidos")||Opciones[i].equals("Apellidos,")){
Datos[i]=Apellidos();    
}else if (Opciones[i].equals("Correo")||Opciones[i].equals("Correo,")){
Datos[i]=Correo(Dato);
}else if (Opciones[i].equals("Nip")||Opciones[i].equals("Nip,")){
Datos[i]=Nip();
}
}

switch (Datos.length) {
case 1:
if (Datos[0]!=null){
buffer.write(Datos[0]);
buffer.newLine();
}else{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));
}
break;
case 2:
if(Datos[0]!=null&&Datos[1]!=null){
buffer.write(Datos[0]+Separador+Datos[1]);
buffer.newLine();
}else{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));
}
break;
case 3:
if(Datos[0]!=null && Datos[1]!=null && Datos[2]!=null){    
buffer.write(Datos[0]+Separador+Datos[1]+Separador+Datos[2]);
buffer.newLine();
}else{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));
}
break;
case 4:
if(Datos[0]!=null && Datos[1] !=null &&Datos[2]!=null&&Datos[3]!=null){
buffer.write(Datos[0]+Separador+Datos[1]+Separador+Datos[2]+Separador+Datos[3]);
buffer.newLine();
}else{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));
}
break;
case 5:
if (Datos[0]!=null && Datos[1]!=null&&Datos[2]!=null&&Datos[3]!=null&&Datos[4]!=null){    
buffer.write(Datos[0]+Separador+Datos[1]+Separador+Datos[2]+Separador+Datos[3]+Separador+Datos[4]);
buffer.newLine();
}else{
NombreH=new BufferedReader(new FileReader("NombresH.txt"));
NombreM=new BufferedReader(new FileReader("NombresM.txt"));
NombreHM=new BufferedReader(new FileReader("NombresH&M.txt"));
Apellido=new BufferedReader(new FileReader("Apellidos.txt"));
}
break;
default:
break;
}
contador++;
}

buffer.close();



}

 
/*public void NombresH(int cantidad)throws IOException{
int contador=0;
String dato =NombresH.readLine();

while(contador!=cantidad){
buffer.write(dato);
buffer.newLine();
dato=NombresH.readLine();
contador++;
}
}*/
public String Nip(){
int n=(int)(Math.random()*5000)+1000;
String nip=String.valueOf(n);
return nip;
}
public String Correo(String nombre){
String dato="";
String ABC="";
int cont=0;
int numero=(int)(Math.random()*10)+1;
int complemento= (int)(Math.random()*100)+1;


if (numero>1 && numero <5){
dato =nombre+complemento+"@gmail.com";
}else{
while(cont!=10){
int a=(int)(Math.random()*26);
ABC+=Abc[a];
cont++;
}
dato=ABC+"@gmail.com";
}
return dato;
}
public String NombresM()throws IOException{
String dato =NombreM.readLine();
 return dato;
}
public String NombresH()throws IOException{
String dato =NombreH.readLine();
return dato;
}
public String NombreHM()throws IOException{
String dato=NombreHM.readLine();
return dato;
}
public String Apellidos()throws IOException{
String dato =Apellido.readLine();
return dato;
}
public void Llenar1(String dato,String Sep)throws IOException{
buffer.write(dato+Sep);
buffer.newLine();
}



    
}
