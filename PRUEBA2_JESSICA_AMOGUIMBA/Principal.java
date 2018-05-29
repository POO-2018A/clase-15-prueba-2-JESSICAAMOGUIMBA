
package estudiantes;

import java.util.*;


public class Principal {
    
     public static void main(String[] args) {
         
         System.out.println("\t\t INFORMACION DE UN GRUPO DE ESTUDIANTES");
       //INGRESO DEL NOMBRE DE LOS ESTUDIANTES
       Estudiante[] estudiantes = new Estudiante[5];
      
      Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor Ingrese el nombre de cada estudiante");
        for (int i = 0; i < estudiantes.length; i++) {
        String Estudiante = scan.nextLine();
             
         }
        
      //INGRESO DE LAS EDADES DE LOS ESTUDIANTES  
        Estudiante[] edad = new Estudiante[5];
        Scanner ed = new Scanner(System.in);
        System.out.println("Porfavor Ingrese las edades de cada estudiante");
        for (int i = 0; i < edad.length; i++) {
           int Edad = scan.nextInt();
        }
        
        //NOMBRE DE LAS MATERIAS (SOLO 2)
        Estudiante[] materias = new Estudiante[2];
        Scanner m = new Scanner(System.in);
        System.out.println("Porfavor Ingrese las materias");
         for (int i = 0; i < materias.length; i++) {
             String materia = scan.next();   
             
         }
         
//         String[] materia  = {"nive2"};
//           
//        estudiantes[0].setMaterias(materia);
//        estudiantes[1].setMaterias(materia);
//        estudiantes[2].setMaterias(materia);
//        estudiantes[3].setMaterias(materia);
//        estudiantes[4].setMaterias(materia);  
         
        int materia1 = 0;
        int materia2 = 0;
        int materia3 = 0;
        int materia4 = 0;
        int materia5 = 0;
        
        System.out.println("\t\t INFORMACIÓN ESTUDIANTES");
        
      /*  for(int i=0;i<5;i++){
            
         String [] materiasEstudiante = estudiantes[i].getMaterias();
         System.out.print("\n");
         System.out.println(" ## Estudiante "+ (i+1));
         System.out.println(" Nombre Completo = " + estudiantes[i].getNombre());
         System.out.println(" Materias : ");
        for(int j=0;j <materiasEstudiante.length;j++){
            System.out.println(" "+ (j+1) +". " + materiasEstudiante[j]);
                if(materiasEstudiante[j]=="m1"){
                    materia1 = materia1 +1;
                }else if(materiasEstudiante[j]=="m2"){
                    materia2 = materia2 +1;
                }else if(materiasEstudiante[j]=="m3"){
                    materia3 = materia3 +1;
                }else if(materiasEstudiante[j]=="m4"){
                    materia4 = materia4 +1;
                }else if(materiasEstudiante[j]=="m5"){
                    materia5 = materia5 +1;
                }
            }
        }*/
         }
    
}