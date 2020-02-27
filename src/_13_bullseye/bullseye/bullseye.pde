void setup(){
  size(600, 600);
 
}
void draw(){
 for (int j = 8; j > 0; j--) {
   if(j % 2 == 0){
     fill(#000000);   
   }
   else{
     fill(#FF0303);
   }
    ellipse(300, 300, 50*j, 50*j);
 }
  


}
        
