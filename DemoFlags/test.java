import java.awt.Color;


public class test {
   public static final int YELLOW = new Color(250,201,20).getRGB();
   public static final int BLUE = new Color(17,13,99).getRGB();
   public static final int RED = new Color(196,0,15).getRGB();
   public static final int BLACK = new Color(5,5,5).getRGB();
   public static final int WHITE = new Color (255,255,255).getRGB();
   public static final int GREEN = new Color(35,138,51).getRGB();
    public static void main(String[] args) {
     
           int height = 12; 
           int width = 20;
          /* int [][] x = banderaCol(height, width);
           int [][] y = banderaVEN(height, width);
           int [][] Z = banderaPOL(height, width);*/ //se supone que así  se llama a una funcion pero en este caso no 
           //es necesario porque ya la estamos llamando abajo al imprimirla
           JOptionPaneArrays.showColorArray2D(null, banderaCol(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaVEN(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaPOL(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaPAN(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaCHL(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaEEUU(height, width));
           JOptionPaneArrays.showColorArray2D(null, banderaCZE(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaDNK(height, width));
           JOptionPaneArrays.showColorArray2D(null, banderaFIN(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaNOR(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaKWT(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaZAF(height, width)); 
           JOptionPaneArrays.showColorArray2D(null, banderaCHE(height, width)); 
        }

    public static int [][] banderaCol(int height, int width){ 

        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;
        //parte amarilla

        rowIni = (height*0)/4; 
        rowEnd = (height*2)/4;
        colIni = (width*0)/1; 
        colEnd = (width*1)/1;

        for (int r = rowIni; r<rowEnd; r++)
         for (int c = colIni; c<colEnd; c++){
            flag [r][c] = YELLOW;
         } 
      // AZUL
         rowIni = (height*2)/4; 
         rowEnd = (height*3)/4;
         for (int r = rowIni; r<rowEnd; r++)
         for (int c = colIni; c<colEnd; c++){
            flag [r][c] = BLUE;
         } 
        
     //ROJO 
     rowIni = (height*3)/4; 
     rowEnd = (height*4)/4;
     for (int r = rowIni; r<rowEnd; r++)
     for (int c = colIni; c<colEnd; c++){
        flag [r][c] = RED;
     }    
         
    return flag;

    }

    //BANDERA VEN

    public static int [][] banderaVEN(int height, int width){ 
      int[][] flag = new int[height][width];
      int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;

    //parte amarilla
      rowIni = (height*0)/3; 
      rowEnd = (height*1)/3;
      colIni = (width*0)/1; 
      colEnd = (width*1)/1;

      for (int r = rowIni; r<rowEnd; r++)
       for (int c = colIni; c<colEnd; c++){
          flag [r][c] = YELLOW;
       } 
    // AZUL
       rowIni = (height*1)/3; 
       rowEnd = (height*2)/3;
       for (int r = rowIni; r<rowEnd; r++)
       for (int c = colIni; c<colEnd; c++){
          flag [r][c] = BLUE;
       } 
      
   //ROJO 
   rowIni = (height*2)/3; 
   rowEnd = (height*3)/3;
   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = RED;
   }    
       
  return flag;

  }

  
  //BANDERA POLONIA

  public static int [][] banderaPOL(int height, int width){ 
   int[][] flag = new int[height][width];
   int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;

 //parte blanca
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*0)/1; 
   colEnd = (width*1)/1;

   for (int r = rowIni; r<rowEnd; r++)
    for (int c = colIni; c<colEnd; c++){
       flag [r][c] = WHITE;
    } 
 // ROJO
    rowIni = (height*1)/2; 
    rowEnd = (height*2)/2;
    for (int r = rowIni; r<rowEnd; r++)
    for (int c = colIni; c<colEnd; c++){
       flag [r][c] = RED;
    }    
    
return flag;

}

//BANDERA PAN

public static int [][] banderaPAN(int height, int width){ 
   int[][] flag = new int[height][width];
   int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;

   //PARTE BLANCA
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*0)/2; 
   colEnd = (width*1)/2; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = WHITE;
   } 


   //PARTE ROJA
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*1)/2; 
   colEnd = (width*2)/2; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = RED;
   } 
   
   //PARTE Azul
   rowIni = (height*1)/2; 
   rowEnd = (height*2)/2;
   colIni = (width*0)/2; 
   colEnd = (width*1)/2; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = BLUE;
   } 

   //PARTE BLANCA
   rowIni = (height*1)/2; 
   rowEnd = (height*2)/2;
   colIni = (width*1)/2; 
   colEnd = (width*2)/2; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = WHITE;
   } 

   return flag; 

}

//BANDERA CHL

public static int [][] banderaCHL(int height, int width){ 
   int[][] flag = new int[height][width];
   int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;

   //PARTE AZUL
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*0)/20; 
   colEnd = (width*6)/20; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = BLUE;
   }

   //PARTE BLANCA
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*6)/20; 
   colEnd = (width*20)/20; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = WHITE;
   }

   //PARTE ROJA
   rowIni = (height*1)/2; 
   rowEnd = (height*2)/2;
   colIni = (width*0)/20; 
   colEnd = (width*20)/20; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = RED;
   }
   return flag;  
}

//BANDERA EEUU

public static int [][] banderaEEUU(int height, int width){ 
   int[][] flag = new int[height][width];
   int rowIni = 0, rowEnd =0, colIni = 0, colEnd = 0;


   //PARTE BLANCA
   for (int i = 0; i < height; i++) { //bucle hasta llegar a 20
      if (i % 2 == 0) {
          // Franjas blancas
          for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
              flag[i][c] = RED;
          }
      } else {
          // Franjas rojas
          for (int c = 0; c < width; c++) {
              flag[i][c] = WHITE;
          }
      }
  }
       
        //PARTE AZUL
   rowIni = (height*0)/2; 
   rowEnd = (height*1)/2;
   colIni = (width*0)/20; 
   colEnd = (width*6)/20; 

   for (int r = rowIni; r<rowEnd; r++)
   for (int c = colIni; c<colEnd; c++){
      flag [r][c] = BLUE;
   }
           return flag; 
      }

//BANDERA CZE

public static int [][] banderaCZE(int height, int width){ 
   int[][] flag = new int[height][width];
  

   int ix = 0;
   //PARTE BLANCA
   for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
      if (i < height/2) {
          // Franjas blancas
          for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
              flag[i][c] = WHITE;
          }
      } else {
          // Franjas rojas
          for (int c = 0; c < width; c++) {
              flag[i][c] = RED;
          }
      }

     
  }
 
  for (int i = 0; i < height; i++) { 
   
  
  if (i < 6){
   ix ++;
   for (int c = 0; c < ix; c++) {
      flag[i][c] = BLUE;
      
  } 
  } 
  else {
   ix--;
    for (int c = 0; c <= ix; c++) {
     
      flag[i][c] = BLUE;
       
   } 
  }

}


      return flag; 
      }      
     
  
//BANDERA DNK

public static int [][] banderaDNK(int height, int width){ 
   int[][] flag = new int[height][width];
  
   for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
      
          
          for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
            //columanas 5 y 6 blancas
            if(c == 5 || c == 6){
            flag[i][c] = WHITE;
         } else {
            //PARTE ROJA
            flag[i][c] = RED;
           
        }   // filas 5 y 6 blancas
            if (i == 5 || i == 6) {
               flag[i][c] = WHITE;  
            } 

          }
    

     
  }
  return flag;
   }

   //BANDERA FIN

   public static int [][] banderaFIN(int height, int width){ 
      int[][] flag = new int[height][width];
     
      for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
         
             
             for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
               //columanas 5 y 6 blancas
               if(c >= 4 && c <= 7){
               flag[i][c] = BLUE;
            } else {
               //PARTE ROJA
               flag[i][c] = WHITE;
              
           }   // filas 5 y 6 blancas
               if (i >= 4 && i <= 7) {
                  flag[i][c] = BLUE;  
               } 
   
             }
        
     }
     return flag;
      }

         //BANDERA NOR

   public static int [][] banderaNOR(int height, int width){ 
      int[][] flag = new int[height][width];
     
      for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
         
             
             for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
               //columanas 5 y 6 blancas
               if (c == 4 || c == 7) {
                  flag[i][c] = WHITE;
              } else if (c == 5 || c == 6) {
                  flag[i][c] = BLUE;
              }else {
               //PARTE ROJA
               flag[i][c] = RED;
              
           }   // filas 5 y 6 blancas
               if (i >= 4 && c != 5 && i <= 7 && c != 6) {
                  flag[i][c] = WHITE;
                 
               } if (i == 5 || i ==6){
                  flag[i][c] = BLUE;
               }  
              
   
             }
        
     }
     return flag;
      }

//BANDERA KWT

public static int [][] banderaKWT(int height, int width){ 
   int[][] flag = new int[height][width];
  

   int ix = 0;
   //PARTE BLANCA
   for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
      if (i < height/3) {
          // Franjas blancas
          for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
              flag[i][c] = GREEN;
          } 
      }else if (i < height*2/3) {
         for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
            flag[i][c] = WHITE;
       } 
      } else {
          // Franjas rojas
          for (int c = 0; c < width; c++) {
              flag[i][c] = RED;
          }
      }

     
  }
 
  for (int i = 0; i < height; i++) { 
   
  
  if (i < 6){
   ix ++;
   for (int c = 0; c < ix; c++) {
      flag[i][c] = BLACK;
      
  } 
  } 
  else {
   ix--;
    for (int c = 0; c <= ix; c++) {
     
      flag[i][c] = BLACK;
       
   } 
  }

}


      return flag; 
      }      
     
  //BANDERA ZAF

public static int [][] banderaZAF(int height, int width){ 
   int[][] flag = new int[height][width];
  

   int ix = 1;
   //PARTE BLANCA
   for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
      if (i < height/3) {
          // Franjas blancas
          for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
              flag[i][c] = RED;
          } 
      }else if (i < height*2/3) {
         for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
            flag[i][c] = WHITE;
            if (i >= 5 && i <= 6) { //Anidado para hacer la linea verde del medio
               flag[i][c] = GREEN;
             }
       } 
      } else {
          // Franjas rojas
          for (int c = 0; c < width; c++) {
              flag[i][c] = BLUE;
          }
      }

     
  }
 
  for (int i = 0; i < height; i++) { 
   
  //PARTE SUPERIOR DEL TRIANGULO
  if (i < 6){
   ix ++;
   for (int c = 0; c < ix; c++) {
      flag[i][c] = GREEN;
      if (c == ix-1 && c != 6) { //Anidado para hacer las últimas lineas blancas
         flag[i][c] = WHITE;
       }
  } 
  }
  //PARTE INFERIOR DEL TRIANGULO
  else {
   ix--;
    for (int c = 0; c <= ix; c++) {
     
      flag[i][c] = GREEN;
      if (c == ix && c != 6) { //Anidado para hacer las últimas lineas blancas
         flag[i][c] = WHITE;
       }
       
   } 
  }

}


  //La otra parte que va dentro
  int ij = 0;

  for (int i = 0; i < height; i++){
  
  if (i < 6 && i > 1  ) {
   ij ++;
   for (int c = 0; c < ij && c < 4; c++) {
      flag[i][c] = BLACK;
      if (c == ij-1 || c == 0 && i == 2 || c == 4) { //Anidado para hacer las últimas lineas amarillas
         flag[i][c] = YELLOW;
       }
  } 
  }else if (i > 5 && i < 10) {
   for (int c = 0; c < ij && c < 4; c++) {
      flag[i][c] = BLACK;
      if (c == ij-1 || c == 0 && i == 2 || c == 4) { //Anidado para hacer las últimas lineas amarillas
         flag[i][c] = YELLOW;
       }
  }ij --;
  }
   
  
}

      return flag; 
      }


      //BANDERA CHE

   public static int [][] banderaCHE(int height, int width){ 
      int[][] flag = new int[height][width];
     
      for (int i = 0; i < height; i++) { //bucle hasta llegar a 12
         
             
             for (int c = 0; c < width; c++) { //i es la fila y c la columna que en este bucle empieza en 0 y termina en 20
               //columanas 5 y 6 blancas
               if(i != 0 && i != 11 && c >= 8 && c <= 11){
               flag[i][c] = WHITE;
            } else {
               //PARTE ROJA
               flag[i][c] = RED;
              
           }   // filas 5 y 6 blancas
               if (c >= 5 && c <= 14 && i >= 4 && i <= 7) {
                  flag[i][c] = WHITE;  
               } 
   
             }
        
     }
     return flag;
      }
   
}





   

