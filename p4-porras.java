////Anthony Porras - Project 4 - Array of integers.

String title = "Project 4 - Array of Integers";
String help= "Press key with first letter of a function ('?' for help; 'q' to quit)";
String author = "Anthony Porras";

int[] z= {545, 29, 1021, 54, 68, 711, 38, 90, 246, 74, 360};
int many= z.length;

void setup() {
  size(600, 400);
}

void draw() {
  background(191, 94, 252);
  if(keyPressed && key == '?') { help(); return; }
  fill(4, 51, 124);
  textSize(15);
  int then=18;
  
  //Display the numbers.
  float x=40, y=40;
  for (int u=0; u<many; u++) {
    text( z[u], x, y);
    y += then;                //Next line.
  }
  
  //Skip a line and display total and average.
  y += then;
  int total= sum(z, many);
  float average= float(total) / many;
  text("The total is:       "+total, 100, y);
  y += then;
  text("The average is:     "+average, 100, y);
  
  //Title, help and author.
  textSize(15);
  text(title, width/4, 20);
  textSize(15);
  text(help, width/4, 40);
  textSize(10);
  text(author, 20, height-20);
}

void help() {
  String s="";
  s += "\n r    randomize";
  s += "\n b    big";
  s += "\n s    small";
  s += "\n o    order";
  s += "\n";
  s += "\n i    inc";
  s += "\n d    dec";
  s += "\n t    triple";
  s += "\n q    quit";
  
  text(s, 50, 50);
}

//Return the sum total
int sum(int b[], int g) {
  int result=0;
  for (int u=0; u<g; u++) {
    result += b[u];
  }
  return result;
}

void keyPressed() {
  if (key == 'q') exit();
  else if (key == 'r') randomize(z, many);
  else if (key == 'b') big(z, many);
  else if (key == 's') small(z, many);
  else if (key == 'o') order(z, many);
  //
  else if (key == 'i') inc(z, many);
  else if (key == 'd') dec(z, many);
  else if (key == 't') triple(z, many);
  else if (key == '?') help();
  else text("No Such Function:  "+key, width/2, height/2);
}

void big( int a[], int m ) {
  //Move biggest number to end of the array.
  //(Swap array elements, to keep all numbers.)
  int w=0;  
  for (int u=0; u < m; u++) {
    if (a[u] > a[w]) w=u;
  }
  swap(a, w, m-1);
}
void swap(int p[], int a, int b ) {
  //Switch p[a] with p[b]
  int tmp=  p[a];
  p[a]=  p[b];
  p[b]=  tmp;
}

void small( int b[], int m ) {
  //Move smallest number to beginning of the array. 
  //(Swap, to keep all numbers.)
  int w=0;
  for (int u=1; u<many; u++) {
    if (b[u] < b[w]) w=u;
  }
  swap( b, w, 0 );
}

void inc( int d[], int m ) {
  //Increase each of the numbers by one.
  for (int u=0; u<m; u++) {
    d[u]++;
  }
}

void dec( int a[], int m ) {
  //Decrease each of the numbers by one.
 for (int u=0; u<m; u++) {
    a[u]--;
  }
}

void triple( int a[], int m ) {
  //Triple each of the numbers.
 for (int u=0; u<m; u++) {
    a[u] *= 3;
  }
}
void randomize( int p[], int k ) {
  //Replace all numbers of random values.
 for (int u=0; u<k; u++) {
    p[u]=  int( random( 0, 1000 ) );
  }
}

// Sort entire array. //
void order( int q[], int m ) {
  for (int k=m; k>1; k--) {
    big( q, k );
  }
}



  
  
